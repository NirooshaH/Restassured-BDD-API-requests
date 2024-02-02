package Restassuredtest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class Delete_request {
	
	@Test
	public void deletetest() {
		RestAssured.baseURI="https://reqres.in/api/users";
		RestAssured.basePath="2";
		
		given()
		.when()
		 .delete()
		 .then()
		 .statusCode(204).statusLine();
	}

}
