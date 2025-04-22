Feature: Validate 'Accumulated VAT' formula

  Scenario: Verify formula calculations in exported Excel
    Given the Excel document is exported from the system
    When I locate the 'IVA Acumulado' column in the Excel
    Then the column should be present in the Excel
    When I check the formula in 'IVA Acumulado'
    Then the formula should consider all VAT types (IVA 16%, IVA FRONTERIZO, IVA 0%, IVA EXENTO)
    And exclude any retained VAT 
    And the result should show the correct sum of specified VATs excluding retained VAT