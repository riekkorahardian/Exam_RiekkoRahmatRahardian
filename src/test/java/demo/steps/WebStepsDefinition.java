package demo.steps;

import demo.controller.WebController;
import demo.pages.GoogleHomepage;
import demo.pages.ResultPokemonPage;
import demo.pages.SearchResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;

public class WebStepsDefinition {

    WebController webController = new WebController();
    Response response ;
    String PokemonNameAPI = "";
    Integer PokemonIdAPI = 0;

    GoogleHomepage googleHomepage = new GoogleHomepage();
    SearchResultPage searchResultPage = new SearchResultPage();
    ResultPokemonPage resultPokemonPage = new ResultPokemonPage();

    @Given("User open {string} API page")
    public void userOpenAPIPage(String Keyword) {
        response = webController.getPokemon(Keyword);

    }

    @And("User get pikachu Name on API page")
    public void userGetPikachuNameOnAPIPage() {
        PokemonNameAPI = response.path("name");
    }

    @And("User get pikachu Id on API page")
    public void userGetPikachuIdOnAPIPage() {
        PokemonIdAPI = response.path("id");
    }


    @Given("User open google.com")
    public void userOpenGoogleCom() {
    }


    @When("User Search {string} on text field")
    public void userSearchOnTextField(String Keyword) {
        googleHomepage.inputSearch(Keyword);

    }

    @And("User click the first search result")
    public void userClickTheFirstSearchResult() {
        searchResultPage.FirstResult();
    }


    @Then("User see pokemon Name on Wikipedia page")
    public void UserSeePokemonNameOnWikipediaPage() {
        String name = resultPokemonPage.checkPokemonName().toLowerCase();
        Assert.assertEquals(PokemonNameAPI, name);
    }

    @And("User see pokemon Number on Wikipedia page")
    public void userSeePokemonNumberOnWikipediaPage() {
        String id = resultPokemonPage.checkPokemonNumber();
        Assert.assertEquals(PokemonIdAPI, id);

    }

    @And("User get charizard Name on API page")
    public void userGetCharizardNameOnAPIPage() {
        PokemonNameAPI = response.path("name");

    }

    @And("User get charizard Id on API page")
    public void userGetCharizardIdOnAPIPage() {
        PokemonIdAPI = response.path("id");
    }

    @And("User get bulbasaur Name on API page")
    public void userGetBulbasaurNameOnAPIPage() {
        PokemonNameAPI = response.path("name");
    }

    @And("User get bulbasaur Id on API page")
    public void userGetBulbasaurIdOnAPIPage() {
        PokemonIdAPI = response.path("id");
    }

    @And("User get mewtwo Name on API page")
    public void userGetMewtwoNameOnAPIPage() {
        PokemonNameAPI = response.path("name");
    }

    @And("User get mewtwo Id on API page")
    public void userGetMewtwoIdOnAPIPage() {
        PokemonIdAPI = response.path("id");
    }
}
