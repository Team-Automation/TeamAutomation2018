package buying;

import myApi.EbayApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.io.IOException;
public class BuyProduct extends EbayApi{
        @FindBy (css = "#gh-ac")
        WebElement searchproduct;
        @FindBy (id = "gh-btn")
        WebElement clickproduct;
        @FindBy (xpath = "//*[@id=\"srp-river-results-listing8\"]/div/div[1]/div/a/div/img")
        WebElement product1;
        @FindBy (className = ".gh-p")
        WebElement sell;
        @FindBy (xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a")
        WebElement motor;
        public void dosearch(String Value) {
            searchproduct.sendKeys(Value);
        }
        public void clickit()  {
            clickproduct.click();
        }
        public void clickpolo(){
            product1.click();
        }
        public void clickSell(){
            sell.click();
        }
        public void clickmotor(){
            motor.click();
        }
}

