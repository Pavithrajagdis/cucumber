Feature: search and place the order for products

@offerpage
Scenario Outline: search experience for product search in both home page and offer page.

Given verify user is on Greenkart landingpage
When user searched with shortname <Name> and extract actual name of product
Then User searched for same shortname <Name> in offers page to check if the product exist
And validate product name present landing is same as offer page
 
 Examples:
 |Name |
 |Tom  |
 |Beet |