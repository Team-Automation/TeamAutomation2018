package Mybase;

import base.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class Common extends CommonApi {


    public void typeByCss(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
    }
    public void clickByCss(String locator) {
        driver.findElement(By.cssSelector(locator)).click(); }
    public void clickByXpath(String locator) {
        driver.findElement(By.xpath(locator)).click(); }
    public void clickByClass (String locator){
        driver.findElement(By.className(locator)).click(); }
    public void typeOnCss(String locator, String value){
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER); }
    public void typeCSS (String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value); }
    public void clickCSS (String locator) {
        driver.findElement(By.cssSelector(locator)).click(); }
    public void clickId (String id) {
        driver.findElement(By.id(id)).click(); }
    public void typeOnID(String locator, String value){
        driver.findElement(By.id(locator)).sendKeys(value); }
    public void typeOnElement(String locator, String value){
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value);
        }catch(Exception ex1) {
            try{
                System.out.println("First Attempt was not successful");
                driver.findElement(By.name(locator)).sendKeys(value);
            }catch(Exception ex2) {
                try {
                    System.out.println("Second Attempt was not successful");
                    driver.findElement(By.xpath(locator)).sendKeys(value);
                } catch (Exception ex3) {
                    System.out.println("Third Attempt was not successful");
                    driver.findElement(By.id(locator)).sendKeys(value);
                }
            }
        }
    }
    public void typeOnElementNEnter(String locator, String value){
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
        }catch(Exception ex1) {
            try{
                System.out.println("First Attempt was not successful");
                driver.findElement(By.name(locator)).sendKeys(value, Keys.ENTER);
            }catch(Exception ex2) {
                try {
                    System.out.println("Second Attempt was not successful");
                    driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
                } catch (Exception ex3) {
                    System.out.println("Third Attempt was not successful");
                    driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
                }
            }
        }}

    public void clearField(String locator){
        driver.findElement(By.id(locator)).clear();
    }

    public void navigateBack(){
        driver.navigate().back();
    }
}