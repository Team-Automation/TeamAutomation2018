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



}
