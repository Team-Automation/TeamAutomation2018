import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import target.LoginPage;



public class LoginPageTest  extends CommonApi {

    LoginPage loginPage;

    @BeforeMethod
    public void initializeElement () {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }
//    @Test
//    public void invalidSignin () throws InterruptedException {
//        loginPage.getClickOnAccount().click();
//        Thread.sleep(2000);
//        loginPage.getClickOnSignLink().click();
//        loginPage.login("AhmedFoysolHasan","123456");
//        Assert.assertEquals(loginPage.getErrorMessage(),"Please enter a valid email or phone number");
//    }
@Test
    public void validSignin () throws InterruptedException {
        loginPage.getClickOnAccount().click();
        Thread.sleep(2000);
        loginPage.getClickOnSignLink().click();
        loginPage.login("Pronovrahman@gmail.com","Aa12345678");
        Thread.sleep(2000);
         Assert.assertEquals(loginPage.getErrorMessage(),"Please enter a valid email or phone number");
    }


//    @Test
//    public void validSignin () throws

}
