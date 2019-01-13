package GmailLogin;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GmailTestLogin extends GmailLoginPage {
GmailLoginPage gmailLoginPage;
@BeforeMethod
public void setUp(){
    gmailLoginPage = PageFactory.initElements(driver,GmailLoginPage.class);
}
    @Test
    public void test1() { login(); }
    @Test
    public void test4() throws InterruptedException {composeMail(); }
    @Test
    public void test2(){
        clickCreateAccount();
    }
    @Test
    public void test3(){
        createAccountFirstName();
    }
    @Test
    public void test7(){
        createAccountLastName();
    }
    @Test
    public void test8(){ createAccountUserName(); }
    @Test
    public void test9() {
        createAccountPassword();
    }
    @Test
    public void test10() {
        createAccountConfirmPassword();
    }
    @Test
    public void test5(){
        googleApps();
    }
}

