package Pages;

import GmailAPI.GmailCommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends GmailCommonAPI {

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
    @FindBy(xpath = "//*[@id=\"gb\"]/div[2]/div[1]/div[1]/svg/path")
    public static WebElement viewBox;
    @FindBy(xpath = "//*[@class='gb_kf']")
    public static WebElement googleAppsViewBox;
    @FindBy (xpath = "//*[@id='gb192']/span[1]")
    public static WebElement userAccount;
    @FindBy(xpath = "//a[@id='gb1']//span[@class='gb_W']")
    public static WebElement googleSearch;
    @FindBy(xpath = "//a[@id='gb8']//span[@class='gb_W']")
    public static WebElement googleMaps;
    @FindBy(xpath = "//a[@id='gb36']//span[@class='gb_W']")
    public static WebElement youTube;
    @FindBy(xpath = "//a[@id='gb78']//span[@class='gb_W']")
    public static WebElement playStore;
    @FindBy(xpath = "//a[@id='gb5']//span[@class='gb_W']")
    public static WebElement googleNews;
    @FindBy(xpath = "//a[@id='gb53']//span[@class='gb_W']")
    public static WebElement googleContacts;
    @FindBy(xpath = "//a[@id='gb49']//span[@class='gb_W']")
    public static WebElement googleDrive;
    @FindBy(xpath = "//a[@id='gb24']//span[@class='gb_W']")
    public static WebElement googleCalender;
    @FindBy(xpath = "//a[@id='gb119']//span[@class='gb_W']")
    public static WebElement googlePlus;
    @FindBy(xpath = "//a[@id='gb51']//span[@class='gb_W']")
    public static WebElement googleTranslate;
    @FindBy(xpath = "//a[@id='gb31']//span[@class='gb_W']")
    public static WebElement googlePhotos;













    @FindBy (xpath = "//div[@class='GiKO7c'][contains(text(),'Home')]")
    public static WebElement homeGoogleAccount;
    @FindBy (xpath = "//div[contains(text(),'Get started')]")
    public static WebElement getstarted;
    @FindBy(xpath = "//*[@id=\":kh\"]/div/div[2]/span/a")
    public static WebElement starred;
    @FindBy(xpath = "//div[@id=':28']//div[@class='asa']")
    public static WebElement emailSettings;
    @FindBy(xpath = "//div[contains(text(),'Themes')]")
    public static WebElement settingsThemes;
    @FindBy(xpath = "//div[@id=':14x.custom-6']//div[@class='a7U']")
    public static WebElement themes;
    @FindBy (xpath = "//div[@id=':k6']")
    public static  WebElement olderMessages;
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
    @FindBy (xpath = "//a[contains(text(),'Terms')]")
    public static WebElement terms;
    @FindBy(xpath = "//a[@class='bCzwPe YySNWc']")
    public static WebElement termsYourGoogleAccount;
    @FindBy(xpath = "//*[@id='yDmH0d']/c-wiz/div/div/c-wiz[1]/div[2]/div[3]/ul/li[1]/a")
    public static WebElement termsOverview;
    @FindBy(xpath = "//a[contains(text(),'view archived versions')]")
    public static WebElement termsViewArchivedVersions;
    @FindBy(xpath = "//*[@id='yDmH0d']/c-wiz/div/div/c-wiz[1]/div[1]/div/div/content/span/svg/path[2]")
    public static WebElement menu;
    @FindBy(xpath = "//*[@id=\"initialView\"]/footer/ul/li[1]/a")
    public static WebElement help;
    @FindBy(xpath = "//*[@id=\"initialView\"]/footer/ul/li[2]/a")
    public static WebElement privacy;
    @FindBy(xpath = "//a[@class='farYT'][contains(text(),'Introduction')]")
    public static WebElement introduction;
    @FindBy(xpath = "//div[contains(text(),'Display density')]")
    public static WebElement displayDensity;
    @FindBy(xpath = "//*[@id=\"gbwa\"]/div/a/svg/path")
    public static WebElement getGoogleAppsViewBox;
    @FindBy(xpath = "//input[@placeholder='Search mail']")
    public static WebElement searchMail;
    @FindBy (xpath = "//*[@id=\":n3\"]/span")
    public static WebElement searchEmailResult;
    @FindBy(xpath = "//*[@id=\":159\"]")//*[@id=\":15f\"]")   //*[@id=\":15c\"]"//*[@id=":159"]
    public static WebElement emailReply;
    @FindBy (xpath = "//*[@id=\":1a4\"]")//*[@id=':1as']")//*[@id=\":1as\"]")//*[@id=":1a4"]
    public static WebElement replyEmailBody;
    @FindBy (xpath = "//*[@id=\":18p\"]")//div[@id=':17n']")
    public static WebElement replyEmailSendButton;
    @FindBy(xpath ="//*[@id=\":kc\"]/div/div[2]/span/a")
    public static WebElement sentEmails;
    @FindBy(id = "#:kc")
    public static WebElement sent;


    public void searchEmail(){
        login();
        searchMail.sendKeys("naz", Keys.ENTER);
        searchEmailResult.click();
        emailReply.click();
        replyEmailBody.sendKeys("wuv you");
        replyEmailSendButton.click();
        //sentEmails.click();
    }

    public void SentEmails() throws Exception {
        loginUsername.sendKeys("chocolategirl1995", Keys.ENTER);
        loginPassword.sendKeys("nazi1995", Keys.ENTER);
        sent.click();
    }




    public void term(){
        terms.click();
        termsViewArchivedVersions.click();

    }
    public void privacy(){
        privacy.click();
        introduction.click();
    }


    public void login(){
        loginUsername.sendKeys("chocolategirl1995", Keys.ENTER);
        loginPassword.sendKeys("nazi1995", Keys.ENTER);
    }

    public void sendEmailCompose(){
        login();
        composeButton.click();
    }
    public void sendEmailRecipientEmail(){
        sendEmailCompose();
        recipientEmail.sendKeys("chocolategirl1995@gmail.com", Keys.ENTER);
    }
    public void sendEmailemailSubject(){
        sendEmailRecipientEmail();
        emailSubject.sendKeys("Hey");
    }
    public void sendEmailemailBody(){
        sendEmailemailSubject();
        emailBody.sendKeys("Naz");
    }
    public void sendEmailSendButton() throws InterruptedException {
        sendEmailemailBody();
        sendButton.click();
        Thread.sleep(3000);
    }

    public void sendEmail() throws InterruptedException {
        login();
        composeButton.click();
        recipientEmail.sendKeys("chocolategirl1995@gmail.com", Keys.ENTER);
        emailSubject.sendKeys("Hey");
        emailBody.sendKeys("Naz");
        sendButton.click();
        Thread.sleep(3000);
    }

    public void HelpCreateGoogleAccount() {
        helpOption.click();
//        popularArticles.click();
        createGoogleAccount.click();
        checkGoogleAccount.click();
        checkGoogleAccountEnterEmail.click();
        enterYourEmailAddress.sendKeys("chocolategirl1995", Keys.ENTER);
    }

    public void helpGoogleAccount(){
        helpOption.click();
        googleAccount.click();
    }

    public void GoogleAccount(){
        helpOption.click();
        viewBox.click();
    }

    public void GoogleApps(){
        login();
        googleAppsViewBox.click();
        userAccount.click();
//        homeGoogleAccount.click();
        getstarted.click();//*[@id="yDmH0d"]/div[2]/c-wiz/div[1]/c-wiz/c-wiz/div/div[4]/div/div/c-wiz/section/article[1]/div/div/div[2]/div[2]/a/div
    }
    public void ShowGoogleApps(){
        login();
        googleAppsViewBox.click();
    }

    public void ShowUserAccount(){
        ShowGoogleApps();
        userAccount.click();
    }
    public void ShowGoogleSearch(){
        ShowGoogleApps();
        googleSearch.click();
    }
    public void ShowGoogleMaps(){
        ShowGoogleApps();
        googleMaps.click();
    }
    public void ShowYouTube(){
        ShowGoogleApps();
        youTube.click();
    }
    public void ShowPlayStore(){
        ShowGoogleApps();
        playStore.click();
    }
    public void ShowGoogleNews(){
        ShowGoogleApps();
        googleNews.click();
    }
    public void ShowGoogleContacts(){
        ShowGoogleApps();
        googleContacts.click();
    }
    public void ShowGoogleDrive(){
        ShowGoogleApps();
        googleDrive.click();
    }
    public void ShowGoogleCalender(){
        ShowGoogleApps();
        googleCalender.click();
    }
    public void ShowGooglePlus(){
        ShowGoogleApps();
        googlePlus.click();
    }
    public void ShowGoogleTranslate(){
        ShowGoogleApps();
        googleTranslate.click();
    }
    public void ShowGooglePhotos(){
        ShowGoogleApps();
        googlePhotos.click();
    }




























    public void EmailStarred(){
        login();
        starred.click();
    }

    public void EmailSettings(){
        login();
        emailSettings.click();
     //   settingsThemes.click();
    }
    public void EmailSettingsDisplayDensity(){
        login();
        emailSettings.click();
        displayDensity.click();
    }
    public void EmailOlderMessages(){
        login();
        olderMessages.click();

    }
    public void GoogleAppsViewBox(){
        login();
        googleAppsViewBox.click();
    }


}