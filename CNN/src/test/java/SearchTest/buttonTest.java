package SearchTest;

import ButtonsPage.ButtonsPageSearch;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class buttonTest extends ButtonsPageSearch {
    ButtonsPageSearch buttonsPage = null;

    @BeforeMethod
    public void initializeElement() {
        buttonsPage = PageFactory.initElements(driver, ButtonsPageSearch.class); }
    @Test
    public void Test1() {
        buttonsPage.getAfrica().click(); }
    @Test
    public void Test2() {
        buttonsPage.getAmericas().click(); }
    @Test
    public void Test3() {
        buttonsPage.getAsia().click(); }
    @Test
    public void Test4() {
        buttonsPage.getAustralia().click(); }
    @Test
    public void Test5() {
        buttonsPage.getEurope().click(); }
    @Test
    public void Test6() {
        buttonsPage.getMiddleEast().click(); }
    @Test
    public void Test7() {
        buttonsPage.getUK().click(); }
    @Test
    public void Test8() {
        buttonsPage.getCrime().click(); }
    @Test
    public void Test9() {
        buttonsPage.getEnergy().click(); }
    @Test
    public void Test10() {
        buttonsPage.getWeather().click(); }
    @Test
    public void Test11() {
        buttonsPage.getScience().click(); }
    @Test
    public void Test12() {
        buttonsPage.getCongress().click();
    }
    @Test
    public void Test13() {
        buttonsPage.getSupremeCourt().click(); }
    @Test
    public void Test14() {
        buttonsPage.getElectionResults().click();
    }

}
