package target;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends HomePage {

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

    public WebElement getClickOnAccount () {
        return clickOnAccountLink;
    }

    public WebElement getClickOnSignLink () {
        return clickOnSignLink;
    }

    public LoginPage login(String email, String password) {
        emailBox.sendKeys(email);
        passwordBox.sendKeys(password);
        signInButton.click();
        return new LoginPage();
    }

    public String getErrorMessage(){
        String actualText = errorMessage.getText();
        return actualText;
    }

    public WebElement getSingInText () {
        return singInText;
    }

}
