package search;

import base.CommonApi;

public class SearchPage extends CommonApi {
    public void searchMenu(){
clickByXpath("//label[@id='label-business']//span[contains(text(),'Business')]");
//        typeByXpath("//input[@placeholder='Search']","Credit Cards");
//        navigateBack();
//        typeByXpath("//input[@placeholder='Search']","Finance");
    }
}
