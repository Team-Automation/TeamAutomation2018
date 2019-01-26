package searchTest;
import Report.TestLogger;
import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import search.UserFeature;
public class UserTest extends CommonApi {
    @Test
    public void searchData() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonApi.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        UserFeature userFeature = PageFactory.initElements(driver, UserFeature.class);
        userFeature.searchUserAndSubmitButtonwithoutPassword();
    }
}
