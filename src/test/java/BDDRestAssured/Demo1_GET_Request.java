/*URL : https://dummy.restapiexample.com/api/v1/employees
	
	given()
		set cookies , add auth , add auth , set headers info etc
		
		when()
			GET , POST , PUT , DELETE...abstract
			
		then()
			validate status code , extract response , extract headers cookies and Response body...
*/


package BDDRestAssured;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class Demo1_GET_Request {
	
	@Test
	public void getEmployeeDetails() {
		
		given()
         
     .when()
         .get("http://dummy.restapiexample.com/api/v1/employees")
    .then()
         .statusCode(200)
		.assertThat().body("status", equalTo("success"))
		.headers("CF-Cache-Status" , "DYNAMIC");
	}

}
