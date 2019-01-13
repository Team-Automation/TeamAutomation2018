package Test;




import base.CommonApi;
import dataReader.ReadWebElement;
//import dataReader.ReadWebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

    public class XLSXTest extends CommonApi {



        ReadWebElement readWebElement;

        @BeforeMethod
        public void setUP(){
            readWebElement = PageFactory.initElements(driver,ReadWebElement.class);

        }
        @Test
        public void webElementName(){// data driven test, using data from excel sheets
            List actual = readWebElement.webElementList();
            List expected = readWebElement.expectedWebElement();
            Assert.assertEquals(actual,expected);

        }
        @Test
        public void webElementName1(){// data driven test, using data from excel sheets
            List actual = readWebElement.webElementList1();
            List expected = readWebElement.expectedWebElement1();
            Assert.assertEquals(actual,expected);
        }
    }

