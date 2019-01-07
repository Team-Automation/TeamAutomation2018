package search;

import base.CommonApi;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends CommonApi {
public SearchPage(){
    PageFactory.initElements(driver,this);
}

    public void searchMenu(){

clickByCss("#label-business");



    }
}
