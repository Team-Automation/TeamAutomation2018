package SearchTest;

import SearchPage.SearchPage;
import org.testng.annotations.Test;

public class SearchTest extends SearchPage {
    @Test
    public void test1(){
        searchMenu();
    }
    @Test
    public void test2() {
        liveTv();
    }
    @Test
    public void test3() {
        travelP();
    }
    @Test
    public void test4() {
        worldNews();
    }
    @Test
    public void test5(){
        politics();
    }
}
