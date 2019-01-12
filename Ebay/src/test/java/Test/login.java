package Test;

import myApi.EbayApi;
import myApi.login.CreateLogSearch;
import myApi.search.SearchItem;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class login extends EbayApi{
    CreateLogSearch createLogSearch;
    SearchItem search;

    @BeforeMethod
    public void initialize () {
        createLogSearch= PageFactory.initElements(driver,CreateLogSearch.class);
        search=PageFactory.initElements(driver,SearchItem.class);
    }
    @Test
    public void invalidLogin(){
        createLogSearch.clicksign();
        createLogSearch.setUserName(username);
        createLogSearch.setPassword(password);
        createLogSearch.clicksubmit();
    }
    @Test
    public void emailBoxcheck(){
        createLogSearch.clicksign();
        createLogSearch.setUserName(username);
    }
    @Test
    public void passwordBoxCheck () {
        createLogSearch.clicksign();
        createLogSearch.setPassword(password);
    }

    @Test
    public void searches(){
        search.searchandsubmit();


    }

}


