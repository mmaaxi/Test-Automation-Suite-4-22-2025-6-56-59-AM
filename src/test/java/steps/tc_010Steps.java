package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_010Page;
import static org.junit.Assert.assertTrue;

public class tc_010Steps {

    tc_010Page page = new tc_010Page();

    @Given("El usuario se autentica con credenciales válidas")
    public void el_usuario_se_autentica_con_credenciales_válidas() {
        assertTrue(page.login("usuarioValido", "contraseñaValida"));
    }

    @When("Navega a Canned Reports > Module Claim > Report Code > Claim Accounting Report")
    public void navegar_a_report() {
        page.navigateToReport();
    }

    @When("Lo envía y visualiza el log")
    public void enviar_y_visualizar_log() {
        page.submitAndViewLog();
    }

    @When("Agrega Folio y descarga archivo de Excel")
    public void agregar_folio_y_descargar_excel() {
        page.addFolioAndDownloadExcel();
    }

    @Then("El usuario descarga correctamente el archivo Excel")
    public void verificar_descarga_excel() {
        assertTrue(page.isExcelDownloaded());
    }
}