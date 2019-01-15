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
        @FindBy(xpath = "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul/li[2]/a")
        WebElement Registration;
        @FindBy(xpath = "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul/li[3]/a")
        WebElement Money;
        @FindBy(xpath = "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul/li[4]/a")
        WebElement BuyingHelp;
       @FindBy(xpath = "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul/li[5]/a")
        WebElement Stores;
        @FindBy(how = How.XPATH, xpath = "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[2]/ul/li[1]/h3/a")
        WebElement Sell;
        @FindBy(xpath = "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[2]/ul/li[2]/a")
        WebElement StartSelling;
        @FindBy(xpath = "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[2]/ul/li[3]/a")
        WebElement Learntosell;
        @FindBy(xpath = "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[2]/ul/li[4]/a")
        WebElement BusinessSellers;
        @FindBy(xpath = "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[2]/ul/li[5]/a")
        WebElement Affiliates;

        public List webElementList(){
            List<WebElement> webElements = new ArrayList<>();
            webElements.add(BUY);
            webElements.add(Registration);
            webElements.add(Money);
            //webElements.add(careers);
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
