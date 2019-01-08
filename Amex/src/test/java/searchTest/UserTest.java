package searchTest;

import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import search.UserFeature;

import java.io.IOException;

public class UserTest extends CommonApi {
    @Test
    public void searchData() throws IOException {
        UserFeature userFeature = PageFactory.initElements(driver, UserFeature.class);

        userFeature.searchUserAndSubmitButton();
    }
}
