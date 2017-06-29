package com.fluentWait.Test;
import org.testng.annotations.Test;

import com.fluenWait.framework.RestAssuredConfiguration;
import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;


public class post extends RestAssuredConfiguration{

	@Test
	public void testHTTPErrorCode()
	{
		given().get("http://jsonplaceholder.typicode.com/posts/1").then().statusCode(200);
	}
	
	
	@Test
	public void testBodyofResponse()
	{
		given().when().get("/posts/1").then()
        .body(containsString("1"));
	}
	
	@Test
	public void testKeyValue()
	{
		given().when().get("/posts/1").then()
        .body("id",equalTo(1))
        .body("title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"))
        .statusCode(200);//Chain type of verification
	}
}
