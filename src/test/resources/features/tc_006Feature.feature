Feature: Verify existence of columns related to VAT

  Scenario: Verify VAT columns in Excel report
    Given the report is exported and the Excel file is opened
    When I confirm the existence of the columns 'IVA 0%', 'IVA exento' and 'IVA retenido'
    Then the columns should exist and be located according to the specifications