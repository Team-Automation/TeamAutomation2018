import Report.TestLogger;
import applicationBase.ApplicationPageBase;
import base.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.CreateAccountPage;
import page.objects.HomePage;
import page.objects.LoginPage;

public class CreateAccountPageTest extends ApplicationPageBase {

    HomePage homePage = null;
   CreateAccountPage createAccountPage = null;

    @BeforeMethod
    public void initializationOfElements () {
        homePage = PageFactory.initElements(driver,HomePage.class);
        createAccountPage = PageFactory.initElements(driver,CreateAccountPage.class);
    }

    @Test
    public void invalidCreateAccount () throws InterruptedException{
        homePage.getCreateAccountPage();
        createAccountPage.createAccount();
        String actualText = createAccountPage.getErrorMessage();
        Assert.assertEquals(actualText,"Error Code T83072242. Sorry, something went wrong. Please refresh your browser and try again.");
        TestLogger.log("Create Account Test Passed");
    }
}
