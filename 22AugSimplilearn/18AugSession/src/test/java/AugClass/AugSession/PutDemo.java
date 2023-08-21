package AugClass.AugSession;

import java.util.HashMap;

import org.junit.Test;
import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;

public class PutDemo {
HashMap<String,String> map = new HashMap<String, String>();

@BeforeMethod
public void createPayload() {

map.put("name","Karan");
map.put("job","teddy");
RestAssured.baseURI = "https://reqres.in/";
RestAssured.basePath = "/api/users/964";
}

@Test
public void updateResource() {
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
