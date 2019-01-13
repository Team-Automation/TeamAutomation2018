package search;

import Report.TestLogger;
import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CardsPage extends CommonApi {
    @FindBy(how = How.XPATH, xpath = "//label[@id='label-cards']")
    WebElement cards;
    @FindBy(xpath = "//a[@class='axp-global-header__dls__navLink___1AA5H axp-global-header__dls__pad0Lr___3Zo1k'][contains(text(),'Check for Pre-qualified Credit Card Offers')]")
    WebElement preQualified;
    @FindBy(xpath = "//div[@class='pq_hero_headline blue-light mb']")
    WebElement offers;
    public String clickCards1() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       cards.click();
        sleepFor(2);
       preQualified.click();
       String text = offers.getText();
        return text ;
    }
    @FindBy(xpath = "//a[@class='axp-global-header__dls__navLink___1AA5H axp-global-header__dls__pad0Lr___3Zo1k'][contains(text(),'Cash Back Credit Cards')]")
    WebElement cashBackCreditCards;
    @FindBy(xpath = "//p[contains(text(),'Get savings on dining, shopping, entertainment and')]")
    WebElement amexOffers;
    public String clickCards2() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        cards.click();
        sleepFor(2);
        cashBackCreditCards.click();
        String text = amexOffers.getText();
        return text ;
    }
    @FindBy(xpath = "//a[@class='axp-global-header__dls__navLink___1AA5H axp-global-header__dls__pad0Lr___3Zo1k'][contains(text(),'Compare Cards by Benefits')]")
    WebElement cardBenefits;
    @FindBy(xpath = "//div[contains(text(),'Built in flexibility to help you manage your cash ')]")
    WebElement plumCards;
    public String clickCards3() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        cards.click();
        sleepFor(2);
        cardBenefits.click();
        String text = plumCards.getText();
        return text ;
    }
    @FindBy(xpath = "//a[@class='axp-global-header__dls__navLink___1AA5H axp-global-header__dls__pad0Lr___3Zo1k'][contains(text(),'View All Small Business Cards')]")
    WebElement businessCards;
    @FindBy(xpath = "//div[@class='card-tile-wrap']//div[1]//div[1]//section[1]//div[1]//div[3]//div[1]//div[1]//h3[1]//a[1]//span[1]")
    WebElement platinumCard;
    public String clickCards4() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        cards.click();
        sleepFor(2);
        businessCards.click();
        String text  = platinumCard.getText();
        return text ;
    }
    @FindBy(xpath = "//a[@class='axp-global-header__dls__navLink___1AA5H axp-global-header__dls__pad0Lr___3Zo1k'][contains(text(),'Find a Custom Corporate Solution')]")
    WebElement corporateSolution;
    @FindBy(id = "error-information-button")
    WebElement errorMsg;
    public String clickCards5() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        cards.click();
        sleepFor(2);
        corporateSolution.click();
        String text  = errorMsg.getText();
        return text ;
    }
}
