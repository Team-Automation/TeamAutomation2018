package Util;

public class TestConnectDB {

    public static void main(String[] args) throws Exception{
        ConnectDB db = new ConnectDB();
        System.out.println(db.readDataBase());
    }
}
