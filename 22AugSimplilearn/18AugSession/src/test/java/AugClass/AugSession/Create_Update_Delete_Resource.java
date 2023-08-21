package AugClass.AugSession;

import java.util.HashMap;
import java.util.UUID;

import org.junit.Assert;
import org.testng.annotations.*;
import io.restassured.path.json.JsonPath;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.is;
public class Create_Update_Delete_Resource {
HashMap<String, String> map = new HashMap<String, String>();
UUID uuid = UUID.randomUUID();
int id;
Response response;
JsonPath jsonPath;

@Test(priority=0)
public void createPayload() {
map.put("name","earth");
map.put("email",uuid+"@gmail");
map.put("gender","male");
map.put("status","Active");
RestAssured.baseURI = "https://gorest.co.in";
RestAssured.basePath = "public/v2/users";
logger.info("Payload created");
}

@Test(priority=1)
public void createResource() {
	 response = RestAssured
			 .given()
			 .contentType("application/json")
			 .body(map)
			 .header("Authorization", "Bearer 52aef9b9f1ceb4273894516ebf06d616be4d921e3fbb0a031bd2956affd2f97c")
			 .when()
			 .post()
			 .then()
			 .log().all()
			 .extract().response();
	 jsonPath = response.jsonPath();
	 id = jsonPath.getInt("id");
			
}
@Test(priority=2)
public void verifyResource() {
	System.out.println("Id = +id");
	RestAssured
	.given()
	.contentType("application/json")
	.header("Authorization", "Bearer 52aef9b9f1ceb4273894516ebf06d616be4d921e3fbb0a031bd2956affd2f97c")
	.when()
	.get("https://gorest.co.in/public/v2/users/"+id)
	.then()
	.statusCode(200)
	.log().all();
	Assert.assertTrue(jsonPath.get("name").equals("earth"));

}
@Test(priority=3)

public void updateResource() {
map.put("name","earther");
map.put("email",uuid+"@gmail");
map.put("gender","male");
map.put("status","Active");
RestAssured.baseURI = "https://gorest.co.in";
RestAssured.basePath = "public/v2/users/"+id;

RestAssured
.given()
.contentType("application/json")
.header("Authorization", "Bearer 52aef9b9f1ceb4273894516ebf06d616be4d921e3fbb0a031bd2956affd2f97c")
.body(map)
.when()
.put()
.then()
.statusCode(200)
.log().all()
.assertThat()
.body("name",is("earther"));
}
@Test(priority=4)

public void deleteResource() {
	RestAssured.baseURI = "https://gorest.co.in";
	RestAssured.basePath = "public/v2/users/" + id;
	RestAssured
	.given()
	.contentType("application/json")
	.header("Authorization", "Bearer 52aef9b9f1ceb4273894516ebf06d616be4d921e3fbb0a031bd2956affd2f97c")
.when()
.delete()
.then()
.statusCode(204);
	
}
}
