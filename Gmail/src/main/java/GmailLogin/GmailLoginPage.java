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
        WebDriver.Timeouts timeouts = driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
       // getEelementsByCss(".aic .z0 div");


    }

    public void composeMail() {

        login();


        getEelementsByCss(".T-I.J-J5-Ji.T-I-KE.L3");

//        getEelementsByCss(".T-I.J-J5-Ji.T-I-KE.L3");
//        selectElementOnclass(".T-I.J-J5-Ji.T-I-KE.L3");
//        getEelementsByxpath("//*[@id=':k9']/div/div");
      //  putElementOnCss(".oj div textarea", "chocolategirl1995");
        typeByXpath("//*[@id=':px']","chocolategirl1995@gmail.com");//*[@id=":1hl"]//*[@id=":nj"]//*[@id=":px"]
        typeByXpath("//*[@id=':pf']","naz");
        //putElementOnCss(".aoD.az6 input", "naz");
        typeByXpath("//*[@id=':qk']","naz");
        //putElementOnCss(".Ar.Au div","naz");
        getEelementsByxpath("//*[@id=':p5']");
//        selectElementOnclass(".J-Ke.n0");
        getEelementsByxpath("//*[@id=':kc']div");
//        selectElementOnclass(".J-Ke n0");
//        getSubmitByXpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div/div[1]/div[1]/div/div[5]/div/div/div[2]/span/a");


    }

    public void googleApps(){
        login();
        selectElementOnclass("gb_gf");
        getEelementsByxpath("//*[@id='gb192']/span[1]");
    }


}