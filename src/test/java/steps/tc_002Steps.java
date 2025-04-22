package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_002Page;

import static org.junit.Assert.assertTrue;

public class tc_002Steps {
    tc_002Page page = new tc_002Page();

    @Given("the report is exported and the Excel file is opened")
    public void export_report_and_open_excel_file() {
        assertTrue("The report should be downloaded correctly.", page.isReportDownloaded());
    }

    @When("verifying the position of 'Estado Código' column")
    public void verify_estado_codigo_column_position() {
        page.openExcelFile();
    }

    @Then("the column 'Estado Código' should be immediately to the right of column 'i'")
    public void check_estado_codigo_column_position() {
        assertTrue("The 'Estado Código' column is not correctly positioned.", page.isEstadoCodigoColumnPositionedCorrectly());
    }
}