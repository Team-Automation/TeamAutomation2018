package myApi.login;

import base.CommonApi;
import myApi.EbayApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

public class CreateLogSearch extends EbayApi {

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
    public void setPassword(String value) {
        password.sendKeys(value);
    }
    public void clicksubmit() {
        signin.click();
    }
}
