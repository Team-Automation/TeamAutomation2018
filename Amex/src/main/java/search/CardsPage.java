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
    @FindBy(xpath = "//span[contains(text(),'Offers for you')]")
    WebElement offers;
    @FindBy(xpath = "//*[@id=\"amex-header\"]/div/div[2]/div[1]/div[2]/div/div[4]/div/ul/li[2]/div/div[1]/div/div[1]/ul/li[5]/a")
    WebElement cashBackCreditCards;
    @FindBy(xpath = "//p[contains(text(),'Get savings on dining, shopping, entertainment and')]")
    WebElement amexOffers;
    @FindBy(xpath = "//a[@class='axp-global-header__dls__navLink___1AA5H axp-global-header__dls__pad0Lr___3Zo1k']")
    WebElement cardBenefits;
    @FindBy(xpath = "//div[contains(text(),'Built in flexibility to help you manage your cash ')]")
    WebElement plumCards;
    @FindBy(xpath = "//a[@class='axp-global-header__dls__navLink___1AA5H axp-global-header__dls__pad0Lr___3Zo1k']")
    WebElement businessCards;
    @FindBy(xpath = "//div[contains(text(),'Enjoy premium travel experiences and elevate your ')]")
    WebElement platinumCard;
    @FindBy(xpath = "//a[@class='axp-global-header__dls__navLink___1AA5H axp-global-header__dls__pad0Lr___3Zo1k']")
    WebElement corporateSolution;
    @FindBy(id = "error-information-button")
    WebElement errorMsg;
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
        corporateSolution.click();
        String text  = errorMsg.getText();
        return text ;
    }
}
