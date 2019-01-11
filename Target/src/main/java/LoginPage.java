import base.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage  {



    @FindBy(css = "#username")
    WebElement emailBox;

    @FindBy(css ="#password")
    WebElement passwordBox;

    @FindBy(css ="#login")
    WebElement signInButton;

    @FindBy(css = "#username--longInstruction" )
    WebElement errorMessage;

    @FindBy(css = "[tabindex='-1']")
    WebElement singInText;


    //public void sigIn()  {
        //clickByCss("#account");
       // clickByXpath("//*[@id='accountNav-signIn']/a/div");

//
//    public WebElement getEmailID (){
//        return emailBox;
//    }
//
//    public  WebElement getPassword () {
//        return passwordBox;
//    }
//
//    public WebElement signIn () {
//        return SignInButton;
//    }
    public LoginPage login(String email, String password) {
        emailBox.sendKeys(email);
        passwordBox.sendKeys(password);
        signInButton.click();
        return new LoginPage();
    }

    public String getErroMessage(){
        String actualText = errorMessage.getText();
        return actualText;
    }

    public WebElement getSingInText () {
        return singInText;
    }

}
