package search;

import Util.ConnectToSqlDB;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

public class DatabaseOperation {
    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

    public static void insertDataIntoDB() {
        List<String> list = getHeaderValue();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertStringDataFromArrayListToSqlTable(list, "headerList", "headers");
    }

    public static List<String> getHeaderValue() {
        List<String> headerList = new ArrayList<>();
        headerList.add("My Account");
        headerList.add("asia");
        headerList.add("Travel");
        headerList.add("Rewards");
        headerList.add("Business");
        headerList.add("Help");
        return headerList;
    }

    public List<String> getUserDatafromDB() throws Exception {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("headerList", "headers");
        System.out.println(list);
        return list;

    }

    @FindBy(how = How.XPATH, xpath = "//a[@class='m-legal__links'][contains(text(),'Terms of Use')]")
    WebElement TermOfUse;
    @FindBy(xpath = "//a[@class='m-legal__links'][contains(text(),'Privacy Policy')]")
    WebElement PrivatePolicy;
    @FindBy(xpath = "//a[contains(text(),'Accessibility & CC')]")
    WebElement Accessibility;
    @FindBy(xpath = "//a[contains(text(),'AdChoices')]")
    WebElement AdChoices;
    @FindBy(xpath = "//a[contains(text(),'CNN Studio Tours')]")
    WebElement CNNStudioTours;
    @FindBy(xpath = "//a[contains(text(),'CNN Newsource')]")
    WebElement CNNNewsource;

    public List getHeadersValue1() {
        List<WebElement> headerList1 = new ArrayList<>();
        headerList1.add(TermOfUse);
        headerList1.add(PrivatePolicy);
        headerList1.add(Accessibility);
        headerList1.add(AdChoices);
        headerList1.add(CNNStudioTours);
        headerList1.add(CNNNewsource);


        List<String> list = new ArrayList<>();
        for (int i = 0; i<headerList1.size();i++){
            list.add(headerList1.get(i).getText());
        }
        System.out.println(list);
        return list;
    }
    public static void main(String[] args) throws Exception {
        insertDataIntoDB();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> list = connectToSqlDB.readDataBase("headerList", "headers");
        for (String st : list) {
            System.out.println(st);
        }
    }
}