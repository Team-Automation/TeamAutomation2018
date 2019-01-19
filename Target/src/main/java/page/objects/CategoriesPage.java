package page.objects;

import applicationBase.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoriesPage extends ApplicationPageBase {


    @FindBy(xpath = "//div[contains(text(),'Young Adult')]")
    WebElement youngAdult;

    @FindBy(xpath = "//div[contains(text(),'Women’s')]")
    WebElement womens;

    @FindBy(xpath = "//div[contains(text(),'Men’s')]")
    WebElement mens;

    @FindBy(xpath = "//div[contains(text(),'Kids’')]")
    WebElement kids;

    @FindBy(xpath = "//div[contains(text(),'Baby')]")
    WebElement baby;

    @FindBy(xpath = "//div[contains(text(),'Shoes')]")
    WebElement shoes;

    @FindBy(xpath = "//div[contains(text(),'Car Seats')]")
    WebElement carSeats;

    @FindBy(xpath = "//div[contains(text(),'Baby Toys')]")
    WebElement babyToys;

    @FindBy(xpath = "//div[contains(text(),'Health & Safety')]")
    WebElement healthSafety;

    @FindBy(xpath = "//div[contains(text(),'Strollers')]")
    WebElement strollers;

    @FindBy(xpath = "//div[contains(text(),'Toys')]")
    WebElement toys;

    @FindBy(xpath = "//div[contains(text(),'Gear & Activity')]")
    WebElement gearActivity;

    @FindBy(xpath = "//div[contains(text(),'Nursery')]")
    WebElement nursery;

    @FindBy(xpath = "//div[contains(text(),'Movies')]")
    WebElement movies;

    @FindBy(xpath = "//div[contains(text(),'TV Shows')]")
    WebElement tvShows;

    @FindBy(xpath = "//div[contains(text(),'Music')]")
    WebElement music;

    @FindBy(xpath = "//div[contains(text(),'Books')]")
    WebElement books;

    @FindBy(xpath = "//div[contains(text(),'Character Shop')]")
    WebElement characterShop;

    @FindBy(xpath = "//div[contains(text(),'Bikes')]")
    WebElement bikes;

    @FindBy(xpath = "//div[contains(text(),'Fan Shop')]")
    WebElement fanShop;

    @FindBy( xpath= "//div[contains(text(),'Furniture')]")
    WebElement furniture;

    @FindBy(xpath = "//div[contains(text(),'Tailgating')]")
    WebElement tailgating;

    @FindBy(xpath = "//div[contains(text(),'Luggage')]")
    WebElement luggage;

    @FindBy(xpath = "//div[contains(text(),'Rugs')]")
    WebElement rugs;

    @FindBy(xpath = "//div[contains(text(),'Bedding')]")
    WebElement bedding;

    @FindBy(xpath = "//div[contains(text(),'Home Decor')]")
    WebElement homeDecor;

    @FindBy(xpath = "//div[contains(text(),'Deodorant')]")
    WebElement deodorant;

    @FindBy(xpath = "//div[contains(text(),'Men's Grooming')]")
    WebElement mensGrooming;

    @FindBy(xpath = "//div[contains(text(),'Skincare')]")
    WebElement skinCare;

    @FindBy(xpath = "//div[contains(text(),'Makeup')]")
    WebElement makeup;

    @FindBy(xpath = "//div[contains(text(),'First Aid')]")
    WebElement firstAid;

    public WebElement getBikes(){ return bikes; }

    public WebElement getFanShop(){
        return fanShop;
    }

    public WebElement getCharacterShop () {
        return characterShop;
    }

    public WebElement getBooks(){
        return books;
    }

    public WebElement getMusic (){
        return music;
    }

    public WebElement getNursery(){
        return nursery;
    }

    public WebElement getGearActivity(){
        return gearActivity;
    }

    public WebElement getYoungAdult(){ return youngAdult; }

    public WebElement getMens(){
        return mens;
    }

    public WebElement getStrollers(){
        return strollers;
    }

    public WebElement getWomens(){
        return womens;
    }

    public WebElement getCarSeats(){
        return carSeats;
    }

    public WebElement getShoes(){
        return shoes;
    }

    public WebElement getHomeDecor(){
        return homeDecor;
    }

    public WebElement getRugs(){
        return rugs;
    }

    public WebElement getToys(){
        return toys;
    }

    public WebElement getLuggage(){
        return luggage;
    }

    public WebElement getBedding(){
        return bedding;
    }

    public WebElement getTailgating(){
        return tailgating;
    }

    public WebElement getFurniture () {
        return furniture;
    }

    public WebElement getTvShows () {
        return tvShows;
    }

    public WebElement getMovies () {
        return movies;
    }

    public WebElement getBaby(){
        return baby;
    }

    public String getBabyToys(){
        String getText = getText(babyToys,"babyToys");
        return getText;
    }

    public String getHealthSafety(){
        String getText = getText(healthSafety,"healthSafety");
        return getText;
    }

    public String getSkinCare(){

        String getText = getText(skinCare,"Skincare");
        return getText;
    }

    public String getMakeup(){
        String getText = getText(makeup,"Makeup");
        return getText;
    }

    public String getFirstAid(){
        String getText = getText(firstAid,"First Aid");
        return getText;
    }

    public String getMensGrooming(){

        String getText = getText(mensGrooming,"Men's Grooming");
        return getText;
    }

    public String getDeodorant () {

        String getText = getText(deodorant,"deodorant");
        return getText;
    }

    public String getKids () {

        String getText = getText(kids,"kids");
        return getText;
    }








}
