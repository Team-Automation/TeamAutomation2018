package search;

import Report.ExtentManager;
import Report.TestLogger;
import base.CommonApi;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends CommonApi {


        @FindBy(how = How.XPATH, xpath = "//body//div[@id='amex-header']//div[@class='axp-global-header__dls__module___xKqaf']//div[@class='axp-global-header__GlobalHeader__globalHeader___1FtPO axp-global-header__GlobalHeader__withoutSAN___3mTIg axp-global-header__dls__nav___3fRQ- axp-global-header__dls__navSticky___1z47-']//div[@class='axp-global-header__GlobalHeader__horizontalNav___xpeRa axp-global-header__dls__nav___3fRQ- axp-global-header__dls__navHorizontal___WMUzY axp-global-header__dls__borderB___2Mn8V axp-global-header__dls__navLarge___2ep_Q axp-global-header__dls__dlsAccentWhite01Bg___3JnPj']//div[@class='axp-global-header__GlobalHeader__navContainer___1OEUJ axp-global-header__dls__container___1nKch axp-global-header__dls__widthFull___LPsPQ']//div[@class='axp-global-header__GlobalHeader__navContainer___1OEUJ axp-global-header__dls__nav___3fRQ- axp-global-header__dls__navLarge___2ep_Q axp-global-header__dls__navMenu___2w1E3 axp-global-header__dls__pad0___uN5vJ']//div//div//span//label[1]//span[1]")
        WebElement searchbutton;
        @FindBy(xpath = "//input[@placeholder='Search']")
        WebElement search;
        @FindBy(xpath = "//form[@class='axp-global-header__dls__search___cpT6y axp-global-header__dls__margin0___1PHt0']//button[@type='submit']")
         WebElement searchSubmit;
        @FindBy(xpath = "//p[contains(text(),'Your FICO® Score is one of many factors used by le')]")
         WebElement ficoScore;

        public String clicksearch1() throws Exception {
            searchbutton.click();
            sleepFor(2);
           search.sendKeys("credit Score");
           searchSubmit.click();

            String text = ficoScore.getText();
            return text ;
        }

    @FindBy(xpath = "//p[contains(text(),'The sitemap page can guide you to links for all yo')]")
    WebElement siteMap;


    public String clicksearch2() throws Exception {
        searchbutton.click();
        sleepFor(2);
        search.sendKeys("Investor Relations");
        searchSubmit.click();
        String text = siteMap.getText();
        return text ;
    }

    public String clicksearch3() throws Exception {
        searchbutton.click();
        sleepFor(2);
        search.sendKeys("APR");
        searchSubmit.click();
       String url = driver.getTitle();
        return url ;
    }
    }

