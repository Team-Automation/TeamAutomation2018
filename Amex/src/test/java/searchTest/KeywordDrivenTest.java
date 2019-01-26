package searchTest;
import Report.TestLogger;
import base.CommonApi;
import keywordDriven.Keyword;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeywordDrivenTest extends Keyword{
    Keyword keyword;
    @BeforeMethod
    public void intializedElements(){
        keyword = PageFactory.initElements(driver,Keyword.class);
    }
    @Test
    public void keywordTest()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        keyword.keywordWebElement();
}
}
