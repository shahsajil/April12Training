package RestAssuredAPI;

import org.json.simple.JSONObject;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;
import io.restassured.http.ContentType;
import pageobject.NewUser;



public class RestAssuredTest extends NewUser {



	@Test
	public void getEmailAddress() {

		baseURI = "https://reqres.in/api";
		String expectedEmail = "janet.weaver@reqres.in";

		given()
		.when()
		.get("/users/2")
		.then()
		.statusCode(200)
		.assertThat().body("data.email", equalTo(expectedEmail));
	}



	@Test 
	public void getPostLoginSuccessful() {

		baseURI = "https://reqres.in/api";
		String expectedtoken = "QpwL5tke4Pnpja7X4";

		JSONObject request = new JSONObject();
		request.put("email","eve.holt@reqres.in");
		request.put("password", "cityslicka");

		given()
		.header("Content-Type", "appication/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.post("/login")
		.then()
		.statusCode(200)
		.log().all()
		.assertThat().body("token", equalTo(expectedtoken));

	}

	@Test
	public void verifiesDeleteResponseCode() {

		baseURI = "https://reqres.in/api";
		int expectedStatusCode = 204;
		given()
		.delete("/users/2")
		.then()
		.statusCode(expectedStatusCode)
		.log().all();

	}

	@Test 
	public void verifiesPatchUpdate() {

		baseURI = "https://reqres.in/api";
		String updatedName = "Morpheus2";

		JSONObject request = new JSONObject();
		request.put("name","Morpheus2");
		request.put("job", "zion resident");

		given()
		.header("Content-Type", "application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.patch("/users/2")
		.then()
		.statusCode(200)
		.log().all()
		.assertThat().body("name", equalTo(updatedName));
	}

	@Test
	public void verifiesPutUpdate() {

		baseURI = "https://reqres.in/api";
		String updatedName = "Morpheus2";

		JSONObject request = new JSONObject();
		request.put("name","Morpheus2");
		request.put("job", "zion resident");

		given()
		.header("Content-Type", "application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.put("/users/2")
		.then()
		.statusCode(200)
		.log().all()
		.assertThat().body("name", equalTo(updatedName));
	}

	@Test 
	public void getSingleUserDeserialize() {

		baseURI = "https://reqres.in/api";

		NewUser user = new NewUser();
		user.setId(2);
		user.setEmail("janet.weaver@reqres.in");
		user.setFirst_name("Janet");
		user.setLast_name("Weaver");
		user.setAvatar("https://reqres.in/img/faces/2-image.jpg");

		given()
		.contentType(ContentType.JSON)
		.body(user)
		.when()
		.get("/users/2")
		.then()
		.statusCode(200)
		.assertThat().body("data.email", equalTo("janet.weaver@reqres.in"));

	}
	
	@Test
	public void getListUsersDeserialize() {
		
		baseURI = "https://reqres.in/api";
		
		NewUser user1 = new NewUser();
		user1.setId(7);
		user1.setEmail("michael.lawson@reqres.in");
		user1.setFirst_name("Michael");
		user1.setLast_name("Lawson");
		user1.setAvatar("https://reqres.in/img/faces/7-image.jpg");
		
		NewUser user2 = new NewUser();
		user2.setId(8);
		user2.setEmail("lindsay.ferguson@reqres.in");
		user2.setFirst_name("Lindsay");
		user2.setLast_name("Ferguson");
		user2.setAvatar("https://reqres.in/img/faces/8-image.jpg");
		
		NewUser user3 = new NewUser();
		user3.setId(9);
		user3.setEmail("tobias.funke@reqres.in");
		user3.setFirst_name("Tobias");
		user3.setLast_name("Funke");
		user3.setAvatar("https://reqres.in/img/faces/9-image.jpg");
		
		NewUser user4 = new NewUser();
		user4.setId(10);
		user4.setEmail("byron.fields@reqres.in");
		user4.setFirst_name("Byron");
		user4.setLast_name("Fields");
		user4.setAvatar("https://reqres.in/img/faces/10-image.jpg");
		
		NewUser user5 = new NewUser();
		user5.setId(11);
		user5.setEmail("george.edwards@reqres.in");
		user5.setFirst_name("George");
		user5.setLast_name("Edwards");
		user5.setAvatar("https://reqres.in/img/faces/11-image.jpg");
		
		NewUser user6 = new NewUser();
		user6.setId(12);
		user6.setEmail("rachel.howell@reqres.in");
		user6.setFirst_name("Rachel");
		user6.setLast_name("Howell");
		user6.setAvatar("https://reqres.in/img/faces/12-image.jpg");
		
		given()
		.contentType(ContentType.JSON)
		.body(user1)
		.body(user2)
		.body(user3)
		.body(user4)
		.body(user5)
		.body(user6)
		.when()
		.get("/users?page=2")
		.then()
		.statusCode(200)
		.assertThat().body("data.email[1]", equalTo("lindsay.ferguson@reqres.in"));	
		

	}
}


