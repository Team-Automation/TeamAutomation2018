package Test;

import buying.BuyProduct;
import myApi.EbayApi;
import myApi.login.CreateLogSearch;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Buyingstuff  extends EbayApi {
    BuyProduct buys;
    //CreateLogSearch createLogSearch;
    @Test
    public void initialize1() {
        //createLogSearch = PageFactory.initElements(driver, CreateLogSearch.class);
        buys=PageFactory.initElements(driver,BuyProduct.class);
        buys.dosearch(searchproduct);
        buys.clickit();
        buys.clickpolo();
        logger.info("types and chose a product");
    }
    @Test
    public void trysearch(){
        buys.dosearch(searchproduct);
        logger.info("individual test for search page");
    }
    @Test
    public void clicksearch(){
        buys.clickit();
    }
    @Test
    public void clickproduct(){
        buys.clickpolo();
    }
}

