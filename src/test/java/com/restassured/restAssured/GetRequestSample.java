package com.restassured.restAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequestSample {

	public static void main(String[] args) {

		Response response = RestAssured.get("https://www.google.co.in");
		int statuscode = response.statusCode();
		String StatusLine = response.statusLine();
		System.out.println("Staus Code: " + statuscode);
		System.out.println("Status Line:" + StatusLine);
		
		
		//O/P: Staus Code: 200
		//Status Line:HTTP/1.1 200 OK

		
		
	}

}
