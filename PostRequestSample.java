package com.restassured.restAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
//import static io.restassured.RestAssured.*;
import io.restassured.response.ResponseBody;

public class PostRequestSample {

	
	
	@Test
	public void postRequest() {
		
		JSONObject jsonobject =  new JSONObject();
		
		jsonobject.put("Name", "Agni");
		
		jsonobject.put("Job", "QA");
		
		RestAssured.baseURI = "https://reqres.in";
		
		ResponseBody rb =RestAssured
		.given()
		.header("","")
		.body(jsonobject.toJSONString())
		.post("/api/users");
		/*.then()
		.statusCode(201);*/
		System.out.println(rb.asPrettyString());
		//O/P:
		//{
		//    "id": "682",
		 //   "createdAt": "2022-10-03T00:13:30.834Z"
		//}
		//PASSED: postRequest

	}
	@	Test	
public void putRequest() {
		
		JSONObject jsonobject =  new JSONObject();
		
		jsonobject.put("Name", "Agni");
		
		jsonobject.put("Job", "Developer");
		
		RestAssured.baseURI = "https://reqres.in";
		
		RestAssured
			.given()
				.header("","")
				.body(jsonobject.toJSONString())
				.put("/api/users/2") 
		.then()
			.statusCode(200);
		
}
	@	Test
	public void patchRequest() {
			
			JSONObject jsonobject =  new JSONObject();
			
			jsonobject.put("Name", "Agni");
			
			jsonobject.put("Job", "Developer");
			
			RestAssured.baseURI = "https://reqres.in";
			
			RestAssured
			.given()
				.header("","")
				.body(jsonobject.toJSONString())
				.patch("/api/users/2") 
			.then()
				.statusCode(200);
			
	}
@	Test
	
	public void deleteRequest() {
			
			RestAssured.baseURI = "https://reqres.in";
			
			RestAssured
			.given()
				.header("","")
			.when()
				.delete("/api/users/2") 
			.then()
				.statusCode(204);
}
}

/*//import static io.restassured.RestAssured.*;
we can use this soo that we need not specify the word RestAssured anywhere in this pgm
 */
