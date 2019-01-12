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
    public void liveVideos(){
        searchPage.getVideoLive().click();
        searchPage.getLiveVideo().click();
    }
    @Test
    public void style(){
        searchPage.getStyle().click();
    }
    @Test
    public void sports(){
        searchPage.getSports().click();
        searchPage.getNFL().click();
    }
    @Test
    public void opinion(){
        searchPage.getOpinion().click();
        searchPage.getSocialC().click();
        searchPage.getFirstArticle();
    }
    @Test
    public void USEnergy(){
        searchPage.getUSEnergy().click();
        searchPage.getUSEE().click();
        searchPage.getFirstA().click();
    }
    @Test
    public void travelFood(){
        searchPage.getTravelFood().click();
        searchPage.getTravelFood().click();
        searchPage.getTravelFoodsArticle1st();
    }
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
