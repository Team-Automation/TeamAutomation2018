package brokenLinkTest;
import brokenLink.BrokenLinkForHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;
import page.objects.LoginPage;

import java.io.IOException;

public class TestHome extends BrokenLinkForHomePage {

    HomePage homePage = new HomePage();

    @BeforeMethod
    public void initializeElement () {
        homePage = PageFactory.initElements(driver,HomePage.class);

    }

    @Test()
    public void findBrokenLinksForLoginPage() throws IOException {
        homePage.getLogInPage();
        brokenLink();
    }

    @Test()
    public void findBrokenLinksForCreateAccountPage() throws IOException {
        homePage.getCreateAccountPage();
        brokenLink();
    }

    @Test()
    public void findBrokenLinksForCategoriesPage() throws IOException {
        homePage.getCategoriesPage();
        brokenLink();
    }

}
