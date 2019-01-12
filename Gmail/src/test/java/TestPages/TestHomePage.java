package TestPages;

import Pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {

    HomePage homepage;
    @BeforeMethod
    public void initializeElement(){
        homepage = PageFactory.initElements(driver,HomePage.class);
    }

    @Test
    public void gmailLogin(){homepage.login();}
    @Test
    public void Email() throws InterruptedException {homepage.sendEmail();}
    @Test
    public void test1(){homepage.HelpCreateGoogleAccount(); }
    @Test
    public void test2(){homepage.helpGoogleAccount();}
    @Test
    public void test3(){homepage.GoogleAccount();}
    @Test
    public void test6(){homepage.GoogleApps();}
    @Test
    public void test7(){homepage.EmailStarred();}
    @Test
    public void test10 (){homepage.EmailSettings();}
    @Test
    public void test11 (){homepage.sendEmailCompose();}
    @Test
    public void test12(){homepage.sendEmailRecipientEmail();}
    @Test
    public void test13(){homepage.sendEmailemailSubject();}
    @Test
    public void test14(){homepage.sendEmailemailBody();}
    @Test
    public void test15() throws InterruptedException {homepage.sendEmailSendButton();}


}
