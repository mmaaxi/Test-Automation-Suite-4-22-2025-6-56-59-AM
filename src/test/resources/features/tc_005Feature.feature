Feature: Verificar el renombrado y actualización de 'Monto Acumulado Folio OPC'

  Scenario: Exportar y verificar modificación en reporte Excel
    Given I export the report and open the Excel file
    Then the report should download and open successfully
    And the column 'Monto Acumulado Folio OPC' should be renamed to 'Monto Acumulado Folio OPC (2121)'
    And the header should display the new name and formula should include updated IVA