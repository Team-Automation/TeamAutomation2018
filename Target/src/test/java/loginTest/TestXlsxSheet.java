package loginTest;

import applicationBase.ApplicationPageBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.objects.HomePage;
import xlsx.reader.MyDataReader;
import xlsxSheet.LoginTest;

import java.io.File;


public class TestXlsxSheet extends ApplicationPageBase {

    LoginTest objLoginPage = null;
    HomePage objHomePage = null;


    @BeforeMethod
    public void initializationOfElements() {
        objHomePage = PageFactory.initElements(driver, HomePage.class);
        objLoginPage= PageFactory.initElements(driver, LoginTest.class);

    }
    /**
    *
    * Read Data from XLSX file
    *
    * */

    @DataProvider
    public Object[][] getTestData () throws Exception {
        File filepath = new File(System.getProperty("user.dir") + "/testData/TestData.xlsx");
        MyDataReader dr = new MyDataReader();
        //Show me where is data file
        dr.setExcelFile(filepath.getAbsolutePath());
        String [][] data = dr.getExcelSheetData("Sheet1");
        return data;
    }

    @Test(dataProvider = "getTestData")
    public  void invalidSignin(String email, String password, String expectedErrorMessage)throws InterruptedException{
        System.out.println(expectedErrorMessage);
        objHomePage.getLogInPage();
        objLoginPage.login(email,password);
        String expectedText = expectedErrorMessage;
        String actulText = objLoginPage.getErrorMessage();
        Assert.assertEquals(actulText, expectedText);

    }
}
