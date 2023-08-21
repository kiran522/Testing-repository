package AugClass.AugSession;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetDemo {
	
	@Test
public void getServerResponse() {
		RestAssured
		.when()
		.get("https://restcountries.com/v3.1/all")
		.then()
		.assertThat()
		.statusCode(200)
		.log().all();
	}
	

}
