package dataDriven;

import Report.TestLogger;
import applicationBase.ApplicationPageBase;
import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.objects.HomePage;
import page.objects.LoginPage;



public class LoginTest extends ApplicationPageBase {

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
        TestLogger.log("Successfully passed The Login Test");
    }

    @DataProvider
    public Object[][] getData()
    {
        Object[][] data=new Object[10][4];
        data[0][0]="FoysolHasan";
        data[0][1]="1234567";
        data[0][2]="Please enter a valid email or phone number";
        data[0][3]="Please enter a valid password";

        data[1][0]="PronovRahman";
        data[1][1]="2123456";
        data[1][2]="Please enter a valid email or phone number";
        data[1][3]="Please enter a valid password";

        data[2][0]="HasibAhmed";
        data[2][1]="12995";
        data[2][2]="Please enter a valid email or phone number";
        data[2][3]="Please enter a valid password";

        data[3][0]="ShuvoDas";
        data[3][1]="A123456";
        data[3][2]="Please enter a valid email or phone number";
        data[3][3]="Please enter a valid password";

        data[4][0]="AlJakir";
        data[4][1]="b123226";
        data[4][2]="Please enter a valid email or phone number";
        data[4][3]="Please enter a valid password";

        data[5][0]="NumanAbdulWadud";
        data[5][1]="d123226";
        data[5][2]="Please enter a valid email or phone number";
        data[5][3]="Please enter a valid password";

        data[6][0]="RobinDas";
        data[6][1]="d923226";
        data[6][2]="Please enter a valid email or phone number";
        data[6][3]="Please enter a valid password";

        data[7][0]="NazibahFariha";
        data[7][1]="d920006";
        data[7][2]="Please enter a valid email or phone number";
        data[7][3]="Please enter a valid password";

        data[8][0]="FahimAhmed";
        data[8][1]="d900226";
        data[8][2]="Please enter a valid email or phone number";
        data[8][3]="Please enter a valid password";

        data[9][0]="ShawonAhmed";
        data[9][1]="abc1234";
        data[9][2]="Please enter a valid email or phone number";
        data[9][3]="Please enter a valid password";

        return data;
    }


}
