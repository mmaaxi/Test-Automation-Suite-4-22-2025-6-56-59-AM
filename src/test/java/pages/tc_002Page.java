package pages;

import java.io.File;
import org.openqa.selenium.WebDriver;

public class tc_002Page {
    WebDriver driver;

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isReportDownloaded() {
        // Logic to check if the report file is downloaded.
        File report = new File("path_to_downloaded_file");
        return report.exists();
    }

    public void openExcelFile() {
        // Logic to open the Excel file.
    }

    public boolean isEstadoCodigoColumnPositionedCorrectly() {
        // Logic to verify that 'Estado Código' column is correctly positioned.
        // This would involve reading the Excel file and verifying the column headings.
        return true; // Placeholder for actual implementation.
    }
}