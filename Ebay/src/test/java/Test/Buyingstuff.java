package Test;

import buying.BuyProduct;
import myApi.EbayApi;
import myApi.login.CreateLogSearch;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Buyingstuff  extends EbayApi {
   //CreateLogSearch createLogSearch;
    BuyProduct buys;
    @Test
    public void initialize1() {
        //createLogSearch = PageFactory.initElements(driver, CreateLogSearch.class);
        buys=PageFactory.initElements(driver,BuyProduct.class);
        buys.dosearch(searchproduct);
        buys.clickit();
        buys.clickpolo();
    }

    //public void startSearch(){
       // buys.dosearch(searchproduct);
    }

