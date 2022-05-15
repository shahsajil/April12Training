package RestAssuredAPI;

import static org.junit.Assert.*;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class RestAssuredTest {

	@Test
	public void getEmailAddress() {

		String email = "janet.weaver@reqres.in";

		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET,"/api/users/2");
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is:" + responseBody);

		Assert.assertTrue(responseBody.contains(email));

	}


	@Test 
	public void getPostLoginSuccessful() {

		String token = "QpwL5tke4Pnpja7X4";
		
		RestAssured.baseURI = "https://reqres.in/";	
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.POST,"/api/login");
		String jsonString = response.getBody().asString();
		String tokenGenerated = JsonPath.from(jsonString).get("token");
		System.out.println("Respose Token is:" + tokenGenerated);
		
		Assert.assertEquals(token, tokenGenerated);

	}

	@Test
	public void verifiesResponseCode() {

		int responseCode = 204;
		RestAssured.baseURI = "https://reqres.in/";

		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.DELETE,"/api/users/2");
		int statusCode = response.getStatusCode();
		System.out.println("Status code is: "+statusCode);
		
		Assert.assertEquals(responseCode,statusCode);

	}
	
	@Test 
	public void verifiesPatchUpdate() {
		
		String updatedname = "Morpheus2";
		
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification httpRequest = RestAssured.given();
		JSONObject request = new JSONObject();
		request.put("name","Morpheus2");
		request.put("job", "zion resident");
		httpRequest.header("ConTent-Type","application/json");
		httpRequest.body(request.toJSONString());
		Response response = httpRequest.request(Method.PATCH,"/api/users/2");
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is:" +responseBody);
		
		Assert.assertTrue(responseBody.contains(updatedname));
	}
	
	@Test
	public void verifiesPutUpdate() {
		String updatedname = "Morpheus2";
		
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification httpRequest = RestAssured.given();
		JSONObject request = new JSONObject();
		request.put("name","Morpheus2");
		request.put("job", "zion resident");
		httpRequest.header("ConTent-Type","application/json");
		httpRequest.body(request.toJSONString());
		Response response = httpRequest.request(Method.PUT,"/api/users/2");
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is:" +responseBody);
		
		Assert.assertTrue(responseBody.contains(updatedname));
	}

	/*
	 * @Test public void deserializeSingeUserDataIntoObject() {
	 * 
	 * RestAssured.baseURI = "https://reqres.in/"; RequestSpecification httpRequest
	 * = RestAssured.given(); Response response =
	 * httpRequest.request(Method.GET,"/api/users/2"); ResponseBody body =
	 * response.getBody(); responseBody =
	 * 
	 * 
	 * }
	 */


	
}
