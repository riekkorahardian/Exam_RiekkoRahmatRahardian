@Web
Feature: Web to search Pokemon

  Scenario: Search a pokemon with name "Pikachu" on google
    Given User open google.com
    When User Search "Pikachu Wikipedia Indonesia" on text field
    And User click the first search result of pikachu
    Then User see the result of pikachu

  Scenario: Search a pokemon with name "Charizard" on google
    Given User open google.com
    When User Type "Charizard Wikipedia Indonesia" on text field
    And User click the first search result of charizard
    Then User see the result of charizard

  Scenario: Search a pokemon with name "Bulbasaur" on google
    Given User open google.com
    When User Type "Bulbasaur Wikipedia Indonesia" on text field
    And User click the first search result of bulbasaur
    Then User see the result of Bulbasaur

  Scenario: Search a pokemon with name "Mewtwo" on google
    Given User open google.com
    When User Type "Mewtwo Wikipedia Indonesia" on text field
    And User click the first search result mewtwo
    Then User see the result of Mewtwo

