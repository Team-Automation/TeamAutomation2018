package Util;


public class DBConnectTest {

    static ConnectDB db = null;
    public static void main(String[] args)throws Exception {

        db = new ConnectDB();
        db.readDataBase();


    }
}
