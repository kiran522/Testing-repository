package AugClass.AugSession;

import java.util.HashMap;
import java.util.UUID;

import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PutDemoBearerToken {
	HashMap<String,String> map = new HashMap<String, String>();
UUID uuid = UUID.randomUUID();
	@BeforeMethod
	public void createPayload() {

	map.put("name","Kiran1");
	map.put("email",uuid+"@gmail.com");
	map.put("gender","male");
	map.put("status","active");
	RestAssured.baseURI = "https://gorest.co.in/";
	RestAssured.basePath = "public/v2/users/123";
}
	@Test
	
	public void updateResource() {
		Response response = RestAssured
		.given()
		.contentType("application/json")
		.header("Authorization", "Bearer 52aef9b9f1ceb4273894516ebf06d616be4d921e3fbb0a031bd2956affd2f97c")
		.body(map)
		.when()
		.put()
		.then()
		.extract().response();
		JsonPath jsonPath = response.jsonPath();
		Assert.assertTrue(jsonPath.get("name").toString().equals("Kiran1"));
	}
}
