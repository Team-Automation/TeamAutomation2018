import base.CommonApi;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;

public class TestSearch extends CommonApi {

    @Test
    public void searchItems(){
        SearchPage searchPage = new SearchPage(driver);//PageFactory.initElements(driver, SearchPage.class);
        searchPage.searchInputandSubmitButton();
    }


}
