package searchTest;

import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import reader.Readxls;
import search.UserFeature;

import java.io.File;
import java.io.IOException;

public class UserTest extends CommonApi {


    @Test
    public void searchData() throws Exception {
        UserFeature userFeature = PageFactory.initElements(driver, UserFeature.class);

        userFeature.searchUserAndSubmitButtonwithoutPassword();


    }
}
