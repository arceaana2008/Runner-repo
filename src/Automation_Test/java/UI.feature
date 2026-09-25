Feature: UI

  Scenario: Check UI from Main Page
    When  the navigation bar links "Home, Contact, About us, Cart, Login, Aign up" should be displayed
    And  the categories  "Phones, Laptops,Monitors" should be displayed
    And the products should be displayed
    And the aboutUs should be displayed
    And the getInTouch should be displayed
    And  the PRODUCTSTORE should be displayed
    And  the copyrightProductStore should be displayed

    Scenario: Check UI from Product Page
      When user select 1 product from Main Page
      And name product is displayed
      And price product is displayed
      And product description is displayed
      And add to card button is displayed in green color
      And product image is displayed
      And the aboutUs should be displayed
      And the getInTouch should be displayed
      And the PRODUCTSTORE should be displayed
      And the copyrightProductStore should be displayed
