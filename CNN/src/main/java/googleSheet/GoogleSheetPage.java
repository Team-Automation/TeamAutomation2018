package googleSheet;

import base.CommonApi;
import com.google.api.services.sheets.v4.model.*;
import com.google.api.services.sheets.v4.Sheets;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static googleApi.GoogleSheetReader.getSheetsService;

public class GoogleSheetPage extends CommonApi {

    /*@FindBy(xpath = "//div[@type='button']")
    public static WebElement searchButton;*/
    @FindBy (id = "search-button")
    public WebElement searchButton;
    @FindBy(css = "#search-input-field")
    public static WebElement input;
    @FindBy(css = "#submit-button")
    public static WebElement submitButton;
    String spreadsheetId = "1xQRqC1j2dRxIsKwJD8DdQJNevuEv4u7ndn9iPBqmoWc";
    String range = "Sheet1!A1:Z1000";

    public void clickSearchButton() throws InterruptedException {
        //sleepFor(4);
       searchButton.click();
    }

    public List<List<Object>> getSpreadSheetRecords() throws IOException {

        Sheets service = getSheetsService();
        ValueRange response = service.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            return null;
        } else {
            return values;
        }
    }
    public List<String> searchItems() throws IOException, InterruptedException {

        List<List<Object>> col2Value = getSpreadSheetRecords();
        List<String> actual = new ArrayList<>();
        for (List row : col2Value) {
            sleepFor(1);
            inputValueInTextBoxByWebElement(input, row.get(0).toString());
            //inputValueInTextBoxByWebElement(password, row.get(1).toString());
            sleepFor(1);
           // actual.add(getTextByWebElement(logInErrorMesage));
            //System.out.println(getTextByWebElement(logInErrorMesage));
            clearInputBox(input);
           // clearInputBox(password);
            sleepFor(1);
        }
        return actual;
    }
//    public String getTextByWebElement (WebElement webElement){
//        String text = webElement.getText();
//        return text;
//    }
    public void testGoogleSheet() throws InterruptedException, IOException {
        clickSearchButton();
        List<String> actual = searchItems();
        List<List<Object>> expected = getSpreadSheetRecords();

        Assert.assertEquals(actual, expected);
    }
}