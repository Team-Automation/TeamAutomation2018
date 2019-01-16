package TestPages;

import Pages.HomePage;
import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {

    HomePage homepage;
    @BeforeMethod
    public void initializeElement(){ homepage = PageFactory.initElements(driver,HomePage.class); }

    @Test
    public void gmailLogin(){homepage.login(); }
    @Test
    public void Email() throws InterruptedException {homepage.sendEmail();}
    @Test
    public void TestHelpCreateGoogleAccount(){homepage.HelpCreateGoogleAccount(); }
    @Test
    public void TesthelpGoogleAccount(){homepage.helpGoogleAccount();}
    @Test
    public void TestGoogleAccount(){homepage.GoogleAccount();}
    @Test
    public void TestGoogleApps(){homepage.GoogleApps();}
    @Test
    public void TestEmailStarred(){homepage.EmailStarred();}
    @Test
    public void TestEmailSettings (){homepage.EmailSettings();}
    @Test
    public void TestSendEmailCompose (){homepage.sendEmailCompose();}
    @Test
    public void TestSendEmailRecipientEmail(){homepage.sendEmailRecipientEmail();}
    @Test
    public void TestSendEmailemailSubject(){homepage.sendEmailemailSubject();}
    @Test
    public void TestSendEmailemailBody(){homepage.sendEmailemailBody();}
    @Test
    public void TestSendEmailSendButton() throws InterruptedException {homepage.sendEmailSendButton();}
    @Test
    public void TestEmailOlderMessages(){homepage.EmailOlderMessages();}
    @Test
    public void test1 (){homepage.term();}
    @Test
    public void test2 (){homepage.privacy();}
    @Test
    public void test3 (){homepage.GoogleAppsViewBox();}


}
