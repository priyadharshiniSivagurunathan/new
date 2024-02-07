package org.sam;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class testngApi {
@Test
	private void getRequ() {
		// TODO Auto-generated method stub
Response response = RestAssured.get("https://dummy.restapiexample.com/api/v1/employee/1");
ResponseBody responseBody = response.body();
System.out.println(responseBody.asPrettyString());


}

}
