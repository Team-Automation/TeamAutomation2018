package search;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyAccountPage extends CommonApi {


    @FindBy(how = How.ID, id = "label-myAccount")
    WebElement MyAccount1;
    @FindBy(xpath = "//a[@class='axp-global-header__dls__navLink___1AA5H axp-global-header__dls__pad0Lr___3Zo1k']")
    WebElement blueBird;
    @FindBy(xpath = "//a[@class='tooltip-trigger']")
    WebElement why;
    @FindBy(xpath = "//a[@class='axp-global-header__dls__navLink___1AA5H axp-global-header__dls__pad0Lr___3Zo1k']")
    WebElement personalLoans;
    @FindBy(xpath = "//a[@class='nav-box-link']")
    WebElement checkYourRate;
    @FindBy(xpath = "//button[@title='Log In to Your Account']")
    WebElement logIn;
    @FindBy(xpath = "//span[contains(text(),'Both the User ID and Password are required. Please')]")
    WebElement errorMsg;
    @FindBy(xpath = "//a[@class='axp-global-header__dls__navLink___1AA5H axp-global-header__dls__pad0Lr___3Zo1k']")
    WebElement creditScore;
    @FindBy(xpath = "//p[contains(text(),'Receive alerts for compromised personal data, pote')]")
    WebElement DetectionAndAlerts;
    @FindBy(xpath = "//li[@class='block_sec _1']//p[@class='ng-binding']")
    WebElement ScoresAndReports;
    @FindBy(xpath = "//p[contains(text(),'Speak to dedicated representatives if you suspect ')]")
    WebElement SupportAndAssistance;
    public void clickAccountHome1() throws Exception {
        MyAccount1.click();
        sleepFor(2);
        blueBird.click();
        sleepFor(2);
        why.getText();
    }
    public String clickAccountHome2() throws Exception {
        MyAccount1.click();
        sleepFor(3);
        personalLoans.click();
        sleepFor(2);
        checkYourRate.click();
        sleepFor(3);
        logIn.submit();
        errorMsg.getText();
        return null;
    }
    public String clickAccountHome3() throws Exception {
        MyAccount1.click();
        sleepFor(3);
        creditScore.click();
        sleepFor(2);
       String text = DetectionAndAlerts.getText();
        return text;
    }

    public String clickAccountHome4() throws Exception {
        MyAccount1.click();
        sleepFor(3);
        creditScore.click();
        sleepFor(2);
        String text = ScoresAndReports.getText();
        return text;
    }
    public String clickAccountHome5() throws Exception {
        MyAccount1.click();
        sleepFor(3);
        creditScore.click();
        sleepFor(2);
        String text = SupportAndAssistance.getText();
        return text;
    }
}