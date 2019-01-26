package searchTest;
import Report.TestLogger;
import base.CommonApi;
import dataReader.ReadAmexWebElements;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;
public class XLSXTest extends CommonApi {
    ReadAmexWebElements readAmexWebElements;
    @BeforeMethod
    public void intializedElements(){
        readAmexWebElements = PageFactory.initElements(driver,ReadAmexWebElements.class);
    }
    @Test
    public void webElementName(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       List actual = readAmexWebElements.webElementList();
        List expected = readAmexWebElements.expectedWebElement();
        Assert.assertEquals(actual,expected);
    }
   @Test
    public void webElementName1(){
       TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List actual = readAmexWebElements.webElementList1();
        List expected = readAmexWebElements.expectedWebElement1();
        Assert.assertEquals(actual,expected);
    }
}
