package validation;

import target.HomePage;
import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import target.LoginPage;

public class ValidateLink extends CommonApi {

    @Test // validate categories link
    public void validateCategories () {
       HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Assert.assertEquals(homePage.getCategoriesText().getText(),"Categories");
    }

    @Test //validate singIn link in homePage
    public void validateSignIn () {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Assert.assertTrue(homePage.getSignIn().isDisplayed());
    }

    @Test //validate Trending link in homePage
    public void validateTrending () {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Assert.assertFalse(homePage.getTrending().isSelected());
    }








}
