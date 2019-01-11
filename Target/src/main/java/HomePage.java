import org.openqa.selenium.By;
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
