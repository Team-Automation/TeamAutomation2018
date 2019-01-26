package search;

import Report.TestLogger;
import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CardsPage extends CommonApi {
    @FindBy(how = How.XPATH, xpath = "//label[@id='label-cards']")
    WebElement cards;
    @FindBy(xpath = "//*[@id=\"amex-header\"]/div/div[2]/div[1]/div[2]/div/div[4]/div/ul/li[2]/div/div[1]/div/div[1]/ul/li[3]/a")
    WebElement preQualified;
    @FindBy(xpath = "//span[contains(text(),'Offers for you')]")
    WebElement offers;
    @FindBy(xpath = "//*[@id=\"amex-header\"]/div/div[2]/div[1]/div[2]/div/div[4]/div/ul/li[2]/div/div[1]/div/div[1]/ul/li[5]/a")
    WebElement cashBackCreditCards;
    @FindBy(xpath = "//p[contains(text(),'Get savings on dining, shopping, entertainment and')]")
    WebElement amexOffers;
    @FindBy(xpath = "//*[@id=\"amex-header\"]/div/div[2]/div[1]/div[2]/div/div[4]/div/ul/li[2]/div/div[1]/div/div[2]/ul/li[2]/a")
    WebElement cardBenefits;
    @FindBy(xpath = "//div[contains(text(),'Built in flexibility to help you manage your cash ')]")
    WebElement plumCards;
    @FindBy(xpath = "//*[@id=\"amex-header\"]/div/div[2]/div[1]/div[2]/div/div[4]/div/ul/li[2]/div/div[1]/div/div[2]/ul/li[3]/a")
    WebElement businessCards;
    @FindBy(xpath = "//div[contains(text(),'Enjoy premium travel experiences and elevate your ')]")
    WebElement platinumCard;
    @FindBy(xpath = "//*[@id=\"amex-header\"]/div/div[2]/div[1]/div[2]/div/div[4]/div/ul/li[2]/div/div[1]/div/div[4]/ul/li[2]/a")
    WebElement giftCards;
    @FindBy(xpath = "//p[contains(text(),'Business Gift Cards are available in amounts $25-$')]")
    WebElement business;
    public  String clickCards1() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       cards.click();
        sleepFor(2);
       preQualified.click();
       String text = offers.getText();
        return text ;
    }
    public String clickCards2() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        cards.click();
        sleepFor(2);
        cashBackCreditCards.click();
        String text = amexOffers.getText();
        return text ;
    }
    public String clickCards3() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        cards.click();
        sleepFor(2);
        cardBenefits.click();
        String text = plumCards.getText();
        return text ;
    }
    public String clickCards4() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        cards.click();
        sleepFor(2);
        businessCards.click();
        String text  = platinumCard.getText();
        return text ;
    }
    public String clickCards5() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        cards.click();
        sleepFor(2);
        giftCards.click();
        String text  = business.getText();
        return text ;
    }
}
