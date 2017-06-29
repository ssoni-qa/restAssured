package com.fluenWait.framework;

import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RestAssuredConfiguration {
	
	@BeforeSuite(alwaysRun=true)
	public void configure()
	{
		RestAssured.baseURI="http://jsonplaceholder.typicode.com";
		//RestAssured.port=8080;
		//RestAssured.basePath="/posts";
	}

	public RequestSpecification getRequestSpecification() {
        return RestAssured.given().contentType(ContentType.JSON);
    }
}
