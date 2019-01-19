package Test;

import myApi.EbayApi;
import myApi.sell.SellProduct;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.mustache.Value;

public class TestSell extends EbayApi {
    SellProduct sellproduct;
    @BeforeMethod
    public void Eitems(){
        sellproduct= PageFactory.initElements(driver, SellProduct.class);
    }
    @Test
    public void FirstItem(){
        sellproduct.clickelectronics();
        sellproduct.finditem(item);
        sellproduct.clickitem();
        sellproduct.clickOption1();
        sellproduct.selectbuy();
        sellproduct.warranty();
    }
}
