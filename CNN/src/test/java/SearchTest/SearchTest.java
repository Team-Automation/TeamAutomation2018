package SearchTest;

import SearchPage.SearchPage;
import org.testng.annotations.Test;

public class SearchTest extends SearchPage {
    @Test
    public void test1() {
        liveTv();
    }
    @Test
    public void test2() {
        travelP();
    }
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
