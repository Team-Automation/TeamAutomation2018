package Test;

import job.Careers;
import myApi.EbayApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCareers extends EbayApi {
    Careers careers;
    public void jobSearch(){
        careers= PageFactory.initElements(driver,Careers.class);
    }
    @Test
    public void findJob() {
        careers.careersSection();
        careers.setAddSearch(addSearch);
        careers.submitButton();
    }
}
