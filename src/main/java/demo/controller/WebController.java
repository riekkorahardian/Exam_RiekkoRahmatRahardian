package demo.controller;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class WebController {


    String baseURI = "https://pokeapi.co/";
    String basePATH = "/api";

    public Response getPokemon(String pokemonname) {
        Response response = RestAssured
                .given()
                .baseUri(baseURI)
                .basePath(basePATH)
                .log()
                .all()
                .header("Content-type", "application/json")
                .header("Accept", "*/*")
                .get("v2/pokemon/{pokenmoname}", pokemonname);
        return response;
    }

}