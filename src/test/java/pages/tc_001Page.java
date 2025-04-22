package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class tc_001Page {

    WebDriver driver;
    WebDriverWait wait;

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);
    }

    public void openClaimAccountingReport() {
        driver.get("URL_TO_REPORT_PAGE"); // Replace with actual URL
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("exportButtonId"))); // Update with correct ID
    }

    public void exportReport() {
        WebElement exportButton = driver.findElement(By.id("exportButtonId")); // Update with correct ID
        exportButton.click();
        waitForFileDownload("Path_to_download_folder", "Expected_File_Name.xls");
    }

    public void openExcelFile() {
        // Code to open the Excel file and save it to an accessible location
    }

    public void verifyColumnCKey() {
        try {
            Workbook workbook = Workbook.getWorkbook(new File("Path_to_download_folder/Expected_File_Name.xls"));
            Sheet sheet = workbook.getSheet(0);
            Cell cellC = sheet.getCell(2, 1); // Column C, Row 2 (0-indexed)
            Cell cellD = sheet.getCell(3, 1);
            Cell cellH = sheet.getCell(7, 1);
            Cell cellU = sheet.getCell(20, 1);
            Cell cellO = sheet.getCell(14, 1);
            Cell cellE = sheet.getCell(4, 1);

            String expectedValue = cellD.getContents() + "_" +
                                   cellH.getContents() + "_" +
                                   cellU.getContents() + "_" +
                                   cellO.getContents() + "_" +
                                   cellE.getContents();

            assert cellC.getContents().equals(expectedValue) : "Column C key generation is incorrect";

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void waitForFileDownload(String downloadPath, String fileName) {
        File file = new File(downloadPath + fileName);
        int attempts = 0;
        while (!file.exists() && attempts < 10) {
            try {
                Thread.sleep(1000);
                attempts++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}