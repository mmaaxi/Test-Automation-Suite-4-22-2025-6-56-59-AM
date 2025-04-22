package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;
import pages.tc_003Page;

public class tc_003Steps {
    tc_003Page page = new tc_003Page();

    @Given("^El reporte ha sido exportado y el archivo Excel está abierto$")
    public void abrirReporteExcel() {
        assertTrue(page.abrirReporteExcel());
    }

    @When("^Comparo el contenido de las filas en la columna 'estado' con el documento de referencia '(.*)'$")
    public void compararColumnaEstadoConReferencia(String documentoReferencia) {
        assertTrue(page.compararColumnaEstadoConReferencia(documentoReferencia));
    }

    @Then("^Los datos en la columna 'estado' deben coincidir con los del documento de referencia$")
    public void validarCoincidenciaDeDatos() {
        assertTrue(page.validarCoincidenciaDeDatos());
    }
}