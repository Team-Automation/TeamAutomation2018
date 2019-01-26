package searchTest;

import Report.TestLogger;
import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import search.SearchCards;

public class CardsTest extends CommonApi {
    SearchCards searchCards = null;

    @BeforeMethod
    public void intializedElements() {
        searchCards = PageFactory.initElements(driver, SearchCards.class);
    }
    @Test
    public void cardsTest1(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actualText = searchCards.clickCards1();
        Assert.assertEquals(actualText, null);
        System.out.println("Personal cards Test Passed");
    }
    @Test
    public void cardsTest2(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actualText = searchCards.clickCards2();
        Assert.assertEquals(actualText, null);
        System.out.println("Business cards Test Passed");
    }
    @Test
    public void cardsTest3(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actualText = searchCards.clickCards3();
        Assert.assertEquals(actualText, null);
        System.out.println("Corporate cards Test Passed");
    }
    @Test
    public void cardsTest4(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actualText = searchCards.clickCards4();
        Assert.assertEquals(actualText, null);
        System.out.println("Gift cards Test Passed");
    }
}

