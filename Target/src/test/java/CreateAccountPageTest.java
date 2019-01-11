import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import target.CreateAccountPage;

public class CreateAccountPageTest extends CommonApi {

    @Test
    public void invalidCraeteAccount () throws InterruptedException{
        CreateAccountPage cap = PageFactory.initElements(driver, CreateAccountPage.class);
        cap.getClickOnAccount().click();
        Thread.sleep(2000);
        cap.getClickOnCreateAccountLink().click();
        cap.getEmailBox().sendKeys("afh@gmail.com");
        cap.getFirstnameBox().sendKeys("Ahmed");
        cap.getLastnameBox().sendKeys("Hasan");
        cap.getNumberBox().sendKeys("123456789");
        cap.getPasswordBox().sendKeys("Aa123456@");
        cap.getCreateAccountButton().click();
        Assert.assertEquals(cap.getErrorMessage().getText(),"Error Code T83072242. Sorry, something went wrong. Please refresh your browser and try again.");


    }
}
