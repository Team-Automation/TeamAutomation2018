package GmailLogin;


import GmailAPI.GmailCommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.util.concurrent.TimeUnit;

public class GmailLoginPage extends GmailCommonAPI {

    public void login() {

        typeOnElementEntry("//*[@id='identifierId']", "chocolategirl1995");
        typeOnElementEntry("password", "girl1995");
        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
      //  WebDriver.Timeouts timeouts = driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
       // getEelementsByCss(".aic .z0 div");


    }

    public void composeMail() {
        login();

      getEelementsByCss(".T-I.J-J5-Ji.T-I-KE.L3");
      //  putElementOnCss(".oj div textarea", "chocolategirl1995");
        typeByXpath("//*[@id=':px']","chocolategirl1995");
        putElementOnCss(".aoD.az6 input", "naz");
        putElementOnCss(".Ar.Au div","naz");
        getEelementsByxpath("//*[@id=':p5']");

    }


}