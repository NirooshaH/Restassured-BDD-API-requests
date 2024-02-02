package Restassuredtest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

/*
 given()
    set cookies, add auth, add param, set header
    
 when()
    get,put,post,delete,patch
 
 then()
   validate status code, extract response, extract headers, cookies & response body 
 */

//get request
public class get_request extends Restutils {
	@Test
	public void getsingleuser() {
		given()
		.when()
		 	.get("https://reqres.in/api/users/2")
		.then()
			.statusCode(200)
			.header("Content-Type", "application/json; charset=utf-8")
			.header("Connection","keep-alive");	
	}
	
//Post request
	
		
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
