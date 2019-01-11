package SearchTest;

import SearchPage.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTest extends SearchPage {
    SearchPage searchPage;
    @BeforeMethod
    public void initializeElement(){
        searchPage = PageFactory.initElements(driver, SearchPage.class); }
    @Test
    public void showLiveTV(){
        searchPage.liveTv(); }
    @Test
    public void test1() { liveTv(); }
    @Test
    public void test2() { travelP(); }
    @Test
    public void test3(){ worldAfrica(); }
    @Test
    public void test4(){ LatestPolitics(); }
    @Test
    public void test5(){facebook(); }
    @Test
    public void test6(){UScrime();}
    @Test
    public void test7(){TechBusiness();}
    @Test
    public void test8 () {SocialOpinion();}
    @Test
    public void test9 (){HealthFitness();}
    @Test
    public void test10 (){ starsEntertainment();}
}
