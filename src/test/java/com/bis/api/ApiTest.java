package com.bis.api;

import static io.restassured.RestAssured.given;

import java.util.Iterator;

import org.testng.annotations.Test;

import com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File;

import io.restassured.response.Response;

public class ApiTest {
	public static String BaseUrl = "https://reqres.in/";
	public static String Createurl = BaseUrl + "user";
	public static String Updateurl = BaseUrl + "user/{username}";
	public static String Readurl = BaseUrl + "api/users?page=2";
	public static String Delteurl = BaseUrl + "user/{username}";


//	public static String BaseUrl = "https://reqres.in/";
//	public static String Readurl = BaseUrl + "api/users?page=2"; // Fixed URL issue

	public static void getMethod() {
		Response response = given().baseUri(BaseUrl).log().all()
				.when().get(Readurl)
				.then().log().all().assertThat()
				.statusCode(200)
				.extract().response();

		System.out.println("Response: " + response.asPrettyString());
	}

	public static void main(String[] args) {
	        getMethod();
	        
	        String name="sarath kumar raja";
	        String[] split = name.split(" ");
	        StringBuffer result=new StringBuffer();
	        for (String word : split) {
			result.append(new StringBuffer(word).reverse().append(" "));	
			
	        }System.out.println(result.toString().trim());
	    }
		
	}


