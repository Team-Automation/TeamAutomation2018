package Test;

import buying.BuyProduct;
import myApi.EbayApi;
import myApi.login.CreateLogSearch;
import org.openqa.selenium.support.PageFactory;

public class Buyingstuff  extends EbayApi {
    CreateLogSearch createLogSearch;
    BuyProduct Buy;

    public void initialize1() {
        createLogSearch = PageFactory.initElements(driver, CreateLogSearch.class);

    }
}