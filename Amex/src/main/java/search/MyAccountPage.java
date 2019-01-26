package search;

import Report.TestLogger;
import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyAccountPage extends CommonApi {


    @FindBy(how = How.ID, id = "label-myAccount")
    WebElement MyAccount1;
    @FindBy(xpath = "//*[@id=\"amex-header\"]/div/div[2]/div[1]/div[2]/div/div[4]/div/ul/li[1]/div/div[1]/div/div[3]/ul/li[3]/a")
    WebElement blueBird;
    @FindBy(xpath = "//p[contains(text(),'Pay your phone, car, housing or any other bill wit')]")
    WebElement pay;
    @FindBy(xpath = "//*[@id=\"amex-header\"]/div/div[2]/div[1]/div[2]/div/div[4]/div/ul/li[1]/div/div[1]/div/div[3]/ul/li[5]/a")
    WebElement personalLoans;
    @FindBy(xpath = "//a[@class='nav-box-link']")
    WebElement checkYourRate;
    @FindBy(xpath = "//button[@title='Log In to Your Account']")
    WebElement logIn;
    @FindBy(xpath = "//span[contains(text(),'Both the User ID and Password are required. Please')]")
    WebElement errorMsg;
    @FindBy(xpath = "//*[@id=\"amex-header\"]/div/div[2]/div[1]/div[2]/div/div[4]/div/ul/li[1]/div/div[1]/div/div[4]/ul/li[2]/a")
    WebElement creditScore;
    @FindBy(xpath = "//p[contains(text(),'Receive alerts for compromised personal data, pote')]")
    WebElement DetectionAndAlerts;
    @FindBy(xpath = "//h3[contains(text(),'Support & Assistance')]")
    WebElement ScoresAndReports;
    @FindBy(xpath = "//p[contains(text(),'Speak to dedicated representatives if you suspect ')]")
    WebElement SupportAndAssistance;

    public String clickAccountHome1() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        MyAccount1.click();
        sleepFor(2);
        blueBird.click();
        sleepFor(2);
        String text = pay.getText();
        return text;

    }
    public String clickAccountHome2() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
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
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        MyAccount1.click();
        sleepFor(3);
        creditScore.click();
        sleepFor(2);
       String text = DetectionAndAlerts.getText();
        return text;
    }

    public String clickAccountHome4() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        MyAccount1.click();
        sleepFor(3);
        creditScore.click();
        sleepFor(2);
        String text = ScoresAndReports.getText();
        return text;
    }
    public String clickAccountHome5() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        MyAccount1.click();
        sleepFor(3);
        creditScore.click();
        sleepFor(2);
        String text = SupportAndAssistance.getText();
        return text;
    }
}