package Test;

import myApi.EbayApi;
import org.testng.annotations.Test;
import java.io.IOException;

public class BrokenLink extends EbayApi {
    @Test
    public void findBrokenLinks() throws IOException {
        brokenLink();
    }
}

