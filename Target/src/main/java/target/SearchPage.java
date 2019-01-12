package target;

import base.CommonApi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

        @FindBy(css = "#search")
        WebElement searchInputWebElement;

        @FindBy(css = "[type='submit']")
        WebElement submitButtonWebElement;

        public SearchPage (WebDriver driver) {
            PageFactory.initElements(driver,this);
        }

        public WebElement getSearchInputWebElement() {
            return searchInputWebElement;
        }

        public WebElement getSubmitButtonWebElement() {
            return submitButtonWebElement;
        }
        public void searchFor(String value){
            getSearchInputWebElement().sendKeys(value);
        }
        public void submitSearchButton(){
            getSubmitButtonWebElement().click();
        }

        public void searchInputandSubmitButton () {
            searchFor("Iphone xs");
            submitSearchButton();
        }


}
