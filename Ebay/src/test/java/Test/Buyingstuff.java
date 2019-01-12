package Test;

import buying.BuyProduct;
import myApi.EbayApi;
import myApi.login.CreateLogSearch;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Buyingstuff  extends EbayApi {
   // CreateLogSearch createLogSearch;
    BuyProduct buy;

    public void initialize1() {
        //createLogSearch = PageFactory.initElements(driver, CreateLogSearch.class);
        buy=PageFactory.initElements(driver,BuyProduct.class);
    }
    @Test
    public void startSearch(){

    }
}