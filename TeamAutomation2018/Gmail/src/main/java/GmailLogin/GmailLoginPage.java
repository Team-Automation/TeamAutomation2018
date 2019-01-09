package GmailLogin;


import GmailAPI.GmailCommonAPI;
import base.CommonApi;

public class GmailLoginPage extends GmailCommonAPI {
    public void login(){
        typeOnElementEntry("//*[@id=\"identifierId\"]","nazibah95");
        //selectElementOnxpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/content/span");
        typeOnElementEntry("password","naz");



    }
}

