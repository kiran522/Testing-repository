package AugClass.AugSession;

import java.util.HashMap;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;

public class PostDemo {
	HashMap<String, String> map = new HashMap<String, String>();
	
	@BeforeMethod
	public void createPayload() {
		map.put("name", "kiran2");
		map.put("job", "lawyer2");
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "/api/users";
	}
@Test
public void createResource() {
	RestAssured
	.given()
	.contentType("application/json")
	.body(map)
	.when()
	.post()
	.then()
	.statusCode(201)
	.log().all();
	
}
}
