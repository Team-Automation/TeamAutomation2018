package myApi.login;
import myApi.EbayApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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
    @FindBy (css = "#PASSWORD")
    WebElement cpassword;
    @FindBy (id ="ppaFormSbtBtn" )
    WebElement clickregister;
    public void clickSign(){ sign.click(); }
    public void setUserName(String Value){ userName.sendKeys(Value); }
    public void setPassword(String value) { password.sendKeys(value); }
    public WebElement getSign() { return signin; }
    public void clickSubmit() {
        signin.click();
    }
    public void clickFb(){
        signwithFb.click();
    }
    public void clickreg(){
        register.click();
    }
    public void setTypeName(String Value){
        typeName.sendKeys(Value);
    }
    public void setTypelname(String Value) {
        typelname.sendKeys(Value);
    }
    public void setCreatepassword(String Value){
      cpassword.sendKeys(Value);
    }
    public void submitreg() { clickregister.click();
    System.out.println("This concludes the first part of testing");
    }
}
