package search;

import base.CommonApi;

public class SearchPage extends CommonApi {
    public void searchMenu() throws InterruptedException {
clickByXpath("//body//div[@id='amex-header']//div[@class='axp-global-header__dls__module___xKqaf']//div[@class='axp-global-header__GlobalHeader__globalHeader___1FtPO axp-global-header__GlobalHeader__withoutSAN___3mTIg axp-global-header__dls__nav___3fRQ- axp-global-header__dls__navSticky___1z47-']//div[@class='axp-global-header__GlobalHeader__horizontalNav___xpeRa axp-global-header__dls__nav___3fRQ- axp-global-header__dls__navHorizontal___WMUzY axp-global-header__dls__borderB___2Mn8V axp-global-header__dls__navLarge___2ep_Q axp-global-header__dls__dlsAccentWhite01Bg___3JnPj']//div[@class='axp-global-header__GlobalHeader__navContainer___1OEUJ axp-global-header__dls__container___1nKch axp-global-header__dls__widthFull___LPsPQ']//div[@class='axp-global-header__GlobalHeader__navContainer___1OEUJ axp-global-header__dls__nav___3fRQ- axp-global-header__dls__navLarge___2ep_Q axp-global-header__dls__navMenu___2w1E3 axp-global-header__dls__pad0___uN5vJ']//div//div//span//label[1]//span[1]");
        sleepFor(10);
typeByXpath("//input[@placeholder='Search']","finance");



    }
}
