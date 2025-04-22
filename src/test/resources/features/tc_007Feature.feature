Feature: Validar presencia de nuevas columnas sin datos

  Scenario: Verificar nuevas columnas en el archivo Excel exportado
    Given El usuario exporta el reporte
    When El usuario abre el archivo Excel
    Then El archivo se descarga y abre correctamente
    And Las columnas 'Folio Pre solicitud', 'Folio de Pago', 'Status Pago Código' y 'Descripción Status Pago' existen
    And Las columnas están posicionadas y se muestran vacías si no tienen contenido