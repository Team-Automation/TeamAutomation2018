package searchTest;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import search.SearchCards;
import search.SearchPage;

public class SearchTest extends SearchPage {
    SearchPage searchPage = null;

    @BeforeMethod
    public void setUp() {

        searchPage = PageFactory.initElements(driver, SearchPage.class);

    }


    @Test
    public void test1() throws InterruptedException, Exception {

        String actual = searchPage.clicksearch1();
        String expected = "Your FICO® Score is one of many factors used by lenders to assess your creditworthiness. Usually, a higher score makes it easier to qualify for a loan, " +
                "and it may result in a better interest rate.Educational materials prepared by FICO are...";
        Assert.assertEquals (actual,expected);

    }
}