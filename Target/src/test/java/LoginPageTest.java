import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import target.LoginPage;



public class LoginPageTest  extends CommonApi {

    @Test
    public void invalidSignin () throws InterruptedException {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.getClickOnAccount().click();
        Thread.sleep(2000);
        loginPage.getClickOnSignLink().click();
        loginPage.login("AhmedFoysolHasan","123456");
        Assert.assertEquals(loginPage.getErrorMessage(),"Please enter a valid email or phone number");
    }



}
