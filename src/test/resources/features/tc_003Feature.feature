Feature: Validación de actualización de datos en la columna 'estado'

  Scenario: Validar actualización de la columna 'estado'
    Given El reporte ha sido exportado y el archivo Excel está abierto
    When Comparo el contenido de las filas en la columna 'estado' con el documento de referencia 'HU Sabana Contable_V3.xlsx'
    Then Los datos en la columna 'estado' deben coincidir con los del documento de referencia