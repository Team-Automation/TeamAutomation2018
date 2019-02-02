package Test;

import myApi.EbayApi;
import myApi.login.CreateLogSearch;
import myApi.search.SearchItem;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class login extends EbayApi {
    CreateLogSearch createLogSearch;
    SearchItem search;
    @BeforeMethod
    public void initialize() {
        createLogSearch = PageFactory.initElements(driver, CreateLogSearch.class);
        search = PageFactory.initElements(driver, SearchItem.class);
    }
    @Test
    public void invalidLogin() {
        createLogSearch.clickSign();
        createLogSearch.setUserName(username);
        createLogSearch.setPassword(password);
        createLogSearch.clickSubmit();
        Assert.assertFalse(createLogSearch.getSign().isDisplayed());
        logger.info("Tried using invalid password to log in");
    }
    @Test
    public void emailBoxcheck() {
        createLogSearch.clickSign();
        createLogSearch.setUserName(username);
        logger.info("email checked");
    }
    @Test
    public void passwordBoxCheck() {
        createLogSearch.clickSign();
        createLogSearch.setPassword(password);
        logger.info("Invalid password used to login");
    }
    @Test
    public void signWithFb() {
        createLogSearch.clickSign();
        createLogSearch.clickFb();
        logger.info("clicked alternative log in method");
    }
    @Test
    public void clickregister() {
        createLogSearch.clickreg();
        logger.info("clicked to register account");
    }
    @Test
    public void enterFName() {
        createLogSearch.clickreg();
        createLogSearch.setTypeName(typename);
        logger.info("first name added");
    }
    @Test
    public void enterLName() {
        createLogSearch.clickreg();
        createLogSearch.setTypelname(typelName);
        logger.info("last name added");
    }
    @Test
    public void enterPwd(){
        createLogSearch.clickreg();
        createLogSearch.setCreatepassword(cpassword);
        logger.info("passowrd entered");
    }
    @Test
    public void createAccount(){
        createLogSearch.clickreg();
        createLogSearch.setTypeName(typename);
        createLogSearch.setTypelname(typelName);
        createLogSearch.setCreatepassword(cpassword);
        createLogSearch.submitreg();
        logger.info("created account");
    }
    @Test
    public void itemSearch(){
        search.searchandsubmit();
        logger.info("searched 3 items ");
    }
    @AfterMethod
    public void clear(){
        //cleanUp();
    }
}


