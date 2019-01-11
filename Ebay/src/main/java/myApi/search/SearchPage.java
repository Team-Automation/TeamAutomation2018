package myApi.search;

import base.CommonApi;
import myApi.EbayApi;
import org.testng.annotations.Test;

public class SearchPage extends CommonApi {
   public void register(){
       clickByXpath("//span[@id='gh-ug-flex']/a[@href='https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F']");
       typeByCss("#firstname", "Lazimul");
       typeByCss("#lastname", "Haque");
       typeByCss("#email", "haquelazimul@yahoo.com");
       typeByCss("#PASSWORD", "1993");
       clickById("ppaFormSbtBtn");
       navigateBack();
   }
    public void login(){
        typeByCss("#userid", "haquelazimul@yahoo.com");
        typeByCss("#pass", "710727");
        clickById("sgnBt");
    }

   public void SearchOption() {
       typeByCssThenEnter("#gh-ac", "motoralla phone");
       navigateBack();
       typeByCssThenEnter("#gh-ac", "books");
       navigateBack();
       typeByCssThenEnter("#gh-ac", "toys");
       navigateBack();
       clickByCss(".gh-eb-li-a");
       System.out.println("This concludes the end of initial trial test");
   }
}
