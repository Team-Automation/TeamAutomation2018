package job;

import myApi.EbayApi;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Careers extends EbayApi {
    @FindBy(xpath = "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[4]/ul/li[5]/a")
    WebElement clickCareer;
    @FindBy(id = "search-keyword-banner")
    WebElement addSearch;
    @FindBy (id = "search-submit-banner")
    WebElement clickSubmit;
    WebElement scroll = driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[4]/ul/li[5]/a"));
    public void godown() {
        scroll.sendKeys(Keys.ARROW_DOWN);
    }

    public void careersSection(){
        clickCareer.click();
    }
    public void setAddSearch(String Value){
        addSearch.sendKeys(Value);
    }
    public void submitButton(){
        clickSubmit.click();
    }
}
