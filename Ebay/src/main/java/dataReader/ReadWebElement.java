package dataReader;


import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import reader.Readxls;

import java.util.ArrayList;
import java.util.List;

public class ReadWebElement extends CommonApi {
        @FindBy(how = How.XPATH, xpath = "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul/li[1]/h3/a")
        WebElement BUY;
        @FindBy(xpath = "")
        WebElement Registration;
        @FindBy(xpath = "//ul[@class='axp-footer__dls__margin0___2Eiav axp-footer__dls__ulNav___31Cq4 axp-footer__dls__margin2T___1ZSVS axp-footer__dls__listLinks___2zEla']//a[@title='Investor Relations'][contains(text(),'Investor Relations')]")
        WebElement Money;
        @FindBy(xpath = "//ul[@class='axp-footer__dls__margin0___2Eiav axp-footer__dls__ulNav___31Cq4 axp-footer__dls__margin2T___1ZSVS axp-footer__dls__listLinks___2zEla']//a[@title='Careers'][contains(text(),'Careers')]")
        WebElement careers;
        @FindBy(xpath = "//ul[@class='axp-footer__dls__margin0___2Eiav axp-footer__dls__ulNav___31Cq4 axp-footer__dls__margin2T___1ZSVS axp-footer__dls__listLinks___2zEla']//a[@title='Site Map'][contains(text(),'Site Map')]")
        WebElement BuyingHelp;
        @FindBy(xpath = "//ul[@class='axp-footer__dls__margin0___2Eiav axp-footer__dls__ulNav___31Cq4 axp-footer__dls__margin2T___1ZSVS axp-footer__dls__listLinks___2zEla']//a[@title='Contact Us'][contains(text(),'Contact Us')]")
        WebElement Stores;
        @FindBy(how = How.XPATH, xpath = "//h2[contains(text(),'Products & Services')]")
        WebElement Sell;
        @FindBy(xpath = "//ul[@class='axp-footer__dls__margin0___2Eiav axp-footer__dls__ulNav___31Cq4 axp-footer__dls__margin2T___1ZSVS axp-footer__dls__listLinks___2zEla']//a[@title='Credit Cards'][contains(text(),'Credit Cards')]")
        WebElement StartSelling;
        @FindBy(xpath = "//ul[@class='axp-footer__dls__margin0___2Eiav axp-footer__dls__ulNav___31Cq4 axp-footer__dls__margin2T___1ZSVS axp-footer__dls__listLinks___2zEla']//a[@title='Small Business Credit Cards'][contains(text(),'Small Business Credit Cards')]")
        WebElement Learntosell;
        @FindBy(xpath = "//ul[@class='axp-footer__dls__margin0___2Eiav axp-footer__dls__ulNav___31Cq4 axp-footer__dls__margin2T___1ZSVS axp-footer__dls__listLinks___2zEla']//a[@title='Corporate Cards'][contains(text(),'Corporate Cards')]")
        WebElement BusinessSellers;
        @FindBy(xpath = "//ul[@class='axp-footer__dls__margin0___2Eiav axp-footer__dls__ulNav___31Cq4 axp-footer__dls__margin2T___1ZSVS axp-footer__dls__listLinks___2zEla']//a[@title='Prepaid Cards'][contains(text(),'Prepaid Cards')]")
        WebElement Affiliates;
        @FindBy(xpath = "//ul[@class='axp-footer__dls__margin0___2Eiav axp-footer__dls__ulNav___31Cq4 axp-footer__dls__margin2T___1ZSVS axp-footer__dls__listLinks___2zEla']//a[@title='Savings Accounts & CDs'][contains(text(),'Savings Accounts & CDs')]")
        WebElement products;
        @FindBy(xpath = "//ul[@class='axp-footer__dls__margin0___2Eiav axp-footer__dls__ulNav___31Cq4 axp-footer__dls__margin2T___1ZSVS axp-footer__dls__listLinks___2zEla']//a[@title='Gift Cards'][contains(text(),'Gift Cards')]")
        WebElement giftCards;

        public List webElementList(){
            List<WebElement> webElements = new ArrayList<>();
            webElements.add(BUY);
            webElements.add(Registration);
            webElements.add(Money);
            webElements.add(careers);
            webElements.add(BuyingHelp);
            webElements.add(Stores);

            List<String> list = new ArrayList<>();
            for (int i = 0; i<webElements.size();i++){
                list.add(webElements.get(i).getText());
            }
            System.out.println(list);
            return list;
        }
        public List webElementList1(){
            List<WebElement> webElements1 = new ArrayList<>();
            webElements1.add(Sell);
            webElements1.add(StartSelling);
            webElements1.add(Learntosell);
            webElements1.add (BusinessSellers);
            webElements1.add(Affiliates);
            webElements1.add(products);
            webElements1.add(giftCards);

            List<String> list = new ArrayList<>();
            for (int i = 0; i<webElements1.size();i++){
                list.add(webElements1.get(i).getText());
            }
            System.out.println(list);
            return list;
        }
        //Readxls readxls = PageFactory.initElements(driver,Readxls.class);
        Readxls xlData = new Readxls("/Users/lazimulhaque/Downloads/TeamAutomation2018-Developer_Joynab/Ebay/Data/ebay.xlsx");

        public List expectedWebElement(){
            int rowcount = xlData.getRowCount("BUY");
            List<String> expect = new ArrayList<>();
            for(int i = 1; i <= rowcount; i++){
                expect.add(xlData.getCellData("BUY","BUY",i));
            }
            System.out.println(expect);
            return expect;
        }

        Readxls xlData1 = new Readxls("/Users/lazimulhaque/Downloads/TeamAutomation2018-Developer_Joynab/Ebay/Data/ebay.xlsx");
        public List expectedWebElement1(){
            int rowcount = xlData1.getRowCount("SELL");
            List<String> expect = new ArrayList<>();
            for(int i = 1; i <= rowcount; i++){
                expect.add(xlData1.getCellData("SELL","SELL",i));
            }
            System.out.println(expect);
            return expect;
        }
}
