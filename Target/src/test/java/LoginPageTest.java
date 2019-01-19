import Report.TestLogger;
import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.objects.HomePage;
import page.objects.LoginPage;



public class LoginPageTest  extends LoginPage {

    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void initializeElement () {
        homePage = PageFactory.initElements(driver,HomePage.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }
    @Test(dataProvider = "getData")
    public void login(String email, String password,String expectedEmailErrorMessage,String expectedPasswordErrorMessage) throws InterruptedException {
        homePage.getLogInPage();
        loginPage.login(email,password);
        String expectedEmailText = expectedEmailErrorMessage;
        String expectedPasswordText = expectedPasswordErrorMessage;
        Assert.assertEquals(loginPage.getEmailErrorMessage(),expectedEmailText);
        Assert.assertEquals(loginPage.getPasswordErrorMessage(),expectedPasswordText);
        TestLogger.log("login Test is passed");
    }

}
