import Report.TestLogger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import page.objects.SearchPage;

public class TestSearch extends SearchPage {
    SearchPage searchPage;

    @BeforeMethod
    public void initializationOfElements () {
        searchPage = PageFactory.initElements(driver, SearchPage.class);
    }

    @Test(dataProvider = "setData")
    public void searchItems(String keys){
        searchPage.searchInputandSubmitButton(keys);
        TestLogger.log("Search Test is passed");
    }

}
