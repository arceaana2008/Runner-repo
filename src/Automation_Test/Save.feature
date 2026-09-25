Feature: Save feature
  Scenario: Save products
    When save products in the file
    And read products from the file
    And  save the price products in the file
    And read price from the file
    And find max price in the file
    And find min price in the file