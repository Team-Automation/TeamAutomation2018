package validation;

import Report.TestLogger;
import applicationBase.ApplicationPageBase;
import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.CreateAccountPage;
import page.objects.HomePage;
import page.objects.LoginPage;

public class ValidateText extends ApplicationPageBase {
    HomePage homePage;
    LoginPage loginPage;
    CreateAccountPage createAccountPage;

    @BeforeMethod
    public void initializationElements () {
        homePage = PageFactory.initElements(driver, HomePage.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        createAccountPage = PageFactory.initElements(driver, CreateAccountPage.class);
    }

    @Test //validate singIn Text in loginPage
    public void validateSignInText () throws InterruptedException {
        homePage.getLogInPage();
        Assert.assertEquals(loginPage.getSingInText(), "Sign in");
        TestLogger.log("Successfully validated SignIn Text");
    }

    @Test //validate Featured categories Text
    public void validateFeatures () {
        Assert.assertEquals(homePage.getFeaturedText(),"Featured categories");
        TestLogger.log("Successfully validated Features Text");
    }

    @Test //validate New year home refresh text
    public void validateNewYear() {
        Assert.assertEquals(homePage.getNewYearText(),"New year home refresh");
        TestLogger.log("Successfully validated New Year Text");
    }

    @Test //validate create account text in top
    public void validateCreateAccountText() throws InterruptedException {
         homePage.getCreateAccountPage();
        Assert.assertEquals(createAccountPage.getErrorMessage(),"Create account");
        TestLogger.log("Successfully validated Create Account Text");
    }
}
