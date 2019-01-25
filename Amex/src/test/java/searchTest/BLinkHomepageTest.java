package searchTest;

import base.CommonApi;
import org.testng.annotations.Test;

import java.io.IOException;

public class BLinkHomepageTest extends CommonApi {
    @Test
    public void findBrokenLinks() throws IOException {
        brokenLink();
    }
}
