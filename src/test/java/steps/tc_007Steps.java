package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.tc_007Page;
import utils.ExcelUtils;

public class tc_007Steps {

    WebDriver driver;
    tc_007Page page;

    @Given("El usuario exporta el reporte")
    public void elUsuarioExportaElReporte() {
        page.exportReport();
    }
    
    @When("El usuario abre el archivo Excel")
    public void elUsuarioAbreElArchivoExcel() {
        page.openExcelFile();
    }
    
    @Then("El archivo se descarga y abre correctamente")
    public void elArchivoSeDescargaYAbreCorrectamente() {
        boolean isDownloaded = page.isFileDownloaded();
        assert isDownloaded : "El archivo no se descargó correctamente";
    }
    
    @Then("Las columnas 'Folio Pre solicitud', 'Folio de Pago', 'Status Pago Código' y 'Descripción Status Pago' existen")
    public void lasColumnasExisten() {
        boolean columnsExist = ExcelUtils.areColumnsPresent();
        assert columnsExist : "Una o más columnas no existen en el archivo Excel";
    }
    
    @Then("Las columnas están posicionadas y se muestran vacías si no tienen contenido")
    public void lasColumnasEstanPosicionadasYVacias() {
        boolean areColumnsCorrect = ExcelUtils.areColumnsCorrectlyPositionedAndEmpty();
        assert areColumnsCorrect : "Las columnas no están correctamente posicionadas o no están vacías";
    }
}