package Test;

import buying.BuyProduct;
import myApi.EbayApi;
import myApi.login.CreateLogSearch;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestbuyandSell extends EbayApi {
    //CreateLogSearch createLogSearch;
    BuyProduct buys;

    @Test
    public void initialize1() {
        //createLogSearch = PageFactory.initElements(driver, CreateLogSearch.class);
        buys = PageFactory.initElements(driver, BuyProduct.class);
        buys.dosearch(searchproduct);
        buys.clickit();
        buys.clickpolo();
    }
   @Test
  public void startSearch(){
        buys.dosearch(searchproduct);
    }
    @Test
    public void startclick()  {
        buys.clickit();
    }
    @Test
    public void clickmypolo(){
        buys.clickpolo();
    }
    @Test
    public void sellclick(){
        buys.clickSell();
    }
    @Test
    public void motorclick(){
        buys.clickmotor();
    }
}

