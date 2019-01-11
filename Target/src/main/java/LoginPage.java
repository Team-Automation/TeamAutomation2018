import base.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends CommonApi {



    @FindBy(css = "#username")
    WebElement emailId;

    @FindBy(css ="#password")
    WebElement password;


    public void signIn()  {
        clickByCss("#account");
        clickByXpath("//*[@id='accountNav-signIn']/a/div");
        typeOnCss("#username","AhmedFoysolHasan");

        clickByXpath("//button[@id='login']");
        System.out.println(driver.findElement(By.cssSelector("#username--longInstruction")).getText());
    }

    public WebElement getEmailID (){
        return emailId;
    }

    public  WebElement getPassword () {
        return password;
    }




}
