package demo.controller;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class WebController {

    public void getMewtwo(){
        Response response = RestAssured
                .given()
                .baseUri("https://pokeapi.co")
                .basePath("/api/v2")
                .log()
                .all()
                .header("Content-Tyoe", "application/json")
                .header("Accept", "application/json")
                .get("/pokemon/mewtwo");

        response.getBody().prettyPrint();
        System.out.println("response status code : " + response.getStatusCode());
        Assert.assertEquals(200, response.getStatusCode());

        Assert.assertEquals("success", response.path("status"));
        String mewtwoName = response.path("name");
        String mewtwoNumber = response.path("id");

    }

    public void getPikachu(){
        Response response = RestAssured
                .given()
                .baseUri("https://pokeapi.co")
                .basePath("/api/v2")
                .log()
                .all()
                .header("Content-Tyoe", "application/json")
                .header("Accept", "application/json")
                .get("/pokemon/pikachu");
        response.getBody().prettyPrint();
        System.out.println("response status code : " + response.getStatusCode());
        Assert.assertEquals(200, response.getStatusCode());

        Assert.assertEquals("success", response.path("status"));
        String pikachuName = response.path("name");
        String pikachuNumber = response.path("id");


    }

    public void getCharizard(){
        Response response = RestAssured
                .given()
                .baseUri("https://pokeapi.co")
                .basePath("/api/v2")
                .log()
                .all()
                .header("Content-Tyoe", "application/json")
                .header("Accept", "application/json")
                .get("/pokemon/charizard");

        response.getBody().prettyPrint();
        System.out.println("response status code : " + response.getStatusCode());
        Assert.assertEquals(200, response.getStatusCode());

        Assert.assertEquals("success", response.path("status"));
        String charizardName = response.path("name");
        String charizardNumber = response.path("id");

    }

    public void getBulbasaur(){
        Response response = RestAssured
                .given()
                .baseUri("https://pokeapi.co")
                .basePath("/api/v2")
                .log()
                .all()
                .header("Content-Tyoe", "application/json")
                .header("Accept", "application/json")
                .get("/pokemon/bulbasaur");

        response.getBody().prettyPrint();
        System.out.println("response status code : " + response.getStatusCode());
        Assert.assertEquals(200, response.getStatusCode());

        Assert.assertEquals("success", response.path("status"));
        String bulbasaurName = response.path("name");
        String bulbasaurNumber = response.path("id");


    }
}
