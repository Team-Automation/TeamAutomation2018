package SearchTest;

import base.CommonApi;
import dataReader.ReadCNNWebElements;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class XLSXTest extends CommonApi {

    ReadCNNWebElements readCNNWebElements;

    @BeforeMethod
    public void setUP(){
        readCNNWebElements = PageFactory.initElements(driver,ReadCNNWebElements.class);

    }
    @Test
    public void webElementName(){// data driven test, using data from excel sheets
        List actual = readCNNWebElements.webElementList();
        List expected = readCNNWebElements.expectedWebElement();
        Assert.assertEquals(actual,expected);

    }
    @Test
    public void webElementName1(){// data driven test, using data from excel sheets
        List actual = readCNNWebElements.webElementList1();
        List expected = readCNNWebElements.expectedWebElement1();
        Assert.assertEquals(actual,expected);
    }
}
