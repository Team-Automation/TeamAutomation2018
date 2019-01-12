package SearchPage;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends CommonApi {
    @FindBy(xpath = "//a[@id='nav-mobileTV']")
    public static WebElement televition;
    public void liveTv() {
       televition.click();
    }

    public void travelP() {
        clickByXpath("//a[contains(text(),'Travel')]");
        clickByXpath("//a[@class='Header__section'][contains(text(),'Destinations')]");
        clickByXpath("//a[contains(text(),'Brazil')]");
    }
    public void worldAfrica (){
        clickByXpath("//a[@class='nav-menu-links__link'][contains(text(),'World')]");
        clickByXpath("//a[@class='nav-section__submenu-item'][contains(text(),'Africa')]");
        clickByXpath("/html[1]/body[1]/div[6]/section[2]/div[6]/div[1]/div[1]/ul[1]/li[1]/article[1]/div[1]/div[1]/h3[1]/a[1]");
    }
    public void LatestPolitics() {
        clickByXpath("//a[contains(text(),'Politics')]");
        clickByXpath("//p[@id='cnnix-clock-title']");
    }
    public void facebook(){
        clickByXpath("//div[@class='nav-menu__hamburger']");
        clickByXpath("//a[@class='nav-flyout-footer__social-link nav-flyout-footer__social-link--facebook']");
        navigateBack();
    }
    public void UScrime(){
        clickByXpath("//a[@class='nav-menu-links__link'][contains(text(),'U.S.')]");
        clickByXpath("//a[@class='nav-section__submenu-item'][contains(text(),'Crime + Justice')]");
        clickByClass("cd__headline-text");
    }
    public void TechBusiness(){
        clickByXpath("//a[@class='nav-menu-links__link'][contains(text(),'Business')]");
        clickByXpath("//a[@class='nav-menu-links__link'][contains(text(),'Tech')]");
        clickByClass("cd__headline-text");
    }
    public void SocialOpinion(){
        clickByXpath("//a[@class='nav-menu-links__link'][contains(text(),'Opinion')]");
        clickByXpath("//a[@class='nav-section__submenu-item'][contains(text(),'Social Commentary')]");
        clickByClass("cd__headline-text");
    }
    public void HealthFitness(){
        clickByXpath("//a[contains(text(),'Health')]");
        clickByXpath("//a[@class='nav-section__submenu-item'][contains(text(),'Fitness')]");
        clickByClass("cd__headline-text");
    }
    public void starsEntertainment(){
        clickByXpath("//a[contains(text(),'Entertainment')]");
        clickByXpath("//a[@title='Stars']");
        clickByClass("cd__headline-text");
    }



}
