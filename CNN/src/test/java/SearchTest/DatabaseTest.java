package SearchTest;

import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import search.DatabaseOperation;

import java.util.List;

public class DatabaseTest extends DatabaseOperation {
    DatabaseOperation databaseOperation;
    @BeforeMethod
    public void intializedElements(){
        databaseOperation = PageFactory.initElements(driver, DatabaseOperation.class);

    }
    @Test
    public void webElementName() throws Exception {
        List actual = databaseOperation.getUserDatafromDB();
        List expected = databaseOperation.getHeadersValue1();
        Assert.assertEquals(actual,expected);

    }
}