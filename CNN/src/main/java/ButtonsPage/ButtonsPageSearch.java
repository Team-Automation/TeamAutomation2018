package ButtonsPage;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ButtonsPageSearch extends CommonApi {
    @FindBy(xpath = "//a[@class='m-footer__link'][contains(text(),'Africa')]")
    WebElement Africa;
    public WebElement getAfrica(){ return Africa; }
    @FindBy (xpath = "//a[@class='m-footer__link'][contains(text(),'Americas')]")
    WebElement Americas;
    public WebElement getAmericas(){ return Americas; }
    @FindBy (xpath = "//a[@class='m-footer__link'][contains(text(),'Asia')]")
    WebElement Asia;
    public WebElement getAsia(){ return Asia; }
    @FindBy (xpath = "//a[@class='m-footer__link'][contains(text(),'Australia')]")
    WebElement Australia;
    public WebElement getAustralia(){ return Australia; }
    @FindBy (xpath = "//a[@class='m-footer__link'][contains(text(),'Europe')]")
    WebElement Europe;
    public WebElement getEurope(){ return Europe; }
    @FindBy (xpath = "//a[@class='m-footer__link'][contains(text(),'Middle East')]")
    WebElement MiddleEast;
    public WebElement getMiddleEast(){ return MiddleEast; }
    @FindBy (xpath = "//a[@class='m-footer__link'][contains(text(),'UK')]")
    WebElement UK;
    public WebElement getUK(){ return UK; }
    @FindBy(xpath = "//a[@class='m-footer__link'][contains(text(),'Crime + Justice')]")
    WebElement Crime;
    public WebElement getCrime(){ return Crime; }
    @FindBy (xpath = "//a[@class='m-footer__link'][contains(text(),'Energy + Environment')]")
    WebElement Energy;
    public WebElement getEnergy(){ return Energy; }
    @FindBy (xpath = "//a[@class='m-footer__link'][contains(text(),'Extreme Weather')]")
    WebElement Weather;
    public WebElement getWeather(){ return Weather; }
    @FindBy (xpath = "//a[@class='m-footer__link'][contains(text(),'Space + Science')]")
    WebElement Science;
    public WebElement getScience(){ return Science; }
    @FindBy (xpath = "//a[@class='m-footer__link'][contains(text(),'Congress')]")
    WebElement Congress;
    public WebElement getCongress(){ return Congress; }
    @FindBy (xpath = "//a[@class='m-footer__link'][contains(text(),'Supreme Court')]")
    WebElement SupremeCourt;
    public WebElement getSupremeCourt(){ return SupremeCourt; }
    @FindBy (xpath = "//a[@class='m-footer__link'][contains(text(),'2018 Election Results')]")
    WebElement ElectionResults;
    public WebElement getElectionResults(){ return ElectionResults; }
}
