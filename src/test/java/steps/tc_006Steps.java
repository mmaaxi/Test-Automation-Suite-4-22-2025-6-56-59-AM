package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_006Page;

public class tc_006Steps {
    tc_006Page exportPage = new tc_006Page();

    @Given("^the report is exported and the Excel file is opened$")
    public void exportReportAndOpenFile() {
        Assert.assertTrue("Excel file should open without errors.", exportPage.openExcelFile());
    }

    @When("^I confirm the existence of the columns 'IVA 0%', 'IVA exento' and 'IVA retenido'$")
    public void confirmExistenceOfColumns() {
        Assert.assertTrue("Columns should exist.", exportPage.checkColumnsExistence());
    }

    @Then("^the columns should exist and be located according to the specifications$")
    public void verifyColumnsLocation() {
        Assert.assertTrue("Columns should be in the specified locations.", exportPage.verifyColumnsPosition());
    }
}