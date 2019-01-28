package page.objects;

import applicationBase.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPage extends ApplicationPageBase {

    @FindBy(css = "#username")
    WebElement emailBox;

    @FindBy(css ="#password")
    WebElement passwordBox;

    @FindBy(css ="#login")
    WebElement signInButton;

    @FindBy(css = "[tabindex='-1']")
    WebElement singInText;

    @FindBy(css = "#username--longInstruction" )
    WebElement emailErrorMessage;

    @FindBy(css = "#password--longInstruction")
    WebElement passwordErrorMessage;

    public LoginPage login(String email,String password) {
        sendKeys(emailBox, "emailBox",email);
        sendKeys(passwordBox,"passwordBox",password);
        click(signInButton,"signInButton");
        return new LoginPage();
    }

    public String getSingInText () {
        String actualText = getText(singInText,"singInText");
        return actualText;
    }

    public String getEmailErrorMessage(){
        String actualText = emailErrorMessage.getText();
        return actualText;
    }

    public String getPasswordErrorMessage(){
        String actualText = passwordErrorMessage.getText();
        return actualText;
    }


}
