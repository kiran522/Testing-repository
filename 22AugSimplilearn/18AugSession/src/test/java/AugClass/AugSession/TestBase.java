package AugClass.AugSession;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;
public class TestBase {
public static RequestSpecification httpRequests;
public static Response response;

public Logger logger;

@BeforeClass
public void setUp() {
	logger = Logger.getLogger("LogDemo");
	PropertyConfigurator.configure("log4j.properties");
	logger.setLevel(Level.DEBUG);
}
}
