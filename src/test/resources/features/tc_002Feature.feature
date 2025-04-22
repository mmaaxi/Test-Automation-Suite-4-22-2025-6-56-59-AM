Feature: Verify existence and position of 'Estado Código' column

  Scenario: Check 'Estado Código' column in Excel report
    Given the report is exported and the Excel file is opened
    When verifying the position of 'Estado Código' column
    Then the column 'Estado Código' should be immediately to the right of column 'i'