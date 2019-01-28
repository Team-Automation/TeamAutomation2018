package page.Object.Test;

import Report.TestLogger;
import applicationBase.ApplicationPageBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.CategoriesPage;

import page.objects.HomePage;

import java.util.concurrent.TimeUnit;

public class CategoriesPageTest extends ApplicationPageBase {

    HomePage homePage;
    CategoriesPage categoriesPage;

    @BeforeMethod
    public void initializationOfElements () {
        homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.getCategoriesPage();
        categoriesPage = PageFactory.initElements(driver,CategoriesPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void checkBedding () {
        Assert.assertTrue(categoriesPage.getBedding().isDisplayed());
        click(categoriesPage.getBedding(),"Bedding");
        TestLogger.log("Successfully validated The Bedding link");
    }

    @Test
    public void checkBikes () {
        Assert.assertTrue(categoriesPage.getBikes().isDisplayed());
        click(categoriesPage.getBikes(),"Bikes");
        TestLogger.log("Successfully validated The Bikes link");
    }


    @Test
    public void checkBooks () {
        Assert.assertTrue(categoriesPage.getBooks().isDisplayed());
        click(categoriesPage.getBooks(),"Books");
        TestLogger.log("Successfully validated The Books link");
    }

    @Test
    public void checkFanShop () {
        Assert.assertTrue(categoriesPage.getFanShop().isDisplayed());
        click(categoriesPage.getFanShop(),"FanShop");
        TestLogger.log("Successfully validated The Fan Shop link");
    }


    @Test
    public void checkCharacterShop () {
        Assert.assertTrue(categoriesPage.getCharacterShop().isDisplayed());
        click(categoriesPage.getCharacterShop(),"Character Shop");
        TestLogger.log("Successfully validated The Character Shop link");
    }

    @Test
    public void checkMusic () {
        Assert.assertTrue(categoriesPage.getMusic().isDisplayed());
        click(categoriesPage.getMusic(),"Music");
        TestLogger.log("Successfully validated The Music link");
    }


    @Test
    public void checkRugs () {
        Assert.assertTrue(categoriesPage.getRugs().isDisplayed());
        click(categoriesPage.getRugs(),"Rugs");
        TestLogger.log("Successfully validated The Rugs link");
    }

    @Test
    public void checkGearActivity() {
        Assert.assertTrue(categoriesPage.getGearActivity().isDisplayed());
        click(categoriesPage.getGearActivity(),"Gear & Activity");
        TestLogger.log("Successfully validated The Gear & Activity link");
    }

    @Test
    public void checkYoungAdult () {
        Assert.assertTrue(categoriesPage.getYoungAdult().isDisplayed());
        click(categoriesPage.getYoungAdult(),"Young Adult");
        TestLogger.log("Successfully validated The Young Adult link");
    }

    @Test
    public void checkMens () {
        Assert.assertTrue(categoriesPage.getMens().isDisplayed());
        click(categoriesPage.getMens(),"Mens");
        TestLogger.log("Successfully validated The Mens link");
    }


    @Test
    public void checkWomens () {
        Assert.assertTrue(categoriesPage.getWomens().isDisplayed());
        click(categoriesPage.getWomens(),"Books");
        TestLogger.log("Successfully validated The Womens link");
    }

    @Test
    public void checkStrollers () {
        Assert.assertTrue(categoriesPage.getStrollers().isDisplayed());
        click(categoriesPage.getStrollers(),"Strollers");
        TestLogger.log("Successfully validated The Strollers link");
    }


    @Test
    public void checkCarSeats () {
        Assert.assertTrue(categoriesPage.getCarSeats().isDisplayed());
        click(categoriesPage.getCarSeats(),"Car Seats");
        TestLogger.log("Successfully validated The Car Seats link");
    }

    @Test
    public void checkHomeDecor () {
        Assert.assertTrue(categoriesPage.getHomeDecor().isDisplayed());
        click(categoriesPage.getHomeDecor(),"Home Decor");
        TestLogger.log("Successfully validated The Home Decor link");
    }


    @Test
    public void checkNursery () {
        Assert.assertTrue(categoriesPage.getNursery().isDisplayed());
        click(categoriesPage.getNursery(),"Nursery");
        TestLogger.log("Successfully validated The Nursery link");
    }

    @Test
    public void checkShoes() {
        Assert.assertTrue(categoriesPage.getShoes().isDisplayed());
        click(categoriesPage.getShoes(),"Shoes");
        TestLogger.log("Successfully validated The Shoes link");
    }

    @Test
    public void checkToys () {
        Assert.assertTrue(categoriesPage.getToys().isDisplayed());
        click(categoriesPage.getToys(),"Toys");
        TestLogger.log("Successfully validated The Toys link");
    }

    @Test
    public void checkBaby () {
        Assert.assertTrue(categoriesPage.getBaby().isDisplayed());
        click(categoriesPage.getBaby(),"Baby");
        TestLogger.log("Successfully validated The Baby link");

    }


    @Test
    public void checkMovies () {
        Assert.assertTrue(categoriesPage.getMovies().isDisplayed());
        click(categoriesPage.getMovies(),"Movies");
        TestLogger.log("Successfully validated The Movies link");
    }

    @Test
    public void checkTvShows () {
        Assert.assertTrue(categoriesPage.getTvShows().isDisplayed());
        click(categoriesPage.getTvShows(),"Tv Shows");
        TestLogger.log("Successfully validated The Tv Shows link");
    }


    @Test
    public void checkLuggage () {
        Assert.assertTrue(categoriesPage.getLuggage().isDisplayed());
        click(categoriesPage.getLuggage(),"Luggage");
        TestLogger.log("Successfully validated The Luggage link");
    }

    @Test
    public void checkFurniture () {
        Assert.assertTrue(categoriesPage.getFurniture().isDisplayed());
        click(categoriesPage.getFurniture(),"Furniture");
        TestLogger.log("Successfully validated The Furniture link");
    }

    @Test
    public void checkTailgating () {
        Assert.assertTrue(categoriesPage.getTailgating().isDisplayed());
        click(categoriesPage.getTailgating(),"Tailgating");
        TestLogger.log("Successfully validated The Tailgating link");
    }

    @Test
    public void checkSkincare() {
        Assert.assertEquals(categoriesPage.getSkinCare(),"Skincare");
        TestLogger.log("Successfully validated The Skincare link");
    }

    @Test
    public void checkMakeup() {
        Assert.assertEquals(categoriesPage.getMakeup(),"Makeup");
        TestLogger.log("Successfully validated The Makeup link");
    }


    @Test
    public void checkDeodorant() {
        Assert.assertEquals(categoriesPage.getDeodorant(),"Deodorant");
        TestLogger.log("Successfully validated The Deodorant link");
    }

    @Test
    public void checkKids() {
        Assert.assertEquals(categoriesPage.getKids(),"Kids’");
        TestLogger.log("Successfully validated The Kids link");
    }

    @Test
    public void checkBabyToys() {
        Assert.assertEquals(categoriesPage.getBabyToys(),"Baby Toys");
        TestLogger.log("Successfully validated The Baby Toys link");
    }

    @Test
    public void checkFirstAid() {
        Assert.assertEquals(categoriesPage.getFirstAid(),"First Aid");
        TestLogger.log("Successfully validated The First Aid link");
    }

    @Test(enabled = false)
    public void checkMensGrooming() {
        Assert.assertEquals(categoriesPage.getMensGrooming(),"Men's Grooming");
        TestLogger.log("Successfully validated The Men's Grooming link");
    }

    @Test
    public void checkHealthSafety() {
        Assert.assertEquals(categoriesPage.getHealthSafety(),"Health & Safety");
        TestLogger.log("Successfully validated The Health & Safety link");
    }

}
