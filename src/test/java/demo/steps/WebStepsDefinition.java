package demo.steps;

import demo.pages.GoogleHomepage;
import demo.pages.ResultPokemonPage;
import demo.pages.SearchResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.security.Key;

//habis waktunya buat android

public class WebStepsDefinition {

    GoogleHomepage googleHomepage = new GoogleHomepage();
    SearchResultPage searchResultPage = new SearchResultPage();
    ResultPokemonPage resultPokemonPage = new ResultPokemonPage();

    @Given("User open google.com")
    public void userOpenGoogleCom() {
        googleHomepage.openHomePage();

    }

    @When("User Search {string} on text field")
    public void userSearchOnTextField(String Keyword) {
        googleHomepage.inputSearch(Keyword);
    }

    @And("User click the first search result of pikachu")
    public void userClickTheFirstSearchResultOfPikachu() {
        searchResultPage.clickResultPikachu();
    }

    @Then("User see the resut of pikachu")
    public void userSeeTheResutOfPikachu() {
    }

    @And("User click the first search result of charizard")
    public void userClickTheFirstSearchResultOfCharizard() {
        searchResultPage.clickResultCharizard();
    }

    @Then("User see the resut of charizard")
    public void userSeeTheResutOfCharizard() {
    }

    @And("User click the first search result of bulbasaur")
    public void userClickTheFirstSearchResultOfBulbasaur() {
        searchResultPage.clickResultBulbasaur();
    }

    @Then("User see the resut of Bulbasaur")
    public void userSeeTheResutOfBulbasaur() {
    }


    @And("User click the first search result mewtwo")
    public void userClickTheFirstSearchResultMewtwo() {
        searchResultPage.clickResultMewTwo();
    }

    @Then("User see the resut of Mewtwo")
    public void userSeeTheResutOfMewtwo() {
    }

    @Then("User see the result of pikachu")
    public void userSeeTheResultOfPikachu() {

    }

    @Then("User see the result of charizard")
    public void userSeeTheResultOfCharizard() {

    }

    @Then("User see the result of Bulbasaur")
    public void userSeeTheResultOfBulbasaur() {

    }

    @Then("User see the result of Mewtwo")
    public void userSeeTheResultOfMewtwo() {
    }
}
