package xlsxSheet;

import applicationBase.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginTest extends ApplicationPageBase {

    @FindBy(css = "#username")
    WebElement emailBox;

    @FindBy(css ="#password")
    WebElement passwordBox;

    @FindBy(css ="#login")
    WebElement signInButton;

    @FindBy(xpath = "//div[@class='errorMsg h-text-orangeDark']//span" )
    WebElement errorMessage;

    public LoginTest login(String email, String password) {
        sendKeys(emailBox, "emailBox", email);
        sendKeys(passwordBox,"passwordBox", password);
        click(signInButton,"signInButton");
        return new LoginTest();
    }

    public String getErrorMessage(){
        String actualText = errorMessage.getText();
        return actualText;
    }



}
