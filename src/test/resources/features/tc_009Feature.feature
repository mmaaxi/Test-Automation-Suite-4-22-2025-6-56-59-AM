Feature: Prueba de regresión en exportación de Excel

  Scenario: Verificar la exportación de reportes Excel
    Given Estoy en el ambiente de testing controlado
    When Ejecuto la exportación del reporte
    Then El reporte se genera correctamente sin afectar otros módulos

  Scenario: Verificar la funcionalidad global del sistema
    Given Estoy en el ambiente de testing controlado
    When Realizo pruebas en campos no modificados
    Then Los datos y formatos permanecen intactos