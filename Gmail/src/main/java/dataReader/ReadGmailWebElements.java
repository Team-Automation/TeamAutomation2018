package dataReader;

import base.CommonApi;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.How;
        import org.openqa.selenium.support.PageFactory;
        import reader.Readxls;

        import java.util.ArrayList;
        import java.util.List;

public class ReadGmailWebElements extends CommonApi {
    @FindBy(xpath = "//input[@id='identifierId']")
    public static WebElement loginUsername;
    @FindBy(xpath = "//input[@name='password']")
    public static WebElement loginPassword;
    @FindBy(css = ".T-I.J-J5-Ji.T-I-KE.L3")
    public static WebElement composeButton;
    @FindBy(xpath = "//*[@id=':px']")
    public static WebElement recipientEmail;
    @FindBy(xpath = "//*[@id=':pf']")
    public static WebElement emailSubject;
    @FindBy(xpath = "//*[@id=':qk']")
    public static WebElement emailBody;
    @FindBy(xpath = "//*[@id=':p5']")
    public static WebElement sendButton;
    @FindBy(xpath = "//a[contains(text(),'Help')]")
    public static WebElement helpOption;
    @FindBy(xpath = "//section[@class='primary-container']//section[1]//h2[1]//*[2]")
    public static WebElement popularArticles;
    @FindBy(xpath = "/html/body/div[2]/div/section/div/div/article/nav/section[1]/div/div/div[1]/a")
    public static WebElement createGoogleAccount;
    @FindBy(xpath = "//h3[@class='zippy index1 goog-zippy-expanded']")
    public static WebElement checkGoogleAccount;
    @FindBy(xpath = "//a[contains(text(),'enter your email address')]")
    public static WebElement checkGoogleAccountEnterEmail;
    @FindBy(xpath = "//input[@id='identifierId']")
    public static WebElement enterYourEmailAddress;
    @FindBy(id = "identifierId")
    public static WebElement recoverAccount;
    @FindBy (xpath = "//a[contains(text(),'Create a strong password & a more secure account')]")
    public static WebElement createStrongPassword;
    @FindBy (xpath = "//a[@class='zippy index1 goog-zippy-collapsed']")
    public static WebElement makeYourPasswordUnique;
    @FindBy (xpath = "//a[contains(text(),'use a tool to manage your saved passwords')]")
    public static WebElement manageYourSavedPasswords;
    @FindBy(xpath = "//a[contains(text(),'Verify your account')]")
    public static WebElement verifyYourAccount;
    @FindBy (xpath = "//a[contains(text(),'Control what others see about you across Google se')]")
    public static WebElement controlWhatOthersSeeAboutYouAcrossGoogleSearch;
    @FindBy(xpath = "//h3[@class='zippy index1 goog-zippy-collapsed']")
    public static WebElement whatInfoCanBeShared;
    @FindBy(xpath = "//h3[@class='zippy index2 goog-zippy-expanded']")
    public static WebElement whereThisInfoShowsUp;
    @FindBy(xpath = "//h3[@class='zippy index3 goog-zippy-collapsed']")
    public static WebElement previewWhatYourInfoLooksLikeToOthers;
    @FindBy (xpath = "//a[contains(text(),'Someone changed your password')]")
    public static WebElement someoneChangedYourPassword;
    @FindBy (xpath = "//a[contains(text(),'recover your account')]")
    public static WebElement recoverYourAccount;
    @FindBy (xpath = "/html/body/div[2]/header/div[4]/div/div/div/div/span/a/span")
    public static WebElement googleAccount;
    @FindBy(xpath = "//*[@id=\"gb\"]/div[2]/div[1]/div[1]/svg/path")
    public static WebElement viewBox;
    @FindBy(xpath = "//*[@class='gb_mf']")
    public static WebElement googleAppsViewBox;
    @FindBy (xpath = "//*[@id='gb192']/span[1]")
    public static WebElement userAccount;
    @FindBy (xpath = "//div[@class='GiKO7c'][contains(text(),'Home')]")
    public static WebElement homeGoogleAccount;
    @FindBy (xpath = "//div[contains(text(),'Get started')]")
    public static WebElement getstarted;
    @FindBy(xpath = "//*[@id=\":kh\"]/div/div[2]/span/a")
    public static WebElement starred;
    @FindBy(xpath = "//div[@class='asa']")
    public static WebElement emailSettings;
    @FindBy(xpath = "//div[contains(text(),'Themes')]")
    public static WebElement settingsThemes;
    @FindBy(xpath = "//div[@id=':14x.custom-6']//div[@class='a7U']")
    public static WebElement themes;

    public List webElementList(){
        List<WebElement> webElements = new ArrayList<>();
        webElements.add(loginUsername);
        webElements.add(loginPassword);
        webElements.add(composeButton);
        webElements.add(recipientEmail);
        webElements.add(emailSubject);
        webElements.add(emailBody);

        List<String> list = new ArrayList<>();
        for (int i = 0; i<webElements.size();i++){
            list.add(webElements.get(i).getText());
        }
        System.out.println(list);
        return list;
    }
    public List webElementList1(){
        List<WebElement> webElements1 = new ArrayList<>();
        webElements1.add(helpOption);
        webElements1.add(createGoogleAccount);
        webElements1.add(checkGoogleAccount);
        webElements1.add (checkGoogleAccountEnterEmail);
        webElements1.add(enterYourEmailAddress);
        webElements1.add(recoverAccount);
        webElements1.add(googleAccount);

        List<String> list = new ArrayList<>();
        for (int i = 0; i<webElements1.size();i++){
            list.add(webElements1.get(i).getText());
        }
        System.out.println(list);
        return list;
    }
    //Readxls readxls = PageFactory.initElements(driver,Readxls.class);
    Readxls xlData = new Readxls("/Users/nazibahfariha/Downloads/TeamAutomation2018-master/Gmail/Data/Gmail.xlsx");

    public List expectedWebElement(){
        int rowcount = xlData.getRowCount("HomeReview your privacy setting");
        List<String> expect = new ArrayList<>();
        for(int i = 1; i <= rowcount; i++){
            expect.add(xlData.getCellData("HomeReview your privacy setting","HomeReview your privacy setting",i));
        }
        System.out.println(expect);
        return expect;
    }

    Readxls xlData1 = new Readxls("/Users/nazibahfariha/Downloads/TeamAutomation2018-master/Gmail/Data/Gmail.xlsx");
    public List expectedWebElement1(){
        int rowcount = xlData1.getRowCount("Payments & Sub");
        List<String> expect = new ArrayList<>();
        for(int i = 1; i <= rowcount; i++){
            expect.add(xlData1.getCellData("Payments & Sub","Payments & Sub",i));
        }
        System.out.println(expect);
        return expect;
    }
}