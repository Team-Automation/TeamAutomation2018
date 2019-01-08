import base.CommonApi;
import org.openqa.selenium.By;

public class Target extends CommonApi{

    public void search(){
        typeOnId("search","Iphone Xs Max");
        clickByXpath("//*[@type='submit']");
    }

    public void signIn()  {
        clickByCss("#account");
        clickByXpath("//*[@id='accountNav-signIn']/a/div");
        typeOnCss("#username","AhmedFoysolHasan");
        typeOnCss("#password","Abcd1234");
        clickByXpath("//button[@id='login']");
        System.out.println(driver.findElement(By.cssSelector("#username--longInstruction")).getText());
    }

    public void createAccount()  {
        clickByCss("#account");
        clickByXpath("//li[@id='accountNav-createAccount']//div[@class='Row-uds8za-0 kjjHUt']");
        typeOnCss("#username","AhmedFoysolHasan");
        typeOnCss("#firstname","Ahmed");
        typeOnCss("#lastname","Hasan");
        typeOnCss("#phone","9292477058");
        typeOnCss("#password","Abcd1234");
        System.out.println(driver.findElement(By.cssSelector("#username--longInstruction")).getText());
    }



}
