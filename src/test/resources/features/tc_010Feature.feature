Feature: Validación de precondiciones y flujo de autenticación para exportación

  Scenario: Exportación de datos después de autenticación exitosa
    Given El usuario se autentica con credenciales válidas
    When Navega a Canned Reports > Module Claim > Report Code > Claim Accounting Report
    And Lo envía y visualiza el log
    And Agrega Folio y descarga archivo de Excel
    Then El usuario descarga correctamente el archivo Excel