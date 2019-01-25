package searchTest;

import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reader.Readxls;
import search.UserFeature;


public class UserTest extends CommonApi {


    @Test
    public void searchData() throws Exception {
        UserFeature userFeature = PageFactory.initElements(driver, UserFeature.class);

        userFeature.searchUserAndSubmitButtonwithoutPassword();


    }
}
