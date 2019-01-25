package searchTest;

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
    public void webElementName(){// data driven test, using data from excel sheets
       List actual = readAmexWebElements.webElementList();
        List expected = readAmexWebElements.expectedWebElement();
        Assert.assertEquals(actual,expected);

    }
   @Test
    public void webElementName1(){// data driven test, using data from excel sheets
        List actual = readAmexWebElements.webElementList1();
        List expected = readAmexWebElements.expectedWebElement1();
        Assert.assertEquals(actual,expected);
    }
}
