package GmailLogin;


import GmailAPI.GmailCommonAPI;
import base.CommonApi;

public class GmailLoginPage extends GmailCommonAPI {
    public void login() {
        typeOnElementEntry("//*[@id=\"identifierId\"]", "nazibah95");
        typeOnElementEntry("password", "Nazibah*");
    }

    public void search(){
        selectOnid1(":2j");

    }

    public void googleApps(){
        selectElementOnclass("T-I J-J5-Ji T-I-KE L3");
    }
}

