package GmailLogin;


import GmailAPI.GmailCommonAPI;
import base.CommonApi;

import java.util.concurrent.TimeUnit;

public class GmailLoginPage extends GmailCommonAPI {
    public void login() {
        typeOnElementEntry("//*[@id=\"identifierId\"]", "chocolategirl1995");
        typeOnElementEntry("password", "girl1995");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        clickByCss("");
    }


    public void search(){
        clickByXpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div/div[1]/div/div");


//        typeOnElementEntry("/html/body/div[7]/div[3]/div/div[1]/div[4]/header/div[2]/div[2]/div/form/div/input","naz");
//        getEelementsByxpath("//*[@id=\":2m\"]");

    }

    public void googleApps(){
        selectElementOnclass("T-I J-J5-Ji T-I-KE L3");
    }
}

