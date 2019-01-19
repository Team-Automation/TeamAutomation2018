package datasource;

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
        //ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertStringDataFromArrayListToSqlTable(list, "headerList", "headers");
    }

    public static List<String> getHeaderValue() {
        List<String> headerList = new ArrayList<>();
        headerList.add("My Account");
        headerList.add("Cards");
        headerList.add("Travel");
        headerList.add("Rewards");
        headerList.add("Business");
        return headerList;
    }

    public List<String> getUserDatafromDB() throws Exception {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("headerList", "headers");
        System.out.println(list);
        return list;

    }

    @FindBy(how = How.CSS, css = "#label-myAccount")
    WebElement myAccount;
    @FindBy(css = "#label-cards")
    WebElement cards;
    @FindBy(css = "#label-travel")
    WebElement travel;
    @FindBy(css = "#label-rewards")
    WebElement rewards;
    @FindBy(css = "#label-business")
    WebElement business;

    public List getHeadersValue1() {
        List<WebElement> headerList1 = new ArrayList<>();
        headerList1.add(myAccount);
        headerList1.add(cards);
        headerList1.add(travel);
        headerList1.add(rewards);
        headerList1.add(business);

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