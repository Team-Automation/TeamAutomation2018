package searchTest;

import Report.TestLogger;
import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import search.DatabaseOperation;

import java.util.List;

public class DatabaseTest extends CommonApi {
    DatabaseOperation databaseOperation;
    @BeforeMethod
    public void intializedElements(){
        databaseOperation = PageFactory.initElements(driver, DatabaseOperation.class);

    }
    @Test
    public void webElementName() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List actual = databaseOperation.getUserDatafromDB();
        List expected = databaseOperation.getHeadersValue1();
        Assert.assertEquals(actual,expected);

    }
}
