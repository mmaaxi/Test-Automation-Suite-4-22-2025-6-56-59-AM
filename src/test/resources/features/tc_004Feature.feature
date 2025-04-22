Feature: Validar la columna 'Monto acumulado Folio Reserva 5401'

  Scenario: Validar el monto acumulado en Excel para Folio Reserva 5401
    Given el usuario exporta el reporte y abre el archivo Excel
    When el usuario identifica la columna 'Monto acumulado Folio Reserva 5401'
    Then la columna debe estar presente y en su posición correcta
    When el usuario ingresa datos de prueba en 'Monto (reserva)' para varias filas
    Then el cálculo debe realizarse correctamente, mostrando la suma acumulada en cada fila