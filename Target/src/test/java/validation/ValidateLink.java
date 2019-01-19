package validation;

import Report.TestLogger;
import applicationBase.ApplicationPageBase;
import org.testng.annotations.BeforeMethod;
import page.objects.HomePage;
import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

  public class ValidateLink extends ApplicationPageBase {
      public HomePage homePage;

      @BeforeMethod
      public void initialize () {
      homePage = PageFactory.initElements(driver, HomePage.class);
      }

      @Test // validate categories link
      public void validateCategories () {
        Assert.assertEquals(homePage.getCategoriesText(),"Categories");
        TestLogger.log("Successfully validated Text message");
      }

      @Test //validate singIn link in homePage
      public void validateSignIn () {
        Assert.assertTrue(homePage.getSignIn().isDisplayed());
        click(homePage.getSignIn(),"SignIn");
        TestLogger.log("Successfully validated The link");
    }

    @Test //validate Trending link in homePage
    public void validateTrending () {
        Assert.assertFalse(homePage.getTrending().isSelected());
    }

    @Test
    public void checkTargetFind () {
        Assert.assertTrue(homePage.getTargetFind().isDisplayed());
        click(homePage.getTargetFind(),"findElements.Target Find");
        TestLogger.log("Successfully validated The findElements.Target Find link");
    }

    @Test
    public void checkWellChosenLink () {
        Assert.assertTrue(homePage.getWellChosen().isDisplayed());
        click(homePage.getWellChosen(),"WellChosen");
        TestLogger.log("Successfully validated The Well Chosen link");
    }

    @Test
    public void checkColdWeatherShopLink() {
        Assert.assertTrue(homePage.getColdWeatherShop().isDisplayed());
        click(homePage.getColdWeatherShop(),"ColdWeatherShop");
        TestLogger.log("Successfully validated The Cold Weather Shop link");
    }

    @Test
    public void checkWomensLink() {
        Assert.assertTrue(homePage.getWomens().isDisplayed());
        click(homePage.getWomens(),"Women’s");
        TestLogger.log("Successfully validated The Women’s link");
    }

    @Test
    public void checkMensLink() {
        Assert.assertTrue(homePage.getMens().isDisplayed());
        click(homePage.getMens(),"Men's");
        TestLogger.log("Successfully validated The Men’s link");
    }

    @Test
    public void checkHomeLink() {
        Assert.assertEquals(homePage.getHome(),"Home");
        TestLogger.log("Successfully validated The Home link");
    }

    @Test
    public void checkBabyLink() {
        Assert.assertTrue(homePage.getBaby().isDisplayed());
        click(homePage.getBaby(),"Baby" );
        TestLogger.log("Successfully validated The Baby link");
    }

    @Test
    public void checkKidsLink() {
        Assert.assertEquals(homePage.getKids(),"Kids’");
        TestLogger.log("Successfully validated The kids link");
    }

    @Test
    public void checkKitchenDiningLink() {
        Assert.assertTrue(homePage.getKitchenDining().isDisplayed());
        click(homePage.getKitchenDining(),"Kitchen & Dining");
        TestLogger.log("Successfully validated The Kitchen & Dining link");
    }

    @Test
    public void checkElectronicsLink() {
        Assert.assertEquals(homePage.getElectronics().getText(),"Electronics");
        click(homePage.getElectronics(),"Electronics");
        TestLogger.log("Successfully validated The Electronics link");
    }

    @Test
    public void checkVideoGamesLink() {
        Assert.assertEquals(homePage.getVideoGames(),"Video Games");
        TestLogger.log("Successfully validated The Video Games link");
    }

    @Test
    public void checkToysLink() {
        Assert.assertTrue(homePage.getToys().isDisplayed());
        click(homePage.getToys(),"Toys");
        TestLogger.log("Successfully validated The Toys link");
    }

    @Test
    public void checkBeautyLink() {
        Assert.assertTrue(homePage.getBeauty().isDisplayed());
        click(homePage.getBeauty(),"Beauty");
        TestLogger.log("Successfully validated The Beauty link");
    }

    @Test
    public void checkGroceryLink() {
        Assert.assertEquals(homePage.getGrocery(),"Grocery");
        TestLogger.log("Successfully validated The Grocery link");
    }

    @Test
    public void checkTopDealsLink() {
        Assert.assertTrue(homePage.getTopDeals().isDisplayed());
        click(homePage.getTopDeals(),"Top Deals");
        TestLogger.log("Successfully validated The Top Deals link");
    }

    @Test
    public void checkHouseholdEssentialsLink() {
        Assert.assertTrue(homePage.getHouseholdEssentials().isDisplayed());
        click(homePage.getHouseholdEssentials(),"HouseholdEssentials");
        TestLogger.log("Successfully validated The Household Essentials link");
    }

    @Test
    public void checkFurnitureLink() {
        Assert.assertEquals(homePage.getFurnitures().getText(),"Furniture");
        click(homePage.getFurnitures(),"Furnitures");
        Assert.assertEquals(homePage.getFurnitures().getText(),"Furniture");
        TestLogger.log("Successfully validated The Furnitures link");
    }

    @Test
    public void checkLink() {
        Assert.assertTrue(homePage.getClearance().isDisplayed());
        click(homePage.getClearance(),"Clearance");
       TestLogger.log("Successfully validated The Clearance link");
    }

    @Test
    public void checkRegistriesListsLink() {
        Assert.assertEquals(homePage.getRegistriesLists(),"Registries & Lists");
        TestLogger.log("Successfully validated The Registries Lists link");
    }

    @Test
    public void checkWeeklyAdLink() {
        Assert.assertEquals(homePage.getWeeklyAd(),"Weekly Ad");
       TestLogger.log("Successfully validated The Weekly Ad link");
    }

    @Test
    public void checkGiftCardsLink() {
        Assert.assertEquals(homePage.getGiftCards(),"Gift Cards");
        TestLogger.log("Successfully validated The Gift Cards link");
    }

    @Test
    public void checkFindStoresLink() {
        Assert.assertEquals(homePage.getFindStores(),"Find Stores");
        TestLogger.log("Successfully validated The Find Stores link");
    }

    @Test
    public void checkREDcardLink() {
        Assert.assertEquals(homePage.getREDcard(),"REDcard");
        TestLogger.log("Successfully validated The REDcard link");
    }

    @Test
    public void checkRestockLink() {
        Assert.assertTrue(homePage.getRestock().isDisplayed());
        click(homePage.getRestock(),"Restock");
        TestLogger.log("Successfully validated The restock link");

    }



}
