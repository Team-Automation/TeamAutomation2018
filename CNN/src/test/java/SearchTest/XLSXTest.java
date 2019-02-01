package SearchTest;
import dataReader.ReadCNNWebElements;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;
public class XLSXTest extends ReadCNNWebElements {

    ReadCNNWebElements readCNNWebElements;
    @BeforeMethod
    public void intializedElements(){
        readCNNWebElements = PageFactory.initElements(driver,ReadCNNWebElements.class);
    }
    @Test
    public void webElementName(){// data driven test, using data from excel sheets
        List actual = readCNNWebElements.webElementList1();
        List expected = readCNNWebElements.expectedWebElement1();
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void webElementName1(){// data driven test, using data from excel sheets
        List actual = readCNNWebElements.webElementList2();
        List expected = readCNNWebElements.expectedWebElement2();
        Assert.assertEquals(actual,expected);
    }
}

