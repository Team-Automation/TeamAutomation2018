import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageTest  extends CommonApi {


    @Test
    public void invalidSignin (){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.login("AhmedFoysolHasan","123456");
    }



}
