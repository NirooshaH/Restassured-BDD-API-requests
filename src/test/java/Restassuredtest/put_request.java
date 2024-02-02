package Restassuredtest;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class put_request  {
	public static HashMap map=new HashMap();
	int id=7;
			
	String nameinfo=Restutils.getname();
	String jobinfo=Restutils.getjob();
	
	@BeforeClass
	public void putdata() {
		map.put("name","nameinfo" );
		map.put("job", "jobinfo");
		
		RestAssured.baseURI="https://reqres.in/api";
		RestAssured.basePath="/users"+id;	
	}
	@Test
	public void testput() {
		given()
		.contentType("application/json")
		.body(map)
		.body("name")
		
		
		.when()
			.put()
		.then()
		 .statusCode(200);
//		 .body("name", equals("morpheus")+generatedname)
//		 .body("job", equals("zion")+generatejob);
		
		
	}

}
