package validation;

import org.testng.annotations.BeforeMethod;
import target.HomePage;
import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import target.LoginPage;

public class ValidateLink extends CommonApi {
public HomePage homePage;
    @BeforeMethod
    public void initialize () {
     homePage = PageFactory.initElements(driver, HomePage.class);
    }
    @Test // validate categories link
    public void validateCategories () {
        Assert.assertEquals(homePage.getCategoriesText().getText(),"Categories");
        logger.info("Successfully validated Text message");
    }

    @Test //validate singIn link in homePage
    public void validateSignIn () {
        Assert.assertTrue(homePage.getSignIn().isDisplayed());
        logger.info("Successfully validated The link");
    }

    @Test //validate Trending link in homePage
    public void validateTrending () {
        Assert.assertFalse(homePage.getTrending().isSelected());
    }
    
    @Test
    public void checkTargetFind () {
        Assert.assertTrue(homePage.getTargetFind().isDisplayed());
        homePage.getTargetFind().click();
        logger.info("Successfully validated The Target Find link");
    }

    @Test
    public void checkWellChosenLink () {
        Assert.assertTrue(homePage.getWellChosen().isDisplayed());
        homePage.getWellChosen().click();
        logger.info("Successfully validated The Well Chosen link");
    }

    @Test
    public void checkColdWeatherShopLink() {
        Assert.assertTrue(homePage.getColdWeatherShop().isDisplayed());
        homePage.getColdWeatherShop().click();
        logger.info("Successfully validated The Cold Weather Shop link");
    }

    @Test
    public void checkWomensLink() {
        Assert.assertTrue(homePage.getWomens().isDisplayed());
        homePage.getWomens().click();
        logger.info("Successfully validated The Women’s link");
    }

    @Test
    public void checkMensLink() {
        Assert.assertTrue(homePage.getMens().isDisplayed());
        homePage.getMens().click();
        logger.info("Successfully validated The Men’s link");
    }

    @Test
    public void checkHomeLink() {
        Assert.assertEquals(homePage.getHome().getText(),"Home");
        homePage.getHome().click();
        logger.info("Successfully validated The Home link");
    }

    @Test
    public void checkBabyLink() {
        Assert.assertTrue(homePage.getBaby().isDisplayed());
        homePage.getBaby().click();
        logger.info("Successfully validated The Baby link");
    }

    @Test
    public void checkKidsLink() {
        Assert.assertEquals(homePage.getKids().getText(),"Kids");
        homePage.getKids().click();
        logger.info("Successfully validated The kids link");
    }

    @Test
    public void checkKitchenDiningLink() {
        Assert.assertTrue(homePage.getKitchenDining().isDisplayed());
        homePage.getKitchenDining().click();
        logger.info("Successfully validated The Kitchen & Dining link");
    }

    @Test
    public void checkElectronicsLink() {
        Assert.assertEquals(homePage.getElectronics().getText(),"Electronics");
        homePage.getElectronics().click();
        logger.info("Successfully validated The Electronics link");
    }

    @Test
    public void checkVideoGamesLink() {
        Assert.assertEquals(homePage.getVideoGames().getText(),"Video Games");
        homePage.getVideoGames().click();
        logger.info("Successfully validated The Video Games link");
    }

    @Test
    public void checkToysLink() {
        Assert.assertTrue(homePage.getToys().isDisplayed());
        homePage.getToys().click();
        logger.info("Successfully validated The Toys link");
    }

    @Test
    public void checkBeautyLink() {
        Assert.assertTrue(homePage.getBeauty().isDisplayed());
        homePage.getBeauty().click();
        logger.info("Successfully validated The Beauty link");
    }

    @Test
    public void checkGroceryLink() {
        Assert.assertEquals(homePage.getGrocery().getText(),"Grocery");
        homePage.getGrocery().click();
        logger.info("Successfully validated The Grocery link");
    }

    @Test
    public void checkTopDealsLink() {
        Assert.assertTrue(homePage.getTopDeals().isDisplayed());
        homePage.getTopDeals().click();
        logger.info("Successfully validated The Top Deals link");
    }

    @Test
    public void checkHouseholdEssentialsLink() {
        Assert.assertTrue(homePage.getHouseholdEssentials().isDisplayed());
        homePage.getHouseholdEssentials().click();
        logger.info("Successfully validated The Household Essentials link");
    }

    @Test
    public void checkFurnitureLink() {
        Assert.assertEquals(homePage.getFurnitures().getText(),"Furniture");
        homePage.getFurnitures().click();
        logger.info("Successfully validated The Furnitures link");
    }

    @Test
    public void checkLink() {
        Assert.assertTrue(homePage.getClearance().isDisplayed());
        homePage.getClearance().click();
        logger.info("Successfully validated The Clearance link");
    }

    @Test
    public void checkRegistriesListsLink() {
        Assert.assertEquals(homePage.getRegistriesLists().getText(),"Registries & Lists");
        homePage.getRegistriesLists().click();
        logger.info("Successfully validated The Registries Lists link");
    }

    @Test
    public void checkWeeklyAdLink() {
        Assert.assertEquals(homePage.getWeeklyAd().getText(),"Weekly Ad");
        homePage.getWeeklyAd().click();
        logger.info("Successfully validated The Weekly Ad link");
    }

    @Test
    public void checkGiftCardsLink() {
        Assert.assertEquals(homePage.getGiftCards().getText(),"Gift Cards");
        homePage.getGiftCards().click();
        logger.info("Successfully validated The Gift Cards link");
    }

    @Test
    public void checkFindStoresLink() {
        Assert.assertEquals(homePage.getFindStores().getText(),"Find Stores");
        homePage.getFindStores().click();
        logger.info("Successfully validated The Find Stores link");
    }

    @Test
    public void checkREDcardLink() {
        Assert.assertEquals(homePage.getREDcard().getText(),"REDcard");
        homePage.getREDcard().click();
        logger.info("Successfully validated The REDcard link");
    }

    @Test
    public void checkRestockLink() {
        Assert.assertEquals(homePage.getRestock().getText(),"restock");
        homePage.getRestock().click();
        logger.info("Successfully validated The restock link");
    }












}
