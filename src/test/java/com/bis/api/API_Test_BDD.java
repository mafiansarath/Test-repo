package com.bis.api;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class API_Test_BDD {
	@Test
public static  void getMethod() {
	Response response = given().log().all().baseUri("https://www.google.com/").log().all()
		.when()
		.get();
//		.then()
//		.log().all().assertThat().statusCode(200).extract().asPrettyString();
	 Map<String, String> cookies = response.getCookies();
	for(String cookie:cookies.keySet()) {
		System.out.println(cookie+"" +cookies);
	}
}

public static void postMethod() {
	File jsonfile= new File("PutData.json");
String request = given().log().all().baseUri("https://reqres.in/api/users")
       .header("Content-Type","application/json")
       .body(jsonfile)
.when()
.post()
.then().log().all().assertThat().statusCode(201).extract().asString();
JsonPath jp=new JsonPath(request);
String name = jp.getString("name");
System.out.println(name);
}

public static void putMethod() {
	File jsonfile=new File("PutData.json");
	 given().baseUri("https://reqres.in")
	.header("Content-Type","application/json")
	.body(jsonfile)
	.when().put("/api/users/2")
	.then().log().all().assertThat().statusCode(200).extract().asPrettyString();
 }

public static void delteMethod() {}
public static void main(String[] args) {

//getMethod();
putMethod();
//postMethod();
	
  
}
	
}
