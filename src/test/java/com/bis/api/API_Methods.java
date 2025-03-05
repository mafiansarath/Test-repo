package com.bis.api;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class API_Methods {
static String BaseURI=
//"https://reqres.in";
"http://api.weatherapi.com/v1"; 
static String Get=
//"/api/users?page=2";
"/current.json";
static String Post="/api/users";
static String Put="/api/users/2";
static String Patch="/api/users/2";

static void getMethod() {        String baseURI = "https://api.weatherapi.com/v1/current.json";

        // Make the GET request
        Response getresponse = RestAssured
            .given()
            .queryParam("key", "28557dd8e2a645ef1c41df1be7ac9f02") // API Key
            .queryParam("q", "Chennai") // Query Parameter
            .when()
            .get(baseURI) // Correct endpoint
            .then()
            .statusCode(200) // Validate HTTP Status
            .extract()
            .response();

        // Print Response
        System.out.println("Response Body: " + getresponse.asPrettyString());
    }
	
static void postMethod() {
	File json=new File("C:\\Testing\\SetupFile\\JuneBDDFramework\\src\\test\\resources\\Post.JSON");
String request =RestAssured.given()
                             .baseUri(BaseURI).
                              contentType("application/json").
                              body(json).
                              when().post(Post).
                              then().log().all().statusCode(201).extract().asPrettyString();
System.out.println("RequestBody: "+request);
}

static void patchMethod() {
	File json=new File("C:\\Testing\\SetupFile\\JuneBDDFramework\\src\\test\\resources\\Post.JSON");
String request =RestAssured.given().baseUri(BaseURI).
body(json).
when().patch(Patch).
then().log().all().statusCode(200).extract().asPrettyString();
System.out.println("RequestBody: "+request);
}

public static void main(String[] args) {
		getMethod();
//		postMethod();
//		patchMethod();
	}

}
