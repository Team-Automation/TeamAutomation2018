package Pages;

import GmailAPI.GmailCommonAPI;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends GmailCommonAPI {
    @FindBy(xpath = "//a[contains(text(),'Help')]")
    public static WebElement helpOption;



    public void Help() {
        helpOption.click();
        helpOption.sendKeys("");
        helpOption.sendKeys("value", Keys.ENTER);


    }
}
