package validation;

import Report.TestLogger;
import applicationBase.ApplicationPageBase;
import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;



public class ValidateNavigationBar extends ApplicationPageBase {

    HomePage homePage;

    @BeforeMethod
    public void initializeElement () {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test //validate main header
    public void validateMainHeader () {
        Assert.assertTrue(homePage.getMainHeader().isDisplayed());
        TestLogger.log("Successfully validated Main Header Bar");
    }

    @Test //validate Top Header
    public void validateTopHeader () {
        Assert.assertTrue(homePage.getTopHeader().isDisplayed());
        TestLogger.log("Successfully validated Top Header Bar");

    }

}
