package search;


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

      personalCards.click();

        return null;
    }
    public String clickCards2(){

        businessCards.click();

        return null;
    }
    public String clickCards3(){

        corporateCards.click();

        return null;
    }
    public String clickCards4(){

        giftCards.click();

        return null;
    }
    public String cards1(){

        String getText1 = personalCards.getText();


        return getText1;

    }
    public String cards2(){

        String getText2 = businessCards.getText();


        return getText2;

    }
    public String cards3(){

        String getText3 = corporateCards.getText();


        return getText3;

    }
    public String cards4(){

        String getText4 = giftCards.getText();


        return getText4;

    }
}
