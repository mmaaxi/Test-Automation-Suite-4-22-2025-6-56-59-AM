package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.TC_004Page;

public class TC_004Steps {
    private TC_004Page tc_004Page = new TC_004Page();

    @Given("el usuario exporta el reporte y abre el archivo Excel")
    public void elUsuarioExportaElReporteYAbreElArchivoExcel() {
        Assert.assertTrue(tc_004Page.openExcelFile());
    }

    @When("el usuario identifica la columna 'Monto acumulado Folio Reserva 5401'")
    public void elUsuarioIdentificaLaColumnaMontoAcumuladoFolioReserva5401() {
        Assert.assertTrue(tc_004Page.identifyColumn());
    }

    @Then("la columna debe estar presente y en su posición correcta")
    public void laColumnaDebeEstarPresenteYEnSuPosiciónCorrecta() {
        Assert.assertTrue(tc_004Page.verifyColumnPosition());
    }

    @When("el usuario ingresa datos de prueba en 'Monto (reserva)' para varias filas")
    public void elUsuarioIngresaDatosDePrueba() {
        tc_004Page.enterTestDataInMontoReserva();
    }

    @Then("el cálculo debe realizarse correctamente, mostrando la suma acumulada en cada fila")
    public void elCálculoDebeRealizarseCorrectamente() {
        Assert.assertTrue(tc_004Page.verifyAccumulatedSum());
    }
}