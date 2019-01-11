package search;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;


public class UserFeature {

    @FindBy(how = How.CSS, using = "#login-user")
    public static WebElement userInputWebElement;

    @FindBy(how = How.CSS, using = "#login-submit")
    public static WebElement submitButtonWebElement;

    public WebElement getUserInputWebElement() {

        return userInputWebElement;
    }

    public WebElement getSubmitButtonWebElement() {
        return submitButtonWebElement;
    }

    public void searchForUser(String value) {
        getUserInputWebElement().sendKeys(value);
    }

    public void submitSearchButton() {
        getSubmitButtonWebElement().click();
    }

    public void clearField() {
        getUserInputWebElement().clear();
    }

    public List<String> getUserData() {
        List<String> data = new ArrayList<>();
        data.add("Joynab");
        data.add("%&^%&*^");
        data.add("12345");
        return data;
    }

    public void searchUserAndSubmitButton() throws Exception {
//        DatabaseOperation databaseOperation = new DatabaseOperation();
//        List<String> list = databaseOperation.getUserDatafromDB();
        List<String> data = getUserData();
        for (int i = 0; i < data.size(); i++) {
            searchForUser(data.get(i));
            submitSearchButton();
            clearField();
        }

    }

    }
