package dataDriven;

import Report.TestLogger;
import applicationBase.ApplicationPageBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import page.objects.SearchPage;

public class SearchTest extends ApplicationPageBase {
    SearchPage searchPage;

    @BeforeMethod
    public void initializationOfElements () {
        searchPage = PageFactory.initElements(driver, SearchPage.class);
    }

    @Test(dataProvider = "setData")
    public void searchItems(String keys){
        searchPage.searchInputandSubmitButton(keys);
        TestLogger.log("Successfully passed The Search Test");
    }

    @DataProvider
    public Object [] setData () {
        Object[] data=new Object[22];
        data [0] = "Iphone XR";
        data [1] = "Samsung s9 plus";
        data [2] = "Macbook pro";
        data [3] = "Google Smart Light Starter Kit";
        data [4] = "Ipad Pro";
        data [5] = "Samsung not9";
        data [6] = "TP-Link Smart Wi-Fi Plug Mini - White (HS105)";
        data [7] = "Iphone XS Max";
        data [8] = "Kinsa Smart Ear Thermometer";
        data [9] = "Samsung s9 plus";
        data [10] = "iRobot Roomba 890 Robot Vacuum";
        data [11] = "All Nintendo Switch";
        data [12] = "PS4";
        data [13] = "Fortnite";
        data [14] = "Pc Games";
        data [15] = "Xbox";
        data [16] = "T-Shirt";
        data [17] = "Football";
        data [18] = "Cricket Bat";
        data [19] = "HeadPhones";
        data [20] = "Dell Laptop";
        data [21] = "Pen";


        return data;
    }


}
