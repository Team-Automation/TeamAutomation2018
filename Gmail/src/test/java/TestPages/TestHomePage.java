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
    public void test1(){homepage.Help(); }
    @Test
    public void gmailLogin(){homepage.login();}
    @Test
    public void Email() throws InterruptedException {homepage.sendEmail();}

}
