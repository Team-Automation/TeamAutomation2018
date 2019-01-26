package searchTest;

import Report.TestLogger;
import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import search.MyAccountPage;

public class MyAccountPageTest extends MyAccountPage {

    MyAccountPage myAccountPage;
    @BeforeMethod
    public void intializedElements(){
        myAccountPage = PageFactory.initElements(driver,MyAccountPage.class);
    }
    @Test
    public void account1() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actual = myAccountPage.clickAccountHome1();
        String expected = "Pay your phone, car, housing or any other bill with your Bluebird Card, online Bill Pay or Bluebird Checks.";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void account2() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actual = myAccountPage.clickAccountHome2();
        String expected = "Both the User ID and Password are required.";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void account3() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actual = myAccountPage.clickAccountHome3();
        String expected = "Receive alerts for compromised personal data, potential fraud and at-risk personally identifiable information for you and your children.";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void account4() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actual = myAccountPage.clickAccountHome4();
        String expected = "Support & Assistance";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void account5() throws Exception {
        String actual = myAccountPage.clickAccountHome5();
        String expected = "Speak to dedicated representatives if you suspect fraud, " +
                "lose your wallet or need help understanding your credit report.";
        Assert.assertEquals(actual, expected);
    }
}
