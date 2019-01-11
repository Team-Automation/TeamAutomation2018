import base.CommonApi;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Validation extends CommonApi {


    @Test //validate singIn Text in loginPage
    public void validateSignInText () {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        Assert.assertEquals(loginPage.getSingInText().getText(), "getSingInText");
    }

    @Test // validate categories link
    public void validateCategories () {
       HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Assert.assertEquals(homePage.getCategoriesText().getText(),"Categories");
    }

    @Test //validate Featured categories Text
    public void validateFeatures () {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Assert.assertEquals(homePage.getFeaturedText().getText(),"Featured categories");
    }

    @Test //validate singIn logo in homePage
    public void validateSignIn () {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Assert.assertTrue(homePage.getSignIn().isDisplayed());
    }

    @Test //validate Top Header Bar
    public void validateTopHeader () {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Assert.assertTrue(homePage.getTopHeader().isDisplayed());
    }
    






}
