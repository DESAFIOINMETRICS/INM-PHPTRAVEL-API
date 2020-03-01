package com.br.test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;


public class TestAPI {
	
	public TestAPI() {
		baseURI = "https://reqres.in/api/users?page=2";
	}

	@Test
	public void teste() {
		
		/*Chama o serviço pelo metodo GET*/
	            given()
	           .contentType("application/json")
	           .when()
	    	   .get(baseURI)
	    	   .then()
	    	   .statusCode(200);	 
		}

}
