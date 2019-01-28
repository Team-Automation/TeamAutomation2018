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
        connectToSqlDB.insertStringDataFromArrayListToSqlTable(list, "topHeaderList", "headers");
    }

    public static List<String> getHeaderValue() {
        List<String> headerList = new ArrayList<>();
        headerList.add("Registries & Lists");
        headerList.add("Weekly Ad");
        headerList.add("REDcard");
        headerList.add("Gift Cards");
        headerList.add("Orders");
        return headerList;
    }

    public List<String> getUserDatafromDB() throws Exception {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("topHeaderList", "headers");
        System.out.println(list);
        return list;

    }

    @FindBy(linkText = "Registries & Lists")
    WebElement registriesList;
    @FindBy(linkText = "Weekly Ad")
    WebElement weeklyAd;
    @FindBy(linkText = "REDcard")
    WebElement redCard;
    @FindBy(linkText = "Gift Cards")
    WebElement giftCards;
    @FindBy(linkText = "Orders")
    WebElement orders;

    public List getHeadersValue1() {
        List<WebElement> headerList1 = new ArrayList<>();
        headerList1.add(registriesList);
        headerList1.add(weeklyAd);
        headerList1.add(redCard);
        headerList1.add(giftCards);
        headerList1.add(orders);

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
        List<String> list = connectToSqlDB.readDataBase("topHeaderList", "headers");
        for (String st : list) {
            System.out.println(st);
        }
    }
}