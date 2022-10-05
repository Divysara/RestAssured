package com.restassured.restAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class GetRequest2 {

	
	@Test
	public void getRequest() {
		Response response = RestAssured.get("https://reqres.in/api/users/3");
		
		ResponseBody responseBody = response.body();
		
		System.out.println(responseBody.prettyPrint());
	}
	
	@Test
	public void AnotherGetRequest() {
		RestAssured.baseURI="https://reqres.in/api/";
		RestAssured
		.given()
			.param("","")
			.header("","")
		.when()
			.get("/users/3")
		.then()
			.statusCode(200);
		
	}
	
}
