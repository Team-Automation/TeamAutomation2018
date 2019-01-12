package searchTest;

import Report.ExtentManager;
import Report.ExtentTestManager;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import search.CardsPage;
import search.MyAccountPage;

public class CardsPageTest extends CardsPage{

    CardsPage cardsPage;

    @BeforeMethod
    public void setUP(){
        cardsPage = PageFactory.initElements(driver,CardsPage.class);
    }


    @Test
    public void cards1() throws Exception {

        String actual = cardsPage.clickCards1();
        String expected = "Check if we have Pre-Qualified Offers for you";
        Assert.assertEquals (actual,expected);

    }
    @Test
    public void cards2() throws Exception {

        String actual = cardsPage.clickCards2();
        String expected = "Get savings on dining, shopping, entertainment and more. Check your account online, " +
                "the Amex® mobile app, or follow American Express on Facebook or Twitter to see what Amex Offers you.";
        Assert.assertEquals (actual,expected);

    }
    @Test
    public void cards3() throws Exception {

        String actual = cardsPage.clickCards3();
        String expected = "Built in flexibility to help you manage your cash flow";
        Assert.assertEquals (actual,expected);

    }
    @Test
    public void cards4() throws Exception {

        String actual = cardsPage.clickCards4();
        String expected = null;
        Assert.assertEquals (actual,expected);

    }
    @Test
    public void cards5() throws Exception {

        String actual = cardsPage.clickCards5();
        String expected = "This site can’t be reached";
        Assert.assertEquals (actual,expected);
        takeScreenShot();

    }
}
