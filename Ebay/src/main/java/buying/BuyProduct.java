package buying;

import myApi.EbayApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuyProduct {
    public class buy extends EbayApi{
        @FindBy (xpath = "//*[@id=\"srp-river-results-listing8\"]/div/div[1]/div/a/div/img")
        WebElement product1;

    }
}
