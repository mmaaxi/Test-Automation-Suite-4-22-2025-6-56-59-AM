import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_009Page {

    WebDriver driver;
    By exportButton = By.id("export-button");
    By reportSuccessMessage = By.id("success-message");

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickExportButton() {
        driver.findElement(exportButton).click();
    }

    public boolean isReportGeneratedSuccessfully() {
        // Check the success message or the generated report
        return driver.findElement(reportSuccessMessage).isDisplayed();
    }

    public void verifyUnchangedFields() {
        // Implement logic to verify fields that should remain unchanged
    }

    public boolean areFormatsAndDataIntact() {
        // Implement checks to confirm data and formats are intact
        return true;
    }
}