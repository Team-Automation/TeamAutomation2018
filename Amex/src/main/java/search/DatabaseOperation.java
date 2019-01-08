package search;

import Util.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;

public class DatabaseOperation {
    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public static void insertDataIntoDB(){
        List<String> list = getItemValue();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertStringDataFromArrayListToSqlTable(list,"itemList","items");
    }
    public static List<String> getItemValue() {
        List<String> itemList = new ArrayList<>();
        itemList.add("Credit Score");
        itemList.add("Loan");
        itemList.add("Finance");
        itemList.add("APR rate");
        itemList.add("Annual fees");
        itemList.add("Pre-Approval");
        return itemList;
    }
    public List<String> getUserDatafromDB()throws Exception{
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("itemList","items");
        return list;
    }

    public static void main(String[] args) throws Exception {
    insertDataIntoDB();
    ConnectToSqlDB connectToSqlDB =new ConnectToSqlDB();
    List<String> list = connectToSqlDB.readDataBase("itemList","itemList");
    for (String st : list){
        System.out.println(st);
    }
    }
}
