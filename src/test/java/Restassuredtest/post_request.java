package Restassuredtest;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class post_request extends Restutils {
	
	public static HashMap map=new HashMap();
	
	@BeforeClass
	public void postcreateuser() {
		map.put("name",Restutils.getname());
		map.put("job", Restutils.getjob());
		
		RestAssured.baseURI="https://reqres.in/api";
		RestAssured.basePath="/users";
		
	}
	@Test
	public void testpost() {
		given()
			.contentType("application/json")
		.when()
			.post()
		.then()
			.statusCode(201);
			
	}

}
