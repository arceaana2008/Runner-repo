Feature: Add to cart
@AddToCart
  Scenario: User can add product in the cart
    When user select 1 product from Main Page
    And add product in the cart
    Then appear allert with message "Product added"
    When user navigate to the "Cart" link
    Then products text is displayed
    And  place order button is displayed
    And  tabel is displayed
    And delete text is displayed
    And the aboutUs should be displayed
    And the getInTouch should be displayed
    And the PRODUCTSTORE should be displayed
    And the copyrightProductStore should be displayed
    And  click on the order place button
    Then fields is displayed
    And fill all fields from Place Order Page
    And click on the 'Purchase' button from Place Order page
    Then Thank you for your purchase! is displayed
  @AddToCart
    Scenario: User not fill in the Place Order
      When user select 1 product from Main Page
      And add product in the cart
      Then appear allert with message "Product added"
      When user navigate to the "Cart" link
      Then products text is displayed
      And  place order button is displayed
      And  tabel is displayed
      And delete text is displayed
      And the aboutUs should be displayed
      And the getInTouch should be displayed
      And the PRODUCTSTORE should be displayed
      And the copyrightProductStore should be displayed
      And  click on the order place button
      And click on the 'Purchase' button from Place Order page
      Then appear allert with message 'Please fill out Name and Creditcard.'
  @AddToCart
      Scenario: User fill only name and credit cart
        When user select 1 product from Main Page
        And add product in the cart
        Then appear allert with message "Product added"
        When user navigate to the "Cart" link
        Then products text is displayed
        And  place order button is displayed
        And  tabel is displayed
        And delete text is displayed
        And the aboutUs should be displayed
        And the getInTouch should be displayed
        And the PRODUCTSTORE should be displayed
        And the copyrightProductStore should be displayed
        And  click on the order place button
        Then fields is displayed
        And complete the name and credit card fields
        And click on the 'Purchase' button from Place Order page
        Then Thank you for your purchase! is displayed
  @AddToCart
        Scenario: Add product in the cart and fill Place order from file
        User can add product in the cart
          When user select 1 product from Main Page
          And add product in the cart
          Then appear allert with message "Product added"
          When user navigate to the "Cart" link
          Then products text is displayed
          And  place order button is displayed
          And  tabel is displayed
          And delete text is displayed
          And the aboutUs should be displayed
          And the getInTouch should be displayed
          And the PRODUCTSTORE should be displayed
          And the copyrightProductStore should be displayed
          And  click on the order place button
          Then fields is displayed
          And fill all fields from file in Place Order Page
          And click on the 'Purchase' button from Place Order page
          Then Thank you for your purchase! is displayed


