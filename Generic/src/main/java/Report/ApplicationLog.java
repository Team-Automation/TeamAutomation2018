package Report;


public class ApplicationLog {
    public static void launchBrowser () {
        TestLogger.log("Attempts to launch browser");
    }
    public static void browserLaunched() {
        TestLogger.log("Browser launched");
    }

}


/*
public class ApplicationLog {
    public static void epicLogger(){
        //TestLogger.log(epic);
        TestLogger.log("Browser is launching");
    }
}*/
