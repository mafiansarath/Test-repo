import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LearnAPI {
	public static void rest_GET(){
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification given = RestAssured.given();
		Response request = given.request(Method.GET,"/api/users/446");
		System.out.println(request.asPrettyString());
		System.out.println(request.statusLine());
	}
	public static void rest_POST(){
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification request = RestAssured
				.given()
				.header("Content-Type","application/json")
				.body("{\r\n"
				+ "    \"name\": \"Sarath\",\r\n"
				+ "    \"job\": \"Tester\"\r\n"
				+ "}");
		Response request2 = request.request(Method.POST,"/api/users/");
		System.out.println(request2.asPrettyString()+request2.statusLine());
		
		
	}
	public static void rest_PUT() {
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification RequestSpecification = RestAssured
		.given()
		.header("Content-Type","application/json")
		.body("{\r\n"
				+ "    \"name\": \"Sarath\",\r\n"
				+ "    \"job\": \"Automation-Tester\"\r\n"
				+ "}");
		Response request = RequestSpecification.request(Method.PUT,"/api/users/446");
		System.out.println(request.asPrettyString()+request.statusLine());
	}
	
	public static void main(String[] args) {
		rest_POST();
	}
	
}
