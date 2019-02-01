package dataReader;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reader.Readxls;
import java.util.ArrayList;
import java.util.List;

public class ReadCNNWebElements extends CommonApi {

    @FindBy(how = How.XPATH, xpath = "//a[@class='m-footer__title__link'][contains(text(),'Tech')]")
    WebElement Tech;
    @FindBy(xpath = "//a[@class='m-footer__link'][contains(text(),'Innovate')]")
    WebElement Innovate;
    @FindBy(xpath = "//ol[@class='m-footer__subtitles m-footer__subtitles--tech']//a[@class='m-footer__link'][contains(text(),'Gadget')]")
    WebElement Gadget;
    @FindBy(xpath = "//a[@class='m-footer__link'][contains(text(),'Mission: Ahead')]")
    WebElement MissionAhead;
    @FindBy(xpath = "//a[@class='m-footer__link'][contains(text(),'Upstarts')]")
    WebElement Upstarts;
    @FindBy(xpath = "//a[@class='m-footer__link'][contains(text(),'Work Transformed')]")
    WebElement WorkTransformed;
    @FindBy(how = How.XPATH, xpath = "//a[@class='m-footer__link'][contains(text(),'Innovative Cities')]")
    WebElement InnovativeCities;
    @FindBy(xpath = "//a[@class='m-footer__title__link']//img[@class='nav-menu__img-style']")
    WebElement Style;
    @FindBy(xpath = "//a[@class='m-footer__link'][contains(text(),'Arts')]")
    WebElement Arts;
    @FindBy(xpath = "//a[@class='m-footer__link'][contains(text(),'Design')]")
    WebElement Design;
    @FindBy(xpath = "//a[@class='m-footer__link'][contains(text(),'Fashion')]")
    WebElement Fashion;
    @FindBy(xpath = "//a[@class='m-footer__link'][contains(text(),'Architecture')]")
    WebElement Architecture;
    @FindBy(xpath = "//a[@class='m-footer__link'][contains(text(),'Luxury')]")
    WebElement Luxury;
    @FindBy(xpath = "//a[@class='m-footer__link'][contains(text(),'Autos')]")
    WebElement Autos;
    @FindBy(xpath = "//ol[@class='m-footer__subtitles m-footer__subtitles--style']//a[@class='m-footer__link'][contains(text(),'Video')]")
    WebElement Video;

    public List webElementList1() {
        List<WebElement> webElements = new ArrayList<WebElement>();
        webElements.add(Tech);
        webElements.add(Innovate);
        webElements.add(Gadget);
        webElements.add(MissionAhead);
        webElements.add(Upstarts);
        webElements.add(WorkTransformed);
        webElements.add(InnovativeCities);
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < webElements.size(); i++) {
            list.add(webElements.get(i).getText());
        }
        System.out.println(list);
        return list;
    }
    public List webElementList2() {
        List<WebElement> webElements1 = new ArrayList<>();
        webElements1.add(Style);
        webElements1.add(Arts);
        webElements1.add(Design);
        webElements1.add(Fashion);
        webElements1.add(Architecture);
        webElements1.add(Luxury);
        webElements1.add(Autos);
        webElements1.add(Video);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < webElements1.size(); i++) {
            list.add(webElements1.get(i).getText());
        }
        System.out.println(list);
        return list;
    }
    Readxls xlData = new Readxls("/Users/hasibahmed/IdeaProjects/TeamAutomation2018/CNN/Data/Book1.xlsx");
    public List expectedWebElement1() {
        int rowcount = xlData.getRowCount("Sheet1");
        List<String> expect = new ArrayList<>();
        for (int i = 1; i <= rowcount; i++) {
            expect.add(xlData.getCellData("Sheet1", "Tech", i));
        }
        System.out.println(expect);
        return expect;
    }
    Readxls xlData1 = new Readxls("/Users/hasibahmed/IdeaProjects/TeamAutomation2018/CNN/Data/Book1.xlsx");
    public List expectedWebElement2() {
        int rowcount = xlData1.getRowCount("Sheet2");
        List<String> expect = new ArrayList<>();
        for (int i = 1; i <= rowcount; i++) {
            expect.add(xlData1.getCellData("Sheet2", "Style", i));
        }
        System.out.println(expect);
        return expect;
    }
}