package myApi.search;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateLogSearch {

@FindBy (name = "#userid")
    WebElement userName;
@FindBy (name = "#pass")
    WebElement password;
@FindBy (name = "sgnBt")
    WebElement signin;

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
