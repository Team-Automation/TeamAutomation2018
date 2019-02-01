package SearchTest;

import SearchPage.SearchMenu;
import SearchPage.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchMenuTest extends SearchMenu {
    SearchMenu searchMenu =null;
    @BeforeMethod
    public void initializeElement(){ searchMenu = PageFactory.initElements(driver, SearchMenu.class); }
    @Test
    public void showMenu(){
        searchMenu.getMenu().click();
        searchMenu.getDigitalStudios().click();
    }
    @Test
    public void showPhotos(){
        searchMenu.getMenus().click();
        searchMenu.getPhotos().click();
    }
    @Test
    public void showVideos(){
        searchMenu.getVideos().click();
        searchMenu.getFirstVideo().click();
    }
    @Test
    public void showVideo(){
        searchMenu.getVideo().click();
    }
    @Test
    public void letsTravel() {
        searchMenu.getTravel().click();
        searchMenu.getStay().click();
    }
    @Test
    public void foodAndDrink() {
        searchMenu.getTravels().click();
        searchMenu.getfAndB().click();
    }
    @Test
    public void TravelingVid() {
        searchMenu.getTraveling().click();
        searchMenu.getVid().click();
    }
    @Test
    public void searchIndia(){
        searchMenu.getTypeIndia().click();
        searchMenu.getStories().click();
    }
    @Test
    public void politicsCongress(){
        searchMenu.getPolitics().click();
        searchMenu.getCongress().click();
    }
}
