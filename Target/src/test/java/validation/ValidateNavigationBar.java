package validation;

import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import target.HomePage;

public class ValidateNavigationBar extends CommonApi {

    @Test //validate main header
    public void validateMainHeader () {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Assert.assertTrue(homePage.getMainHeader().isDisplayed());
    }

    @Test //validate Top Header
    public void validateTopHeader () {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Assert.assertTrue(homePage.getTopHeader().isDisplayed());
    }

}
