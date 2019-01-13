package database;

import Util.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;

public class DatabaseOperation {
    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

    public static void insertDataIntoDB() {
        List<String> list = getSearchValue();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertStringDataFromArrayListToSqlTable(list, "searchList", "searchItems");
    }

    public static List<String> getSearchValue() {
        List<String> searchList = new ArrayList<>();
        searchList.add("My Account");
        searchList.add("Email");
        searchList.add("Drive");
        searchList.add("Hangouts");
        searchList.add("Spreadsheet");
        searchList.add("Help");
        return searchList;
    }

    public List<String> getUserDatafromDB() throws Exception {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("searchList", "searchItems");
        System.out.println(list);
        return list;

    }
    public static void main(String[] args) throws Exception {
        insertDataIntoDB();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> list = connectToSqlDB.readDataBase("searchList", "searchItems");
        for (String st : list) {
            System.out.println(st);
        }
    }
}
