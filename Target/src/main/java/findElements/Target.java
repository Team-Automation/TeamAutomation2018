package findElements;

import applicationBase.ApplicationPageBase;
import base.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Target extends ApplicationPageBase {

    public void search(){
        typeOnId("search","Iphone Xs Max",Keys.ENTER);


    }

    public void signIn()  {
        clickByCss("#account");
        waitUntilClickAble(By.xpath("//*[@class='Row-uds8za-0 kjjHUt']"));
        clickByXpath("//*[@class='Row-uds8za-0 kjjHUt']");
        typeOnCss("#username","AhmedFoysolH");
        typeOnCss("#password","Abcd1234");
        clickByXpath("//button[@id='login']");
        System.out.println(driver.findElement(By.cssSelector("#username--longInstruction")).getText());
    }

    public void createAccount()  {
        clickByCss("#account");
        waitUntilClickAble(By.xpath("//li[@id='accountNav-createAccount']//div[@class='Row-uds8za-0 kjjHUt']"));
        clickByXpath("//li[@id='accountNav-createAccount']//div[@class='Row-uds8za-0 kjjHUt']");
        typeOnCss("#username","AhmedFoysolHasan");
        typeOnCss("#firstname","Ahmed");
        typeOnCss("#lastname","Hasan");
        typeOnCss("#phone","9292477058");
        typeOnCss("#password","Abcd1234");
        System.out.println(driver.findElement(By.cssSelector("#username--longInstruction")).getText());
    }

    public void giftCard(){
        clickByCss("#account");
        waitUntilClickAble(By.cssSelector("#accountNav-giftCards"));
        clickByCss("#accountNav-giftCards");
        typeOnCss("#giftCardNumber","123-456-789-123-457");
        typeOnCss("#accessNumber","12345678");
        clickByCss("#queryGiftCard");
        System.out.println(driver.findElement(By.cssSelector(".styles__ToastContent-h3myfk-1.hWreYc")).getText());
    }

    public void registriesLists(){
        clickByLinkText("Registries & Lists");
        typeOnCss("#registrySearchFirstName","Ahmed");
        typeOnCss("#registrySearchLastName","Hasan");
        clickByXpath("//*[@type='submit']");
    }
}
