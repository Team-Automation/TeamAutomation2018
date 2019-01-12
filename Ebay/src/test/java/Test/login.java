package Test;

import myApi.EbayApi;
import myApi.search.CreateLogSearch;
import myApi.search.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class login extends EbayApi {
@Test
    public void createlofsearch(){
    CreateLogSearch createLogSearch= PageFactory.initElements(driver,CreateLogSearch.class);
    createLogSearch.clicksign();
   createLogSearch.setUserName(username);
    createLogSearch.setPassword(password);
    createLogSearch.clicksubmit();
    navigateBack();
    //To Search Items
createLogSearch.searchandsubmit();

}


}
