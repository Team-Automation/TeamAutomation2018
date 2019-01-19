package applicationBase;

import Report.TestLogger;
import base.CommonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;


public  class ApplicationPageBase extends CommonApi {
    /*
    * @author Ahmed Foysol Hasan
    * All commonly used helper methods should be created here
    *
    * */
    String pageUrl;



    //return status of link if it is enabled
    public static boolean isEnableStatus(WebDriver driver, WebElement web) {
        boolean en = web.isEnabled();
        return en;
    }
    public static void sendKeys(WebElement webElement, String webElementName, String keys){
        webElement.clear();
        TestLogger.log("Sending " + keys + " to " + webElementName);
        webElement.sendKeys(keys);
        TestLogger.log("Keys Sent to " + webElementName);
    }

    public static String getText(WebElement webElement, String webElementName){

        TestLogger.log("Getting Text from " + webElementName);
        String actualText =  webElement.getText();
        TestLogger.log("Actual text: " + actualText);

      return actualText;

    }
    public static void click(WebElement webElement, String webElementName){
        TestLogger.log("Click " + webElementName );
        webElement.click();
        TestLogger.log("Clicked " + webElementName);
    }
    public static Properties loadProperties() throws IOException {
        Properties prop = new Properties();
        File filepath = new File(System.getProperty("user.dir") +  "/src/test/resources/secret.properties");
        InputStream ism = new FileInputStream(filepath.getAbsoluteFile());
        prop.load(ism);
        ism.close();
        return prop;
    }

    //Helping Methods
    public void clickByCss(String locator) { driver.findElement(By.cssSelector(locator)).click(); }
    public void clickByLinkText(String locator) { driver.findElement(By.linkText(locator)).click(); }
    public void clickByXpath(String locator){ driver.findElement(By.xpath(locator)).click(); }
    public void clickById(String locator){
        driver.findElement(By.id(locator)).click();
    }
    public void clickByName(String locator){
        driver.findElement(By.id(locator)).click();
    }
    public void typeByCss(String locator, String value){ driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.CLEAR); }
    public void typeOnCss(String locator, String value){ driver.findElement(By.cssSelector(locator)).sendKeys(value); }
    public void typeOnXpath(String locator, String value){ driver.findElement(By.xpath(locator)).sendKeys(value); }
    public void typeOnClass(String locator, String value){ driver.findElement(By.className(locator)).sendKeys(value); }
    public void typeOnId(String locator, String value, Keys enter){ driver.findElement(By.id(locator)).sendKeys(value); }
    public void keysInput(String locator){
        driver.findElement(By.cssSelector(locator)).sendKeys(Keys.ENTER);
    }
    public void typeByCssThenEnter(String locator, String value){ driver.findElement(By.cssSelector(locator)).sendKeys(Keys.CLEAR, value, Keys.ENTER); }
    public void clearInput(String locator){
        driver.findElement(By.cssSelector(locator)).clear();
    }
    public void navigateBack(){
        driver.navigate().back();
    }
    public void navigateForward(){
        driver.navigate().forward();
    }
    public void mouseHoverByCSS(String locator){

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

    public String getTextByName(String locator) {
        String st = driver.findElement(By.name(locator)).getText();

        return st;
    }

    public WebElement getWebElementByCss(String locator) {
        return driver.findElement(By.cssSelector(locator));

    }

}
