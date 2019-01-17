package SearchPage;

import base.Common;
import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends Common {


    @FindBy(xpath = "//a[@id='nav-mobileTV']")
    public static WebElement televition;
    public void liveTv() {
       televition.click();
    }
    @FindBy (xpath = "//a[@class='nav-menu-links__link'][contains(text(),'Video')]")
    WebElement video;
    public WebElement getVideoLive() { return video; }
    @FindBy (css = "#search-button")
    WebElement bangladesh;
    public WebElement getBangladesh(){ return bangladesh; }
    @FindBy (css = "#search-input-field")
    WebElement TypeBangladesh;
    public WebElement getTypeBangladesh(){ return TypeBangladesh; }
    @FindBy (className = "nav-section__submenu-item")
    WebElement liveVideo;
    public WebElement getLiveVideo() {
        return liveVideo;
    }
    @FindBy (xpath = "//a[contains(text(),'Style')]")
    WebElement style;
    public WebElement getStyle(){
        return style;
    }
    @FindBy (xpath = "//a[contains(text(),'Sports')]")
    WebElement sports;
    public WebElement getSports(){
        return sports;
    }
    @FindBy (xpath = "//a[contains(text(),'NFL')]")
    WebElement NFL;
    public WebElement getNFL(){
        return NFL;
    }
    @FindBy (className = "nav-menu-links__link")
    WebElement opinion;
    public WebElement getOpinion(){
        return opinion;
    }
    @FindBy (className = "nav-section__submenu-item")
    WebElement socialC;
    public WebElement getSocialC() {
        return socialC;
    }
    @FindBy (className = "cd__headline-text")
    WebElement firstArticle;
    public WebElement getFirstArticle() {
        return firstArticle;
    }
    @FindBy (className = "nav-menu-links__link")
    WebElement USEnergy;
    public WebElement getUSEnergy() {
        return USEnergy;
    }
    @FindBy (className = "nav-section__submenu-item")
    WebElement USEE;
    public WebElement getUSEE() {
        return USEE;
    }
    @FindBy (className = "cd__headline-text")
    WebElement firstA;
    public WebElement getFirstA(){
        return firstA;
    }
    @FindBy (xpath = "//a[contains(text(),'Travel')]")
    WebElement travelFood;
    public WebElement getTravelFood(){
        return travelFood;
    }
    @FindBy (className = "Header__section")
    WebElement travelFoods;
    public WebElement getTravelFoods() {
        return travelFoods;
    }
    @FindBy (className = "CardBasic__title")
    WebElement travelFoodsArticle1st;
    public WebElement getTravelFoodsArticle1st() {
        return travelFoodsArticle1st;
    }
    @FindBy (className = "nav-menu-links__link")
    WebElement USSpace;
    public WebElement getUSSpace() {
        return USSpace;
    }
    @FindBy (className = "nav-section__submenu-item")
    WebElement USSpacekAndScience;
    public WebElement getUSSpacekAndScience() {
        return USSpacekAndScience;
    }
    @FindBy (className = "cd__headline-text")
    WebElement USSpaceFirstArt;
    public WebElement getUSSpaceFirstArt() {
        return USSpaceFirstArt;
    }
    @FindBy (className = "nav-menu-links__link")
    WebElement world;
    public WebElement getWorld(){
        return world;
    }
    @FindBy (className = "nav-section__submenu-item")
    WebElement worldAsia;
    public WebElement getWorldAsia(){
        return worldAsia;
    }
    @FindBy (className = "cd__headline-text")
    WebElement worldAsiaHeadline;
    public WebElement getWorldAsiaHeadline(){
        return worldAsiaHeadline;
    }

    //LogInProblem
    @FindBy (id = "menu")
    WebElement processToLogInLogIn;
    public WebElement getProcessToLogInLogIn() {
        return processToLogInLogIn;
    }
    @FindBy (linkText = "CNN Store")
    WebElement CNNStore;
    public WebElement getCNNStore(){
        return CNNStore;
    }
    @FindBy (xpath = "//a[@class='nav-account-link']")
    WebElement logIn;
    public WebElement getLogIn(){
        return logIn;
    }
    @FindBy (css = "#user_email")
    WebElement email;
    public WebElement getEmail(){
        return email;
    }
    @FindBy (css = "#user_password")
    WebElement password;
    public WebElement getPassword(){
        return password;
    }


    @FindBy (xpath = "//a[contains(text(),'Travel')]")
    WebElement Travels;
    public WebElement getTravels (){return Travels;}
    @FindBy (xpath = "//a[@class='Header__section'][contains(text(),'Destinations')]")
    WebElement Destinations;
    public WebElement getDestinations (){return Destinations;}
    @FindBy (xpath = "//a[contains(text(),'Dubai')]")
    WebElement Dubai;
    public WebElement getDubai (){return Dubai;}
    @FindBy (xpath = "//a[contains(text(),'Travel')]")
    WebElement Travel;
    public WebElement getTravel (){return Travel;}
    @FindBy (xpath = "//a[@class='Header__section'][contains(text(),'Destinations')]")
    WebElement Destination;
    public WebElement getDestination (){return Destination;}
    @FindBy (xpath = "//a[contains(text(),'Germany')]")
    WebElement Germany;
    public WebElement getGermany (){return Germany;}
    @FindBy (xpath = "//a[contains(text(),'Travel')]")
    WebElement traveling;
    public WebElement getTraveling (){return traveling;}
    @FindBy (xpath = "//a[@class='Header__section'][contains(text(),'Destinations')]")
    WebElement Desti;
    public WebElement getDesti (){return Desti;}
    @FindBy (xpath = "//a[contains(text(),'Cuba')]")
    WebElement Cuba;
    public WebElement getCuba (){return Cuba;}
    @FindBy (xpath = "//a[contains(text(),'Travel')]")
    WebElement travels;
    public WebElement gettravels (){return travels;}
    @FindBy (xpath = "//a[@class='Header__section'][contains(text(),'Stay')]")
    WebElement Stay;
    public WebElement getStay (){return Stay;}

    @FindBy (xpath = "//a[contains(text(),'Sports')]")
    WebElement ticketWay;
    public WebElement getTicketWay (){return ticketWay;}
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/nav[1]/ol[1]/li[4]/a[1]")
    WebElement ticket;
    public WebElement getTicket (){return ticket;}


    public void logIn(){
        clickByXpath("//div[@class='nav-menu__hamburger']");
        clickByClass("nav-flyout__submenu-link");
        clickByXpath("//a[@class='nav-account-link']");
        typeByCss("#user_email","CR7@gmail.com");
        typeByCss("#user_password","ImTheBest"); }

    public void travelP() {
        clickByXpath("//a[contains(text(),'Travel')]");
        clickByXpath("//a[@class='Header__section'][contains(text(),'Destinations')]");
        clickByXpath("//a[contains(text(),'Brazil')]"); }
    public void worldAfrica (){
        clickByXpath("//a[@class='nav-menu-links__link'][contains(text(),'World')]");
        clickByXpath("//a[@class='nav-section__submenu-item'][contains(text(),'Africa')]");
        clickByClass("cd__headline-text"); }
    public void LatestPolitics() {
        clickByXpath("//a[contains(text(),'Politics')]");
        clickByClass("cd__headline-text"); }
    public void facebook(){
        clickByXpath("//div[@class='nav-menu__hamburger']");
        clickByXpath("//a[@class='nav-flyout-footer__social-link nav-flyout-footer__social-link--facebook']");
        navigateBack(); }
    public void UScrime(){
        clickByXpath("//a[@class='nav-menu-links__link'][contains(text(),'U.S.')]");
        clickByXpath("//a[@class='nav-section__submenu-item'][contains(text(),'Crime + Justice')]");
        clickByClass("cd__headline-text"); }
    public void TechBusiness(){
        clickByXpath("//a[@class='nav-menu-links__link'][contains(text(),'Business')]");
        clickByXpath("//a[@class='nav-menu-links__link'][contains(text(),'Tech')]");
        clickByClass("cd__headline-text"); }
    public void SocialOpinion(){
        clickByXpath("//a[@class='nav-menu-links__link'][contains(text(),'Opinion')]");
        clickByXpath("//a[@class='nav-section__submenu-item'][contains(text(),'Social Commentary')]");
        clickByClass("cd__headline-text"); }
    public void HealthFitness(){
        clickByXpath("//a[contains(text(),'Health')]");
        clickByXpath("//a[@class='nav-section__submenu-item'][contains(text(),'Fitness')]");
        clickByClass("cd__headline-text"); }
    public void starsEntertainment(){
        clickByXpath("//a[contains(text(),'Entertainment')]");
        clickByXpath("//a[@title='Stars']");
        clickByClass("cd__headline-text"); }



}
