Feature: Home
  Scenario: Check count of the products
    When Count products from the site
    And Click on the next button
    And Count products from the second page
    And Click on the previous button
    And Count products from the site

    Scenario: Check if next product page contains Asus
      When  Click on the next button
      And Second page contains Asus
