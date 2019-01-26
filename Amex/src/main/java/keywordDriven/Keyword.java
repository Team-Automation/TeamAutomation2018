package keywordDriven;
import Report.TestLogger;
import base.CommonApi;
import org.openqa.selenium.By;
import reader.Readxls;
public class Keyword extends CommonApi {
    public void input_Username() {
        driver.findElement(By.cssSelector("#login-user")).sendKeys("mercury");
    }

    public void input_Password() {
        driver.findElement(By.cssSelector("#login-password")).sendKeys("joihjhk");
    }

    public void click_Login() {
        driver.findElement(By.cssSelector("#login-submit")).click();
    }
    public void keywordWebElement() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Keyword Actions = new Keyword();
        String sPath = "C:\\Users\\adibi\\Desktop\\nayna\\Team_Automation2018\\Amex\\Data\\AMEXWebElements.xlsx";
        Readxls.setExcelFile(sPath, "login2");
        for (int i = 1; i <= 3; i++) {
            String sActions = Readxls.getCellData(i, 1);
            System.out.println(sActions);
//            switch (sActions) {
//            case "input_Username":
//                input_Username();
//                break;
//            case "input_Password":
//                input_Password();
//                break;
//            case "click_Login":
//                click_Login();
//                break;
//            default:
//                throw new InvalidArgumentException("Invalid login");
//        }
//        System.out.println(sActions);
//    }
        }
    }
}





