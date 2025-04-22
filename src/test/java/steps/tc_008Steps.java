package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_008Page;
import static org.junit.Assert.assertTrue;

public class tc_008Steps {
    tc_008Page excelPage = new tc_008Page();

    @Given("the Excel document is exported from the system")
    public void theExcelDocumentIsExportedFromTheSystem() {
        excelPage.exportExcelDocument();
    }

    @When("I locate the 'IVA Acumulado' column in the Excel")
    public void iLocateTheIVAColumnInTheExcel() {
        assertTrue("Column 'IVA Acumulado' is not present in the Excel.", excelPage.isIVAColumnPresent());
    }

    @Then("the column should be present in the Excel")
    public void theColumnShouldBePresentInTheExcel() {
        // Validation is performed in previous step
    }

    @When("I check the formula in 'IVA Acumulado'")
    public void iCheckTheFormulaInIVA() {
        excelPage.checkIVAFormula();
    }

    @Then("the formula should consider all VAT types (IVA 16%, IVA FRONTERIZO, IVA 0%, IVA EXENTO)")
    public void theFormulaShouldConsiderAllVATTypes() {
        assertTrue("The formula does not consider all required VAT types.", excelPage.isFormulaCorrectForAllVATTypes());
    }

    @Then("exclude any retained VAT")
    public void excludeAnyRetainedVAT() {
        assertTrue("The formula incorrectly considers retained VAT.", excelPage.isRetainedVATExcluded());
    }
    
    @Then("the result should show the correct sum of specified VATs excluding retained VAT")
    public void theResultShouldShowTheCorrectSumOfSpecifiedVATs() {
        assertTrue("The result does not show the correct sum.", excelPage.isSumCorrect());
    }
}