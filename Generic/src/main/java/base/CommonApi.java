package base;

import Report.ExtentManager;
import Report.ExtentTestManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonApi {
    public WebDriver driver = null;
   public static ExtentReports extent;
//    public static Logger logger = Logger.getLogger(CommonApi.class);

@BeforeSuite
public void extentSetup(ITestContext context) {
    ExtentManager.setOutputDirectory(context);
    extent = ExtentManager.getInstance();
}
    @BeforeMethod
    public void startExtent(Method method) {
        String className = method.getDeclaringClass().getSimpleName();
        String methodName = method.getName().toLowerCase();
        ExtentTestManager.startTest(method.getName());
        ExtentTestManager.getTest().assignCategory(className);
    }
    protected String getStackTrace(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString();
    }
    @AfterMethod
    public void afterEachTestMethod(ITestResult result) {
        ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis()));
        ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getEndMillis()));

        for (String group : result.getMethod().getGroups()) {
            ExtentTestManager.getTest().assignCategory(group);
        }

        if (result.getStatus() == 1) {
            ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");
        } else if (result.getStatus() == 2) {
            ExtentTestManager.getTest().log(LogStatus.FAIL, getStackTrace(result.getThrowable()));
        } else if (result.getStatus() == 3) {
            ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
        }
        ExtentTestManager.endTest();
        extent.flush();
        if (result.getStatus() == ITestResult.FAILURE) {
            captureScreenshot(driver, result.getName());
        }
        driver.quit();
    }
    @AfterSuite
    public void generateReport() {
        extent.close();
    }
    public Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }

    @Parameters({"useCloudEnv","userName","key","OS","browser","browserVersion","url"})
    @BeforeMethod
    public void setUp(@Optional("false")Boolean useCloudEnv, @Optional("joynabaminadib") String userName,@Optional("a9127a33-4076-4273-8976-1941775c3a1f")
            String key, @Optional("Windows 10")String OS,@Optional("firefox") String browser,
                      @Optional("64.0") String browserVersion, @Optional("http://www.americanexpress.com") String url)throws IOException {
         if(useCloudEnv == true){
            //run on cloud
//            logger.setLevel(Level.INFO);
//            logger.info("Test is running on cloud env");
            getCloudDriver(userName,key,OS,browser,browserVersion);
            System.out.println("Tests is running on Saucelabs, please wait for result");

        }else{
            //run on local
//            logger.setLevel(Level.INFO);
//            logger.info("Test is running on local env");
            getLocalDriver(OS,browser,browserVersion);
             System.out.println("Test is running on local environment");
        }

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }
        //driver.manage().window().maximize();

    //driver to run on local
    public WebDriver getLocalDriver(String OS, String browser, String browserVersion) {
        if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\adibi\\Desktop\\nayna\\Team_Automation2018\\Generic\\selenium-browser-driver\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\adibi\\Desktop\\nayna\\Team_Automation2018\\Generic\\selenium-browser-driver\\chromedriver.exe");
            driver = new ChromeDriver();
        }
         else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "Generic\\selenium-browser-driver\\IEDriverServer.exe");

            driver = new InternetExplorerDriver();
        } else if (browser.equalsIgnoreCase("safari")) {
            driver = new SafariDriver();
        }

        return driver;
    }
    public WebDriver getCloudDriver(String userName,String key,
                                    String OS,String browser,String browserVersion)throws IOException{
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platform", "Windows 10");
        cap.setBrowserName(browser);
        cap.setCapability("version",browserVersion);
        cap.setCapability("name","amextest");
        cap.setCapability("extendeddebugging","true");
        cap.setCapability("build","3.0");
        this.driver = new RemoteWebDriver(new URL("http://"+userName+":"+key+"@ondemand.saucelabs.com:80/wd/hub"), cap);

        return driver;
    }
    /*@AfterMethod
    public void cleanUp() {
        driver.close();
    }*/

    //Helping methods
    public void clickByCss(String locator) {
        driver.findElement(By.cssSelector(locator)).click();
    }

    public void clickByXpath(String locator) {
        driver.findElement(By.xpath(locator)).click();
    }

    public void clickById(String locator) {
        driver.findElement(By.id(locator)).click();
    }

    public void clickByName(String locator) {
        driver.findElement(By.id(locator)).click();
    }

    public void typeByCss(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
    }
    public void typeByXpath(String locator, String value) {

        driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);

    }
    public void keysInput(String locator) {
        driver.findElement(By.cssSelector(locator)).sendKeys(Keys.ENTER);
    }

    public void typeByCssThenEnter(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(Keys.CLEAR, value, Keys.ENTER);
    }

    public void clearInput(String locator) {
        driver.findElement(By.cssSelector(locator)).clear();
    }

    public void navigateBack() {
        driver.navigate().back();
    }

    public void navigateForward() {
        driver.navigate().forward();
    }

    public void mouseHoverByCSS(String locator) {
        try {
            WebElement element = driver.findElement(By.cssSelector(locator));
            Actions action = new Actions(driver);
            Actions hover = action.moveToElement(element);
        } catch (Exception ex) {
            System.out.println("First attempt has been done, This is second try");
            WebElement element = driver.findElement(By.cssSelector(locator));
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();

        }

    }

    public String getTextByCss(String locator) {
        String st = driver.findElement(By.cssSelector(locator)).getText();

        return st;
    }

    public String getTextByXpath(String locator) {
        String st = driver.findElement(By.xpath(locator)).getText();

        return st;
    }

    public String getTextById(String locator) {
        return driver.findElement(By.id(locator)).getText();

    }
    public void typeAndEnterByCss(String locator, String value){
        driver.findElement(By.cssSelector(locator)).clear();
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
    }

    public String getTextByName(String locator) {
        String st = driver.findElement(By.name(locator)).getText();

        return st;
    }

    public WebElement getWebElementByCss(String locator) {
        return driver.findElement(By.cssSelector(locator));

    }

    public List<WebElement> getWebElementsByCss(String locator) {
        List<WebElement> elementList = new ArrayList<WebElement>();
        elementList = driver.findElements(By.cssSelector(locator));

        return elementList;
    }

    public WebElement getWebElementByXpath(String locator) {
        WebElement element = driver.findElement(By.xpath(locator));

        return element;
    }
    public String getTextByWebElement(WebElement webElement){
        String text = webElement.getText();
        return text;
    }
    public void inputValueInTextBoxByWebElement(WebElement webElement, String value){

        webElement.sendKeys(value + Keys.ENTER);

    }
    public void clearInputBox(WebElement webElement){
        webElement.clear();
    }

    //constant sleep time
    public void sleepFor(int sec) throws InterruptedException {
        Thread.sleep(1000 * sec);
    }

    //Synchronization
    public void waitUntilClickAble(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void waitUntilVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitUntilSelectable(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        boolean element = wait.until(ExpectedConditions.elementToBeSelected(locator));
    }

    //get WebElements
    public List<WebElement> getWebElements(String locator) {
        List<WebElement> elements = driver.findElements(By.cssSelector(locator));
        return elements;
    }

    //get texts
    public List<String> getElementTexts(String locator) {
        List<String> texts = new ArrayList<String>();
        List<WebElement> element = new ArrayList<WebElement>();
        element = getWebElements(locator);
        for (WebElement st : element) {
            texts.add(st.getText());
        }
        return texts;
    }

    public void mouseHoverByXpath(String locator) {
        try {
            WebElement element = driver.findElement(By.xpath(locator));
            Actions action = new Actions(driver);
            Actions hover = action.moveToElement(element);
        } catch (Exception ex) {
            System.out.println("First attempt has been done, This is second try");
            WebElement element = driver.findElement(By.cssSelector(locator));
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();

        }

    }

    //handling Alert
    public void okAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void cancelAlert() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    //iFrame Handle
    public void iframeHandle(WebElement element) {
        driver.switchTo().frame(element);
    }

    public void goBackToHomeWindow() {
        driver.switchTo().defaultContent();
    }

    //get Links
    public void getLinks(String locator) {
        driver.findElement(By.linkText(locator)).findElement(By.tagName("a")).getText();
    }

    //Taking Screen shots
    public void takeScreenShot() throws IOException {
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("screenShots.png"));
    }

    //upload a file/image
    public void upLoad(String locator, String filePath) {
        WebElement element = driver.findElement(By.cssSelector(locator));
        element.sendKeys(filePath);

    }


    public static void captureScreenshot(WebDriver driver, String screenshotName){
        DateFormat df = new SimpleDateFormat("(MM.dd.yyyy-HH:mma)");
        Date date = new Date();
        df.format(date);

        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File(System.getProperty("user.dir")+ "/screenshots/"+screenshotName+" "+df.format(date)+".png"));
            System.out.println("Screenshot captured");
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot "+e.getMessage());;
        }

    }
    public static String convertToString(String st){
        String splitString ;
        splitString = StringUtils.join(StringUtils.splitByCharacterTypeCamelCase(st), ' ');
        return splitString;
    }
    public List<String> getListOfString(List<WebElement> list) {
        List<String> items = new ArrayList<String>();
        for (WebElement element : list) {
            items.add(element.getText());
        }
        return items;
    }
    public List<WebElement> getListOfWebElementsById(String locator) {
        List<WebElement> list = new ArrayList<WebElement>();
        list = driver.findElements(By.id(locator));
        return list;
    }
    public List<String> getTextFromWebElements(String locator){
        List<WebElement> element = new ArrayList<WebElement>();
        List<String> text = new ArrayList<String>();
        element = driver.findElements(By.cssSelector(locator));
        for(WebElement web:element){
            String st = web.getText();
            text.add(st);
        }

        return text;
    }
    public List<WebElement> getListOfWebElementsByCss(String locator) {
        List<WebElement> list = new ArrayList<WebElement>();
        list = driver.findElements(By.cssSelector(locator));
        return list;
    }
    public List<WebElement> getListOfWebElementsByXpath(String locator) {
        List<WebElement> list = new ArrayList<WebElement>();
        list = driver.findElements(By.xpath(locator));
        return list;
    }
    public String  getCurrentPageUrl(){
        String url = driver.getCurrentUrl();
        return url;
    }
    public void brokenLink() throws IOException {
        //Step:1-->Get the list of all the links and images
        List<WebElement> linkslist = driver.findElements(By.tagName("a"));
        linkslist.addAll(driver.findElements(By.tagName("img")));

        System.out.println("Total number of links and images--------->>> "+ linkslist.size());

        List<WebElement> activeLinks = new ArrayList<WebElement>();
        //Step:2-->Iterate linksList: exclude all links/images which does not have any href attribute
        for(int i=0; i<linkslist.size(); i++){
            //System.out.println(linkslist.get(i).getAttribute("href"));
            if(linkslist.get(i).getAttribute("href") !=null && ( ! linkslist.get(i).getAttribute("href").contains("javascript") && ( ! linkslist.get(i).getAttribute("href").contains("mailto")))){
                activeLinks.add(linkslist.get(i));
            }

        }
        System.out.println("Total number of active links and images-------->>> "+ activeLinks.size());

        //Step:3--> Check the href url, with http connection api
        for(int j=0; j<activeLinks.size(); j++){

            HttpURLConnection connection = (HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();

            connection.connect();
            String response = connection.getResponseMessage();
            connection.disconnect();
            System.out.println(activeLinks.get(j).getAttribute("href")+"--------->>> "+response);

        }

    }
}