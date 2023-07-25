
Feature: Login
 
  Scenario Outline: Valid Login
  
    Given Get Group and TC data <GROUP> - <TC>
    When Launch MSL Application - NewQuote
    Then Enter PI InsBilling Info details - NewQuote
    Then Enter PI Policy Discount Coverages - NewQuote
    Then Enter Auto details - NewQuote
    Then Enter Driver HH Member Details - NewQuote
   
   

    Examples: 
      | GROUP | TC | 
      | MSL   | TC01 | 