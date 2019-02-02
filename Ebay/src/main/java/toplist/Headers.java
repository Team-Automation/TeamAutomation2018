package toplist;

import myApi.EbayApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Headers extends EbayApi {
    @FindBy (xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a")
    WebElement fashion;
    public void clickFashion(){
        fashion.click();
    }
}
