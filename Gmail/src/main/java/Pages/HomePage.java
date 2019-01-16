package Pages;

import GmailAPI.GmailCommonAPI;
import base.CommonApi;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

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
    @FindBy (xpath = "//div[@id=':jx']")
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
    @FindBy(xpath = "//*[@id='yDmH0d']/c-wiz/div/div/div[2]/div[3]/c-wiz/div/div/p[1]/a")
    public static WebElement termsViewArchivedVersions;
    @FindBy(xpath = "//*[@id='yDmH0d']/c-wiz/div/div/c-wiz[1]/div[1]/div/div/content/span/svg/path[2]")
    public static WebElement menu;



    public void term(){
        terms.click();
        termsViewArchivedVersions.click();
        
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
        popularArticles.click();
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
        homeGoogleAccount.click();
        getstarted.click();
    }

    public void EmailStarred(){
        login();
        starred.click();
    }

    public void EmailSettings(){
        login();
        emailSettings.click();
        settingsThemes.click();
    }
    public void EmailOlderMessages(){
        login();
        olderMessages.click();

    }

}