package searchTest;
import Report.TestLogger;
import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import search.CardsPage;


public class CardsPageTest extends CardsPage {

    CardsPage cardsPage;

    @BeforeMethod
    public void intializedElements(){
   cardsPage = PageFactory.initElements(driver,CardsPage.class);

    }

    @Test(priority = 0)
    public void cards1() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CardsPage cardsPage = PageFactory.initElements(driver,CardsPage.class);
        String actual = cardsPage.clickCards1();
        String expected = "Offers for you";
        Assert.assertEquals (actual,expected);

    }

    @Test(priority = 1)
    public void cards2() throws Exception {
        CardsPage cardsPage = PageFactory.initElements(driver,CardsPage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actual = cardsPage.clickCards2();
        String expected = "Get savings on dining, shopping, entertainment and more. Check your account online, " +
                "the Amex® mobile app, or follow American Express on Facebook or Twitter to see what Amex Offers you.";
        Assert.assertEquals (actual,expected);

    }
    @Test
    public void cards3() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CardsPage cardsPage = PageFactory.initElements(driver,CardsPage.class);
        String actual = cardsPage.clickCards3();
        String expected = "Built in flexibility to help you manage your cash flow";
        Assert.assertEquals (actual,expected);

    }
    @Test
    public void cards4() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CardsPage cardsPage = PageFactory.initElements(driver,CardsPage.class);
        String actual = cardsPage.clickCards4();
        String expected = "Enjoy premium travel experiences and elevate your business rewards potential.";
        Assert.assertEquals (actual,expected);

    }
    @Test
    public void cards5() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CardsPage cardsPage = PageFactory.initElements(driver,CardsPage.class);
        String actual = cardsPage.clickCards5();
        String expected = "Business Gift Cards are available in amounts $25-$3,000.";
        Assert.assertEquals (actual,expected);
        takeScreenShot();

    }

}
