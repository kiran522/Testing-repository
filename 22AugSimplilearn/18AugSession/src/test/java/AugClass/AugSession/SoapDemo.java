package AugClass.AugSession;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

import org.apache.commons.io.IOUtils;
import io.restassured.RestAssured;

public class SoapDemo {
	public void getCapital() throws IOException {
	FileInputStream fis = new FileInputStream(new File("capitals.xml"));
	RestAssured.baseURI = "http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso?WSDL";
	RestAssured
	.given()
	.header("Content_Type","text/xml")
	.body(IOUtils.toString(fis,"UTF-8"))
	.when()
	.post()
	.then()
	.statusCode(200)
	.log().all();

}
}