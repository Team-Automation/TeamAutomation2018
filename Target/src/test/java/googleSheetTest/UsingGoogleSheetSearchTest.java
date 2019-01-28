package googleSheetTest;

import Report.TestLogger;
import applicationBase.ApplicationPageBase;
import googleApi.GoogleSheetReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.objects.HomePage;
import page.objects.LoginPage;
import page.objects.SearchPage;

import java.io.IOException;
import java.util.List;
import java.util.Properties;


public class UsingGoogleSheetSearchTest extends ApplicationPageBase {

    SearchPage searchPage;


    @BeforeMethod
    public void initializationOfElements () {
        searchPage = PageFactory.initElements(driver, SearchPage.class);
    }

    /**
     *
     * Read data from Google Sheet
     * Make sure you have created client_secret.json from your account where you have Google Sheet Data file
     * Delete .credentials directory from your module if it is exists. Other wise it will take existing/old credentials
     * thus it may give unauthorized access error(error code starting with 4, such as 403,404)
     * We can supply data to test method by two ways
     * 1. We can use @DataProvider to feed data to the test method
     * 2. We can supply data to the test method directly
     *
     * */

    @DataProvider(name = "googleSheet")
    public Object[][] getTestDataFromGoogleSheet() throws IOException {

        Properties properties = loadProperties();
        String spreadsheetId = properties.getProperty("GOOGLE.spreadsheetId");
        String ranges = properties.getProperty("GOOGLE.ranges");
        /**
         *
         * Two ways to convert  List to Array in GoogleSheetReader.java class
         * Both method will give data from Google Sheet
         *
         * */
        //  String[][] data = GoogleSheetReader.getSpreadSheetRecordsToSupplyDataProvider(spreadsheetId, range);
        String[][] data = GoogleSheetReader.getSpreadSheetRecordsToSupplyDataProviderAlternativeWay(spreadsheetId,ranges);
        return data;

    }

    @Test(dataProvider = "googleSheet")
        public void searchItems(String keys){
        searchPage.searchInputandSubmitButton(keys);
        TestLogger.log("Successfully passed The Search Test");
    }
}
