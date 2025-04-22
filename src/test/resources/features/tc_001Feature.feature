Feature: Validate key generation in Column C

  Scenario: Validate key generation in Column C
    Given I navigate to Canned Reports > Module Claim > Report Code > Claim Accounting Report
    When I export the report and open the generated Excel file
    Then I select row 2 and verify column C contains the concatenated key of columns D, H, U, O, and E separated by an underscore