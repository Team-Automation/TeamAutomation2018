package Test;

import myApi.EbayApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import toplist.Headers;

public class TestHeaders extends EbayApi {
    Headers headers;
    public void initial(){
        headers= PageFactory.initElements(driver, Headers.class);
    }
    @Test
    public void fashionclick(){
        headers.clickFashion();
    }
}
