package AugClass.AugSession;

import io.restassured.RestAssured;

public class openWeather {
	public void getWeather() {
		RestAssured
		.given()
		.param("q", "chennai")
		.param("appid", "8dccda0b9f93352443d3df3eb983f68b")
		.when()
		.get("https://api.openweather.org/data/2.5/weather")
		.then()
		.statusCode(200)
		.log().all();
	}

}
