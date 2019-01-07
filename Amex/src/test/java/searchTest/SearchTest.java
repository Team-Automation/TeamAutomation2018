package searchTest;

//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import search.SearchPage;

public class SearchTest extends SearchPage {
   SearchPage searchPage;
   @BeforeMethod
    public void setUp(){
        this.searchPage = new SearchPage();
    }
@Test
   public void test1(){
        searchMenu();
    }
}
