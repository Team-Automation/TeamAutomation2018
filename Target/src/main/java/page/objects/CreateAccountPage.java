package page.objects;

import applicationBase.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends ApplicationPageBase {
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

    public CreateAccountPage createAccount () {
        sendKeys(emailBox,"emailBox","afh@gmail.com");
        sendKeys(firstnameBox,"firstnameBox","Ahmed");
        sendKeys(lastnameBox,"lastnameBox","Hasan");
        sendKeys(numberBox,"numberBox","123456789");
        sendKeys(passwordBox,"passwordBox","Aa123456789!");
        click(createAccountButton,"createAccountButton");
        return new CreateAccountPage();
    }

  public String getErrorMessage () {
         String actualText = getText(errorMessage,"errorMessage");
         return actualText;

    }

    public String getCreateAccountText () {
        String actualText = getText(createAccountText,"createAccountText");
        return actualText;
    }


}
