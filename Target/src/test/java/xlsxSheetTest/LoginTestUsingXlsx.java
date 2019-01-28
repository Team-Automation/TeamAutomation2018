package xlsxSheetTest;

import Report.TestLogger;
import applicationBase.ApplicationPageBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.objects.HomePage;
import page.objects.LoginPage;
import xlsx.reader.MyDataReader;

import java.io.File;

public class LoginTestUsingXlsx extends ApplicationPageBase {

    LoginPage objLoginPage = null;
    HomePage objHomePage = null;

    @BeforeMethod
    public void initializationOfElements() {
        objHomePage = PageFactory.initElements(driver, HomePage.class);
        objLoginPage= PageFactory.initElements(driver, LoginPage.class);

    }
    /**
    *
    * Read Data from XLSX file
    *
    * */

    @DataProvider
    public Object[][] getTestData () throws Exception {
        File filepath = new File(System.getProperty("user.dir") + "/testData/Target.xlsx");
        MyDataReader dr = new MyDataReader();
        //Show me where is data file
        dr.setExcelFile(filepath.getAbsolutePath());
        String [][] data = dr.getExcelSheetData("Login");
        return data;
    }

    @Test(dataProvider = "getTestData")
    public  void invalidSigninTest(String email, String password, String expectedErrorMessage) {
        objHomePage.getLogInPage();
        objLoginPage.login(email,password);
        String expectedText = expectedErrorMessage;
        String actulText = objLoginPage.getEmailErrorMessage();
        Assert.assertEquals(actulText, expectedText);
        TestLogger.log("Successfully passed The Login Test");

    }
}
