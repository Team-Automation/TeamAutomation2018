package myApi.search;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

public class CreateLogSearch {

    @FindBy (xpath = "//span[@id='gh-ug']/a[@href='https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F']")
    WebElement sign;
    @FindBy (name = "userid")
    WebElement userName;
    @FindBy (name = "pass")
    WebElement password;
    @FindBy (id = "sgnBt")
    WebElement signin;

    public void clicksign(){
    sign.click();
    }
    public void setUserName(String Value){
        userName.sendKeys(Value);
    }
    public void setPassword(String pwd) {
        password.sendKeys(pwd);
    }
    public void clicksubmit(){
        signin.click();
    }
    @FindBy (how = How.ID ,using="gh-ac")
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
            clicksubmit();
        }
    }

}
