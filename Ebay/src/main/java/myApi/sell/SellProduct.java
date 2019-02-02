package myApi.sell;

import myApi.EbayApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.io.IOException;

public class SellProduct extends EbayApi {
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a")
    WebElement Electronics;
    @FindBy (id = "gh-ac")
    WebElement item;
    @FindBy (id = "gh-btn")
    WebElement itemSearch;
    @FindBy (className = "s-item__title")
    WebElement option1;
    @FindBy (id = "binBtn_btn")
    WebElement buyitem;
    @FindBy(className= ".addonbtn.addonnothx.addon-overlay-close-button")
    WebElement popup;
    public void clickelectronics()  {
        Electronics.click();
    }
    public void finditem(String Value){
        item.sendKeys(Value);
    }
    public void clickitem(){
        itemSearch.click();
    }
    public void clickOption1(){
        option1.click();
    }
    public void selectbuy(){
        buyitem.click();
    }
    public void warranty(){
        popup.click();
    }
}
