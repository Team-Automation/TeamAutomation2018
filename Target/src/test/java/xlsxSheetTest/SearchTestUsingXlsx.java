package xlsxSheetTest;

import Report.TestLogger;
import applicationBase.ApplicationPageBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.objects.SearchPage;
import xlsx.reader.MyDataReader;
import java.io.File;

public class SearchTestUsingXlsx extends ApplicationPageBase {

    SearchPage searchPage = null;

    @BeforeMethod
    public void initializationOfElements() {
        searchPage = PageFactory.initElements(driver, SearchPage.class);
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
        String [][] data = dr.getExcelSheetData("Search");
        return data;
    }

    @Test(dataProvider = "getTestData")
    public  void searchTest(String keys, String expectedTitle) {
        searchPage.searchInputandSubmitButton(keys);
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        TestLogger.log("Successfully passed The Search Test");

    }
}
