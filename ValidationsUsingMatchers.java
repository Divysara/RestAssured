package com.restassured.restAssured;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
public class ValidationsUsingMatchers {

	@Test
	public void checkLeagueId() {
		get("http://localhost:3000/team")
		.then()
		.body("data.leagueID", equalTo(35));
	}
	
	@Test
	public void vistingTeam() {
		
		get("http://localhost:3000/team")
		.then()
		.body("data.visitingteam", equalTo("India"));
	}
	
	@Test
	public void checkHeight() {
		

		get("http://localhost:3000/team")
		.then()
		.body("data.height", equalTo(5.5f));
	}
	
	
	@Test
	public void checkTime() {
		
		get("http://localhost:3000/team")
		.then()
		.time(lessThan(1L),TimeUnit.SECONDS);
	}
	
	@Test
	public void CheckEntries() {
		
		get("http://localhost:3000/team")
		.then()
		.body("odds", hasSize(1));
		/*
		 * o/p: JSON path odds doesn't amtch. Expected: a collection with size<1>
		 * Actual:<[{price =1.3, name =x},<[{price =1.3, name =y}]>
		 */
	}
}

