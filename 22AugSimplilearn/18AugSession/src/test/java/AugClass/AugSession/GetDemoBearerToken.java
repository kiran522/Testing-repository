package AugClass.AugSession;

import org.junit.Test;

import io.restassured.RestAssured;

public class GetDemoBearerToken {
	
	@Test
	public void verifyResource() {
		RestAssured
		.given()
		.contentType("application/json")
		.header("Authorization","Bearer 52aef9b9f1ceb4273894516ebf06d616be4d921e3fbb0a031bd2956affd2f97c")
	.when()
	.get("https://gorest.co.in/public/v2/users/4494968")
	.then()
	.statusCode(200)
	.log().all();
	}

}
