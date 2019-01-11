package myApi.search;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

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
    public void setUserName(String uname){
        userName.sendKeys(uname);
    }
    public void setPassword(String pwd) {
        password.sendKeys(pwd);
    }
    public void clicksubmit(){
        signin.click();
    }


}
