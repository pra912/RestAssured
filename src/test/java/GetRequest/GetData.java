package GetRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetData {

	@Test
	public void testResponseCode() {
		Response resp = RestAssured.get("https://reqres.in/api/users");
		int code =resp.getStatusCode();
		
		System.out.println(code);
		
		Assert.assertEquals(code, 200);
	}
	
	@Test
	public void testBody() {
		Response resp = RestAssured.get("https://reqres.in/api/users");
		String data = resp.asString();
		
		System.out.println("Data is "+data);
		
		System.out.println("Response time is "+resp.getTime());
	}
}
