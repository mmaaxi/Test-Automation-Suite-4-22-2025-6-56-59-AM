package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_005Page {

    private WebDriver driver;

    private final By exportButton = By.id("exportReportButton");
    private final By excelFileLink = By.linkText("Downloaded_Report.xlsx");
    private final By columnHeader = By.xpath("//th[text()='Monto Acumulado Folio OPC (2121)']");
    private final By formulaCell = By.xpath("//td/formula[contains(text(),'IVA')]");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void exportReport() {
        driver.findElement(exportButton).click();
    }

    public void openExcelFile() {
        // Logic to open Excel file
    }

    public boolean isReportDownloadedAndOpened() {
        return driver.findElement(excelFileLink).isDisplayed();
    }

    public boolean isColumnNameUpdated() {
        return driver.findElements(columnHeader).size() > 0;
    }

    public boolean isHeaderAndFormulaUpdated() {
        return driver.findElement(columnHeader).isDisplayed() && 
               driver.findElements(formulaCell).size() > 0;
    }
}