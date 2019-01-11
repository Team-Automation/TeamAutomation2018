import base.CommonApi;
import org.openqa.selenium.By;

public class Target extends CommonApi{

    public void search(){
        typeOnId("search","Iphone Xs Max");
        clickByXpath("//*[@type='submi']");
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

    public void giftCard(){
        clickByLinkText("Gift Cards");
        clickByXpath("//*[@id='mainContainer']/div[3]/div/div[2]/div/div[1]/div[1]/div/div/a/div[2]");
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

    public void bestDeal () {
        clickByXpath("//*[@id='secondary']");
        clickByCss(".Row-uds8za-0.kjjHUt");
    }

    public void trending () {
        clickByCss("[data-menu='trending']");
        clickByCss(".Row-uds8za-0.kjjHUt");
    }







}
