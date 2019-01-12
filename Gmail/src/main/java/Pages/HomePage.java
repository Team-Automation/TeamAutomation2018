package Pages;

import GmailAPI.GmailCommonAPI;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends GmailCommonAPI {
    @FindBy(xpath = "//a[contains(text(),'Help')]")
    public static WebElement helpOption;
    @FindBy (xpath = "//input[@id='identifierId']")
    public static WebElement loginUsername;
    @FindBy(xpath = "//input[@name='password']")
    public static WebElement loginPassword;
    @FindBy(css = ".T-I.J-J5-Ji.T-I-KE.L3")
    public static WebElement composeButton;
    @FindBy(xpath = "//*[@id=':px']")
    public static WebElement recipientEmail;
    @FindBy(xpath = "//input[@id=':19j']")
    public static WebElement emailSubject;
    @FindBy(xpath = "//*[@id=':qk']")
    public static WebElement emailBody;
    @FindBy(xpath = "//*[@id=':p5']")
    public static WebElement sendButton;



    public void Help() {
        helpOption.click();
        helpOption.sendKeys("");
        helpOption.sendKeys("value", Keys.ENTER);


    }
    public void sendEmail(){
        loginUsername.sendKeys("chocolategirl1995", Keys.ENTER);
        loginPassword.sendKeys("girl1995", Keys.ENTER);
        composeButton.click();
        recipientEmail.sendKeys("chocolategirl1995@gmail.com");
        emailSubject.sendKeys("Hey");
        emailBody.sendKeys("Naz");
        sendButton.click();


    }
}
