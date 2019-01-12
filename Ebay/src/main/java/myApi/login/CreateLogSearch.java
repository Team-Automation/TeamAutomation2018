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
    @FindBy (id = "signin_fb_btn")
    WebElement signwithFb;
    @FindBy (css = "[_sp='m570\\.l2621']")
    WebElement register;
    @FindBy (css = "#firstname")
    WebElement typeName;
    @FindBy (css = "#lastname")
    WebElement typelname;
    @FindBy (css = "##PASSWORD")
    WebElement createpassword;
    @FindBy (id ="\"ppaFormSbtBtn" )
    WebElement clickregister;

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
    public void clickFb(){
        signwithFb.click();
    }
    public void  clickreg(){
        register.click();
    }
    public void setTypeName(String Value){
        typeName.sendKeys(Value);
    }
    public void setTypelname(String Value) {
        typelname.sendKeys(Value);
    }
    public void setCreatepassword(String Value){
        createpassword.sendKeys(Value);
    }
        public void submitreg() {
        clickregister.click();
    }
}
