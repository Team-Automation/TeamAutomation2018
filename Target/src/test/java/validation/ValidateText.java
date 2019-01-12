package validation;

import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import target.CreateAccountPage;
import target.HomePage;
import target.LoginPage;

public class ValidateText extends CommonApi {

    @Test //validate singIn Text in loginPage
    public void validateSignInText () throws InterruptedException {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.getClickOnAccount().click();
        Thread.sleep(2000l);
        loginPage.getClickOnSignLink().click();
        Assert.assertEquals(loginPage.getSingInText().getText(), "Sign in");
    }

    @Test //validate Featured categories Text
    public void validateFeatures () {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Assert.assertEquals(homePage.getFeaturedText().getText(),"Featured categories");
    }

    @Test //validate New year home refresh text
    public void validateNewYear() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Assert.assertEquals(homePage.getNewYearText().getText(),"New year home refresh");
    }

    @Test //validate create account text in top
    public void validateCreateAccountText() throws InterruptedException {
        CreateAccountPage cap = PageFactory.initElements(driver, CreateAccountPage.class);
        cap.getClickOnAccount().click();
        Thread.sleep(2000l);
        cap.getClickOnCreateAccountLink().click();
        Assert.assertEquals(cap.getErrorMessage().getText(),"Create account");
    }





}
