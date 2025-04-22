package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_001Page;

public class tc_001Steps {

    tc_001Page page = new tc_001Page();

    @Given("^I navigate to Canned Reports > Module Claim > Report Code > Claim Accounting Report$")
    public void navigateToClaimAccountingReport() {
        page.openClaimAccountingReport();
    }

    @When("^I export the report and open the generated Excel file$")
    public void exportAndOpenExcelReport() {
        page.exportReport();
        page.openExcelFile();
    }

    @Then("^I select row 2 and verify column C contains the concatenated key of columns D, H, U, O, and E separated by an underscore$")
    public void verifyKeyInColumnC() {
        page.verifyColumnCKey();
    }
}