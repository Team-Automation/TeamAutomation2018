package SearchPage;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchMenu extends CommonApi {
    @FindBy (xpath = "//div[@class='nav-menu__hamburger']")
    WebElement Menu;
    public WebElement getMenu(){ return Menu; }
    @FindBy (xpath = "//a[@class='nav-flyout__submenu-link'][contains(text(),'Digital Studios')]")
    WebElement digitalStudios;
    public WebElement getDigitalStudios(){ return digitalStudios; }
    @FindBy (xpath = "//div[@class='nav-menu__hamburger']")
    WebElement Menus;
    public WebElement getMenus(){ return Menus; }
    @FindBy (xpath = "//a[@class='nav-flyout__submenu-link'][contains(text(),'Photos')]")
    WebElement Photos;
    public WebElement getPhotos(){ return Photos; }
    @FindBy (className = "nav-menu-links__link")
    WebElement videos;
    public WebElement getVideos(){ return videos; }
    @FindBy (className = "cd__headline-text")
    WebElement firstVideo;
    public WebElement getFirstVideo(){ return firstVideo; }
    @FindBy (className = "nav-menu-links__link")
    WebElement video;
    public WebElement getVideo(){ return video; }
    @FindBy (className = "nav-menu-links__link")
    WebElement Travel;
    public WebElement getTravel(){ return Travel; }
    @FindBy (className = "Header__section")
    WebElement stay;
    public WebElement getStay(){ return stay; }
    @FindBy (className = "nav-menu-links__link")
    WebElement Travels;
    public WebElement getTravels(){ return Travels; }
    @FindBy (xpath = "//a[@class='Header__section'][contains(text(),'Food & Drink')]")
    WebElement fAndB;
    public WebElement getfAndB(){ return fAndB; }
    @FindBy (className = "nav-menu-links__link")
    WebElement Traveling;
    public WebElement getTraveling(){ return Traveling; }
    @FindBy (className = "Header__section Header__video")
    WebElement vid;
    public WebElement getVid(){ return vid; }
    @FindBy (className = "search__button cnn-icon")
    WebElement typeIndia;
    public WebElement getTypeIndia(){ return typeIndia; }
    @FindBy (xpath = "//label[@for='collection_article']")
    WebElement stories;
    public WebElement getStories(){ return stories; }

    @FindBy (className = "nav-menu-links__link")
    WebElement politics;
    public WebElement getPolitics(){ return politics; }
    @FindBy (xpath = "//header[@id='nav-header']//ul[@class='buckets']//li[1]")
    WebElement congress;
    public WebElement getCongress(){ return congress; }
}
