@Web
Feature: Web to search Pokemon

  Scenario: Search a pokemon with name "Pikachu" on google
    Given User open "pikachu" API page
    And User get pikachu Name on API page
    And User get pikachu Id on API page
    And User open google.com
    When User Search "pikachu Wikipedia Indonesia" on text field
    And User click the first search result
    Then User see pokemon Name on Wikipedia page
    And User see pokemon Number on Wikipedia page

  Scenario: Search a pokemon with name "Charizard" on google
    Given User open "charizard" API page
    And User get charizard Name on API page
    And User get charizard Id on API page
    And User open google.com
    When User Type "Charizard Wikipedia Indonesia" on text field
    And User click the first search result
    Then User see pokemon Name on Wikipedia page
    And User see pokemon Number on Wikipedia page

  Scenario: Search a pokemon with name "Bulbasaur" on google
    Given User open "bulbasaur" API page
    And User get bulbasaur Name on API page
    And User get bulbasaur Id on API page
    And User open google.com
    When User Type "Bulbasaur Wikipedia Indonesia" on text field
    And User click the first search result
    Then User see pokemon Name on Wikipedia page
    And User see pokemon Number on Wikipedia page

  Scenario: Search a pokemon with name "Mewtwo" on google
    Given User open "mewtwo" API page
    And User get mewtwo Name on API page
    And User get mewtwo Id on API page
    And User open google.com
    When User Type "Mewtwo Wikipedia Indonesia" on text field
    And User click the first search result
    Then User see pokemon Name on Wikipedia page
    And User see pokemon Number on Wikipedia page

