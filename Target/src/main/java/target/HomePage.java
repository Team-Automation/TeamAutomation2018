package target;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(xpath = "//span[contains(text(),'Categories')]")
    WebElement categories;

    @FindBy(xpath = "//h2[contains(text(),'Featured categories')]")
    WebElement features;

    @FindBy(xpath = "//nav[@id='headerMain']//a[@id='account']")
    WebElement signIn;

    @FindBy(xpath = "//div[@class='HeaderSecondary-sc-2vvmuj-0 headerSecondary bgrIUz']")
    WebElement topHeader;

    @FindBy(xpath = "//span[contains(text(),'New year home refresh')]")
    WebElement newYearText;

    @FindBy(css = "[data-menu='trending']")
    WebElement trending;

    @FindBy(css = "#headerMain")
    WebElement mainHeader;

    @FindBy(css = "#account")
    WebElement clickOnAccountLink;

    @FindBy(xpath = "//*[@id='accountNav-signIn']/a/div")
    WebElement clickOnSignLink;

    @FindBy(xpath = "//li[@id='accountNav-createAccount']//div[@class='Row-uds8za-0 kjjHUt']")
    WebElement clickOnCreateAccountLink;

    public WebElement getMainHeader () {
        return mainHeader;
    }

    public WebElement getTrending(){
        return trending;
    }

    public WebElement getNewYearText (){
        return newYearText;
    }

    public WebElement getCategoriesText () {
        return categories;
    }

    public WebElement getFeaturedText () {
        return features;
    }

    public WebElement getSignIn () {
        return signIn;
    }

    public WebElement getTopHeader () {
        return topHeader;
    }
}
