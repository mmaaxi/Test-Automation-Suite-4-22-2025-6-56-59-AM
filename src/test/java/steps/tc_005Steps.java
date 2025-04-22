package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_005Page;

public class tc_005Steps {

    tc_005Page reportPage = new tc_005Page();

    @Given("I export the report and open the Excel file")
    public void i_export_the_report_and_open_the_excel_file() {
        reportPage.exportReport();
        reportPage.openExcelFile();
    }

    @Then("the report should download and open successfully")
    public void the_report_should_download_and_open_successfully() {
        Assert.assertTrue("Report failed to download or open", reportPage.isReportDownloadedAndOpened());
    }

    @Then("the column 'Monto Acumulado Folio OPC' should be renamed to 'Monto Acumulado Folio OPC (2121)'")
    public void the_column_should_be_renamed() {
        Assert.assertTrue("Column name not updated", reportPage.isColumnNameUpdated());
    }

    @Then("the header should display the new name and formula should include updated IVA")
    public void the_header_should_display_the_new_name_and_formula() {
        Assert.assertTrue("Header or formula not updated", reportPage.isHeaderAndFormulaUpdated());
    }
}