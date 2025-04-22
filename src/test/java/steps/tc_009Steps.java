import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class tc_009Steps {
    WebDriver driver;
    tc_009Page exportPage;

    @Given("^Estoy en el ambiente de testing controlado$")
    public void setUpEnvironment() {
        driver = new WebDriverManager().getDriver();
        exportPage = new tc_009Page(driver);
        driver.get("http://testing-environment-url");
    }

    @When("^Ejecuto la exportación del reporte$")
    public void executeReportExport() {
        exportPage.clickExportButton();
    }

    @Then("^El reporte se genera correctamente sin afectar otros módulos$")
    public void verifyReportGeneration() {
        assertTrue(exportPage.isReportGeneratedSuccessfully());
    }

    @When("^Realizo pruebas en campos no modificados$")
    public void testUnchangedFields() {
        exportPage.verifyUnchangedFields();
    }

    @Then("^Los datos y formatos permanecen intactos$")
    public void verifyDataAndFormatsIntact() {
        assertTrue(exportPage.areFormatsAndDataIntact());
    }
}