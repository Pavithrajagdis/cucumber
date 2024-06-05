
Feature: Search and purchase the product 
  
  @Placeorder
  Scenario: Search the product add to cart in checkoutpage and purhase the product.
    
 Given Verify user is on Greenkartpage
 When user searched with vegtablename <vegetable> in Greenkartpage
 And increase the quantity of the product by three times and add it to the cart
 Then User searched for same vegtablename in checkout page 
 And verify enter the promotional code and place the order
 And select the country finish shopping
    
  
 Examples: 
      | vegetable  | 
      | Tom     |    
