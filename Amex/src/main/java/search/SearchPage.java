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
    @FindBy(xpath = "//a[@title='Where can I find my Annual Percentage Rate (APR) online?']")
    WebElement APR;
    public String clicksearch3() throws Exception {
        searchbutton.click();
        sleepFor(2);
        search.sendKeys("APR");
        searchSubmit.click();
       String text = APR.getText();
        return text ;
    }
    @FindBy(xpath = "//a[@title='Where can I find my Annual Percentage Rate (APR) online?']")
    WebElement travelBenefits;
    public String clicksearch4() throws Exception {
        searchbutton.click();
        sleepFor(2);
        search.sendKeys("Travel");
        searchSubmit.click();
        String text = travelBenefits.getText();
        return text ;
    }
    @FindBy(xpath = "//p[contains(text(),'American Express Serve® Cash Back, your prepaid de')]")
    WebElement cashback;
    public String clicksearch5() throws Exception {
        searchbutton.click();
        sleepFor(2);
        search.sendKeys("Cash Back");
        searchSubmit.click();
        String text = cashback.getText();
        return text ;
    }
    @FindBy(xpath = "//p[contains(text(),'American Express Serve® Cash Back, your prepaid de')]")
    WebElement ATM;
    public String clicksearch6() throws Exception {
        searchbutton.click();
        sleepFor(2);
        search.sendKeys("ATM");
        searchSubmit.click();
        String text = ATM.getText();
        return text ;
    }
    @FindBy(xpath = "//p[contains(text(),'American Express Serve® Cash Back, your prepaid de')]")
    WebElement prepaid;
    public String clicksearch7() throws Exception {
        searchbutton.click();
        sleepFor(2);
        search.sendKeys("Prepaid Cards");
        searchSubmit.click();
        String text = prepaid.getText();
        return text ;

    }
    @FindBy(xpath = "//a[@title='Accept Credit Cards | American Express®']")
    WebElement accept;
    public String clicksearch8() throws Exception {
        searchbutton.click();
        sleepFor(2);
        search.sendKeys("Accept Credit Card");
        searchSubmit.click();
        String text =accept.getText();
        return text ;
    }
    @FindBy(xpath = "//p[contains(text(),'American Express Supplier Management and Supply Ch')]")
    WebElement supplier;
    public String clicksearch9() throws Exception {
        searchbutton.click();
        sleepFor(2);
        search.sendKeys("Supplier Management");
        searchSubmit.click();
        String text =supplier.getText();
        return text ;
    }
    @FindBy(xpath = "//p[contains(text(),'Choose the Membership Rewards® Program best for yo')]")
    WebElement membership;
    public String clicksearch10() throws Exception {
        searchbutton.click();
        sleepFor(2);
        search.sendKeys("Membership");
        searchSubmit.click();
        String text = membership.getText();
        return text;
    }

    }

