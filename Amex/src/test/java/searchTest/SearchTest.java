package searchTest;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import search.SearchPage;

public class SearchTest extends SearchPage {
    SearchPage searchPage = null;

    @BeforeMethod
    public void intializedElements() {

        searchPage = PageFactory.initElements(driver, SearchPage.class);

    }


    @Test
    public void test1() throws InterruptedException, Exception {

        String actual = searchPage.clicksearch1();
        String expected = "Your FICO® Score is one of many factors used by lenders to assess your creditworthiness. Usually, a higher score makes it easier to qualify for a loan, " +
                "and it may result in a better interest rate.Educational materials prepared by FICO are...";
        Assert.assertEquals (actual,expected);

    }
    @Test
    public void test2() throws InterruptedException, Exception {

        String actual = searchPage.clicksearch2();
        String expected = "The sitemap page can guide you to links for all your needs on AmericanExpress.com";
        Assert.assertEquals (actual,expected);

    }
    @Test
    public void test3() throws InterruptedException, Exception {

        String actual = searchPage.clicksearch3();
        String expected = "Where can I find my Annual Percentage Rate (APR) online?";
        Assert.assertEquals (actual,expected);

    }
    @Test
    public void test4() throws InterruptedException, Exception {

        String actual = searchPage.clicksearch4();
        String expected = "Can I use Membership Rewards® points to book travel on the American Express Travel site?";
        Assert.assertEquals (actual,expected);

    }
    @Test
    public void test5() throws InterruptedException, Exception {

        String actual = searchPage.clicksearch5();
        String expected = "American Express Serve® Cash Back, your prepaid debit account. The only prepaid rewards program with 1% Cash Back on purchases.";
        Assert.assertEquals (actual,expected);

    }
    @Test
    public void test6() throws InterruptedException, Exception {

        String actual = searchPage.clicksearch6();
        String expected = "Login to your American Express® reloadable prepaid card account to view your history, load your card, get frequently asked questions answered, and more.";
        Assert.assertEquals (actual,expected);

    }
    @Test
    public void test7() throws InterruptedException, Exception {

        String actual = searchPage.clicksearch7();
        String expected = null;
        Assert.assertEquals (actual,expected);

    }
    @Test
    public void test8() throws InterruptedException, Exception {

        String actual = searchPage.clicksearch8();
        String expected = "Accept Credit Cards | American Express®";
        Assert.assertEquals (actual,expected);

    }
    @Test
    public void test9() throws InterruptedException, Exception {

        String actual = searchPage.clicksearch9();
        String expected = "American Express Supplier Management and Supply Chain Inclusion";
        Assert.assertEquals (actual,expected);

    }
    @Test
    public void test10() throws InterruptedException, Exception {

        String actual = searchPage.clicksearch3();
        String expected = "Choose the Membership Rewards®";
        Assert.assertEquals (actual,expected);

    }
}