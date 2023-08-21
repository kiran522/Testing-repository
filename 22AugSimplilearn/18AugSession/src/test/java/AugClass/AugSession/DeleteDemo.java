package AugClass.AugSession;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteDemo {
	@Test
	public void deleteResource(){
	RestAssured.basePath = "https://reqres.in/";
	RestAssured.basePath = "/api/users/330";
	RestAssured
	.when()
	.delete()
	.then()
	.statusCode(204);
	

}
}