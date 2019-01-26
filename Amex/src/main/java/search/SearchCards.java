package search;


import Report.TestLogger;
import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchCards extends CommonApi {
    @FindBy(how = How.XPATH, xpath = "//h2[@class='heading-2 text-align-center card-text'][contains(text(),'Personal Cards')]")
    WebElement personalCards;
    @FindBy(xpath = "//h2[@class='heading-2 text-align-center card-text'][contains(text(),'Business Cards')]")
    WebElement businessCards;
    @FindBy(xpath = "//h2[@class='heading-2 text-align-center card-text'][contains(text(),'Corporate Cards')]")
    WebElement corporateCards;
    @FindBy(xpath = "//h2[contains(text(),'Gift Cards')]")
    WebElement giftCards;

    public String clickCards1(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
      personalCards.click();
      return null;
    }
    public String clickCards2(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        businessCards.click();
        return null;
    }
    public String clickCards3(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        corporateCards.click();
        return null;
    }
    public String clickCards4(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        giftCards.click();
        return null;
    }
    public String cards1(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String getText1 = personalCards.getText();
        return getText1;
    }
    public String cards2(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String getText2 = businessCards.getText();
        return getText2;
    }
    public String cards3(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String getText3 = corporateCards.getText();
        return getText3;
    }
    public String cards4(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String getText4 = giftCards.getText();
        return getText4;
    }
}
