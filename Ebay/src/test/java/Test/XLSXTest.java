package Test;




import  base.CommonApi;
import dataReader.ReadWebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class XLSXTest extends CommonApi {

    ReadWebElement readWebElements;

    @BeforeMethod
    public void setUP(){
        readWebElements = PageFactory.initElements(driver,ReadWebElement.class);

    }
    @Test
    public void webElementName(){   // data driven test, using data from excel sheets
        List actual = readWebElements.webElementList();
        List expected = readWebElements.expectedWebElement();
        Assert.assertEquals(actual,expected);

    }
    }

