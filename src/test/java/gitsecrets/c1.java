package gitsecrets;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class c1 {
	
	
	
	@Test
	public void m1() {
		
		System.out.println("fhgfhgfhfhfhf");
		
		
		
		System.out.println(new TestData().properties.getProperty("tone"));
		System.out.println(new TestData().properties.getProperty("ttwo"));
		System.out.println(new TestData().properties.getProperty("t3"));	
		
		
		RestAssured.baseURI="https://www."+new TestData().properties.getProperty("ttestpi")+".com/";
		RestAssured.basePath="api/activity";
		
		RestAssured.given().log().all().get().prettyPrint();
		
		
		
		
	}
	

}
