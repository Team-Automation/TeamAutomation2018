package dataReader;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import reader.Readxls;

import java.util.ArrayList;
import java.util.List;

public class ReadCNNWebElements extends CommonApi {

    @FindBy(how = How.XPATH, xpath = "//a[@class='nav-menu-links__link'][contains(text(),'U.S.')]")
    WebElement US;
    @FindBy(xpath = "//a[@class='nav-menu-links__link'][contains(text(),'World')]")
    WebElement World;
    @FindBy(xpath = "//a[contains(text(),'Politics')]")
    WebElement Politics;
    @FindBy(xpath = "//a[@class='nav-menu-links__link'][contains(text(),'Business')]")
    WebElement Business;
    @FindBy(xpath = "//a[@class='nav-menu-links__link'][contains(text(),'Opinion')]")
    WebElement Opinion;
    @FindBy(xpath = "//a[contains(text(),'Health')]")
    WebElement Health;
    @FindBy(how = How.XPATH, xpath = "//a[contains(text(),'Entertainment')]")
    WebElement Entertainment;
    @FindBy(xpath = "//a[contains(text(),'Style')]")
    WebElement Style;
    @FindBy(xpath = "//a[contains(text(),'Travel')]")
    WebElement Travel;
    @FindBy(xpath = "//a[contains(text(),'Sports')]")
    WebElement Sports;
    @FindBy(xpath = "//a[@class='nav-menu-links__link'][contains(text(),'Video')]")
    WebElement Video;
    @FindBy(xpath = "//a[@class='m-footer__title__link'][contains(text(),'Coupons')]")
    WebElement Coupons;
    @FindBy(xpath = "//a[@class='m-footer__title__link'][contains(text(),'More…')]")
    WebElement More;

    public List webElementList() {
        List<WebElement> webElements = new ArrayList<>();
        webElements.add(US);
        webElements.add(World);
        webElements.add(Politics);
        webElements.add(Business);
        webElements.add(Opinion);
        webElements.add(Health);

        List<String> list = new ArrayList<>();
        for (int i = 0; i < webElements.size(); i++) {
            list.add(webElements.get(i).getText());
        }
        System.out.println(list);
        return list;
    }

    public List webElementList1() {
        List<WebElement> webElements1 = new ArrayList<>();
        webElements1.add(Entertainment);
        webElements1.add(Style);
        webElements1.add(Travel);
        webElements1.add(Sports);
        webElements1.add(Video);
        webElements1.add(Coupons);
        webElements1.add(More);


        List<String> list = new ArrayList<>();
        for (int i = 0; i < webElements1.size(); i++) {
            list.add(webElements1.get(i).getText());
        }
        System.out.println(list);
        return list;
    }

    //Readxls readxls = PageFactory.initElements(driver,Readxls.class);
    Readxls xlData = new Readxls("/Users/hasibahmed/IdeaProjects/TeamAutomation2018/CNN/Data/Book1.xlsx");

    public List expectedWebElement() {
        int rowcount = xlData.getRowCount("Sheet1");
        List<String> expect = new ArrayList<>();
        for (int i = 1; i <= rowcount; i++) {
            expect.add(xlData.getCellData("Sheet1", "Tech", i));
        }
        System.out.println(expect);
        return expect;
    }

    Readxls xlData1 = new Readxls("/Users/hasibahmed/IdeaProjects/TeamAutomation2018/CNN/Data/Book1.xlsx");

    public List expectedWebElement1() {
        int rowcount = xlData1.getRowCount("Sheet2");
        List<String> expect = new ArrayList<>();
        for (int i = 1; i <= rowcount; i++) {
            expect.add(xlData1.getCellData("Sheet2", "Style", i));
        }
        System.out.println(expect);
        return expect;
    }
}