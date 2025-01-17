Feature: Get all products from the api

  Scenario: Verify the api returns all products
    Given I want to get all products
    When I send a GET request to products
    Then I should get a 200 status code

  Scenario: Verify the first product rating
    Given I want to get all products
    When I send a GET request to products
    Then I want to get the first product of <FirstProduct>
    Examples:
      | FirstProduct |
      | 3.9          |