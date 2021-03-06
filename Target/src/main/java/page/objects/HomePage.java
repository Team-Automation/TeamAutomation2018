package page.objects;

import applicationBase.ApplicationPageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ApplicationPageBase {

    @FindBy(xpath = "//a[contains(text(),'shop all')]")
    WebElement allCatregories;

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
    WebElement signInLink;

    @FindBy(xpath = "//*[@id='accountNav-signIn']/a/div")
    WebElement signInButton;

    @FindBy(xpath = "//li[@id='accountNav-createAccount']//div[@class='Row-uds8za-0 kjjHUt']")
    WebElement createAccountButton;

    @FindBy(xpath = "//div[contains(text(),'findElements.Target Finds')]")
    WebElement targetFind;

    @FindBy(xpath = "//div[contains(text(),'Well Chosen')]")
    WebElement wellChosen;

    @FindBy(xpath = "//div[contains(text(),'Cold Weather Shop')]")
    WebElement coldWeatherShop;

    @FindBy(xpath = "//div[contains(text(),'Women’s')]")
    WebElement womens;

    @FindBy(xpath = "//div[contains(text(),'Men’s')]")
    WebElement mens;

    @FindBy(xpath = "//div[contains(text(),'Kids’')]")
    WebElement kids;

    @FindBy(xpath = "//div[contains(text(),'Baby')]")
    WebElement baby;

    @FindBy(xpath = "//div[contains(text(),'Home')]")
    WebElement home;

    @FindBy(xpath = "//div[contains(text(),'Furniture')]")
    WebElement furnitures;

    @FindBy(xpath = "//div[contains(text(),'Kitchen & Dining')]")
    WebElement kitchenDining;

    @FindBy(xpath = "//div[contains(text(),'Electronics')]")
    WebElement electronics;

    @FindBy(xpath = "//div[contains(text(),'Video Games')]")
    WebElement videoGames;

    @FindBy(xpath = "//div[contains(text(),'Toys')]")
    WebElement toys;

    @FindBy(xpath = "//div[contains(text(),'Beauty')]")
    WebElement beauty;

    @FindBy(xpath = "//div[contains(text(),'Grocery')]")
    WebElement grocery;

    @FindBy(xpath = "//div[contains(text(),'Household Essentials')]")
    WebElement householdEssentials;

    @FindBy(xpath = "//div[contains(text(),'Top Deals')]")
    WebElement topDeals;

    @FindBy(xpath = "//div[contains(text(),'Clearance')]")
    WebElement clearance;

    @FindBy(linkText = "Registries & Lists")
    WebElement registriesLists;

    @FindBy(linkText = "Weekly Ad")
    WebElement weeklyAd;

    @FindBy(linkText = "REDcard")
    WebElement REDcard;

    @FindBy(linkText = "Gift Cards")
    WebElement giftCards;

    @FindBy(linkText = "Find Stores")
    WebElement findStores;

    @FindBy(xpath = "//*[@id='header']/div[1]/div[2]/div/div[1]/ul/li[4]/a")
    WebElement restock;

    public WebElement getRestock(){
        return restock;
    }

    public WebElement getWeeklyAd(){
        return weeklyAd;
    }

    public WebElement getFurnitures(){
        return furnitures;
    }

    public WebElement getMens(){
        return mens;
    }

    public WebElement getColdWeatherShop(){
        return coldWeatherShop;
    }

    public WebElement getWomens(){
        return womens;
    }

    public WebElement getWellChosen(){
        return wellChosen;
    }

    public WebElement getFeatures(){
        return features;
    }

    public WebElement getKitchenDining(){
        return kitchenDining;
    }

    public WebElement getElectronics(){
        return electronics;
    }

    public WebElement getToys(){
        return toys;
    }

    public WebElement getBeauty(){
        return beauty;
    }

    public WebElement getHouseholdEssentials(){
        return householdEssentials;
    }

    public WebElement getClearance(){
        return clearance;
    }

    public WebElement getTopDeals(){
        return topDeals;
    }

    public WebElement getTargetFind(){
        return targetFind;
    }

    public WebElement getMainHeader () {
        return mainHeader;
    }

    public WebElement getTrending(){
        return trending;
    }

    public WebElement getNewYearText (){
        return newYearText;
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

    public WebElement getBaby(){
        return baby;
    }

   public String getFindStores(){
        String getText = getText(findStores,"findStores");
        return getText;
    }

    public String getGiftCards(){
        String getText = getText(giftCards,"giftCards");
        return getText;
    }

    public String getREDcard(){

        String getText = getText(REDcard,"REDcard");
        return getText;
    }

    public String getRegistriesLists(){

        String getText = getText(registriesLists,"registriesLists");
        return getText;
    }

    public String getHome(){
        String getText = getText(home,"home");
        return getText;
    }

    public String getVideoGames(){
        String getText = getText(videoGames,"videoGames");
        return getText;
    }

    public String getGrocery(){

        String getText = getText(grocery,"grocery");
        return getText;
    }

    public String getCategoriesText () {

        String getText = getText(categories,"categories");
        return getText;
    }

    public String getKids () {

        String getText = getText(kids,"kids");
        return getText;
    }

    public LoginPage getLogInPage()  {
        signInLink.click();
        waitUntilClickAble(By.xpath("//*[@id='accountNav-signIn']/a/div"));
        signInButton.click();
        return new LoginPage();
    }

    public CreateAccountPage getCreateAccountPage() throws InterruptedException {
        signInLink.click();
        waitUntilClickAble(By.xpath("//*[@id='accountNav-signIn']/a/div"));
        createAccountButton.click();
        return new CreateAccountPage();
    }

    public CategoriesPage getCategoriesPage () {
        allCatregories.click();
        return new CategoriesPage();
    }
}
