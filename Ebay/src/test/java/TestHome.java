import myApi.search.SearchPage;
import org.testng.annotations.Test;

public class TestHome extends SearchPage {
    @Test
    public void test1(){
        register();
        SearchOption();
        login();
    }
}
