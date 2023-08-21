package AugClass.AugSession;

import java.util.HashMap;

import org.junit.Test;
import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;

public class BearerToken {
HashMap<String, String> map = new HashMap<String, String>();
	
	@BeforeMethod
	public void createPayload() {
		map.put("name", "kiran");
		map.put("job", "lawyer");
		map.put("gender", "male");
		map.put("status", "active");
		RestAssured.baseURI = "https://gorest.co.in/";
		RestAssured.basePath = "public/v2/users";
		
	}
@Test
public void createResource() {
	RestAssured
	.given()
	.contentType("application/json")
	.body(map)
	.header("Authorization", "Bearer 52aef9b9f1ceb4273894516ebf06d616be4d921e3fbb0a031bd2956affd2f97c")
	.when()
	.post()
	.then()
	.statusCode(201)
	.log().all();
}
}
