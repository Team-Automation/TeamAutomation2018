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
        connectToSqlDB.insertStringDataFromArrayListToSqlTable(list, "Items", "headers");
    }

    public static List<String> getHeaderValue() {
        List<String> headerList = new ArrayList<>();
        headerList.add("Motors");
        headerList.add("Fashion");
        headerList.add("Electronics");
        headerList.add("Collectibles");
        headerList.add("Home");
        headerList.add("toys");
        return headerList;
    }

    public List<String> getUserDatafromDB() throws Exception {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("Items", "headers");
        System.out.println(list);
        return list;

    }

    @FindBy(how = How.XPATH, xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a")
    WebElement Motors;
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a")
    WebElement Fashion;
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a")
    WebElement Electronics;
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[6]")
    WebElement Collectibles;
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[7]")
    WebElement Home;
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[9]/a")
    WebElement toys;

    public List getHeadersValue1() {
        List<WebElement> headerList1 = new ArrayList<>();
        headerList1.add(Motors);
        headerList1.add(Fashion);
        headerList1.add(Electronics);
        headerList1.add(Collectibles);
        headerList1.add(Home);
        headerList1.add(toys);


        List<String> list = new ArrayList<>();
        for (int i = 0; i < headerList1.size(); i++) {
            list.add(headerList1.get(i).getText());
        }
        System.out.println(list);
        return list;
    }

    public static void main(String[] args) throws Exception {
        insertDataIntoDB();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> list = connectToSqlDB.readDataBase("Items", "headers");
        for (String st : list) {
            System.out.println(st);
        }
    }
}