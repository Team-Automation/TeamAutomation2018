package SearchPage;

import base.CommonApi;

public class SearchPage extends CommonApi {
    public void searchMenu(){
        clickByXpath("//a[@class='nav-menu-links__link'][contains(text(),'Business')]");
        navigateBack();
    }

    public void liveTv() {
        clickByCss("#nav-mobileTV");
        navigateBack();
    }
    public void travelP() {
        clickByXpath("//a[contains(text(),'Travel')]");
        clickByXpath("//a[@class='Header__section'][contains(text(),'Destinations')]");
        clickByXpath("//a[contains(text(),'Brazil')]");
        navigateBack();
    }
    public void worldNews() {
        clickByXpath("//a[@class='nav-menu-links__link'][contains(text(),'World')]");
        clickByXpath("//a[@class='nav-section__submenu-item'][contains(text(),'Africa')]");
        clickByXpath("//a[@href='/2019/01/07/africa/gabon-army-seizes-country/index.html']//img[@class='media__image media__image--responsive']");
        navigateBack();
    }
    public void politics() {
        clickByXpath("//a[contains(text(),'Politics')]");
        clickByXpath("//header[@id='nav-header']//ul[@class='buckets']//li[1]");
        clickByXpath("//a[@href='/2018/12/23/politics/john-roberts-supreme-court-pause-mystery-company-subpoena/index.html']//img[@class='media__image media__image--responsive']");
        navigateBack();
    }

}
