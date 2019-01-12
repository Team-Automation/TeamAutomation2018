package myApi.search;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

public class SearchItem {
    @FindBy(how = How.ID ,using="gh-ac")
    public static WebElement searchInput;
    @FindBy (how = How.ID, using = "gh-btn")
    public static  WebElement clickSearch;
    public static WebElement getSearchInput() {
        return searchInput;
    }
    public static WebElement getClickSearch() {
        return clickSearch;
    }
    public void searchFor(String Value){
        getSearchInput().sendKeys(Value);
    }
    public void clickSubmit(){
        getClickSearch().click();
    }
    public void clearInput(){
        getSearchInput().clear();
    }
    public List<String> getsearchmenu(){
        List<String>data = new ArrayList<>();
        data.add("polo");
        data.add("shirt");
        data.add("shoes");
        return data;
    }
    public void searchandsubmit(){
        List<String>list=getsearchmenu();
        for(int i=0; i<list.size();i++){
            searchFor(list.get(i));
            clickSubmit();
            clearInput();
        }
    }
}
