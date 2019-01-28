package page.objects;

import applicationBase.ApplicationPageBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;

public class SearchPage extends ApplicationPageBase {

        @FindBy(css = "#search")
        WebElement searchInputWebElement;

        public SearchPage searchInputandSubmitButton(String keys) {
            sendKeys(searchInputWebElement,"Search Button",keys);
            return new SearchPage();
        }


}
