package target;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends HomePage {
    @FindBy(css = "#username")
    WebElement emailBox;

    @FindBy(css = "#firstname")
    WebElement firstnameBox;

    @FindBy(css ="#lastname")
    WebElement lastnameBox;

    @FindBy(css ="#phone")
    WebElement numberBox;

    @FindBy(css ="#password")
    WebElement passwordBox;

    @FindBy(css ="#createAccount")
    WebElement createAccountButton;

    @FindBy(css = ".errorMsg.h-text-orangeDark")
    WebElement errorMessage;

    @FindBy(css = "[tabindex='-1']")
    WebElement createAccountText;

    public WebElement getClickOnAccount () {
        return clickOnAccountLink;
    }

    public WebElement getClickOnCreateAccountLink () {
        return clickOnCreateAccountLink;
    }

    public WebElement getEmailBox () {
        return emailBox;
    }

    public WebElement getFirstnameBox () {
        return firstnameBox;
    }

    public WebElement getLastnameBox () {
        return lastnameBox;
    }

    public WebElement getNumberBox () {
        return numberBox;
    }

    public WebElement getPasswordBox () {
        return passwordBox;
    }

    public WebElement getCreateAccountButton () {
        return createAccountButton;
    }

    public WebElement getErrorMessage () {
        return errorMessage;

    }

    public WebElement getCreateAccountText () {
        return createAccountText;
    }


}
