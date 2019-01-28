package rest;

import com.sun.org.apache.xpath.internal.operations.Bool;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import static io.restassured.RestAssured.given;

public class SingleEmployeeAPI {

    @Test
    public void callSingleEmployeeResources() {
        Response response = given().when().get("http://info.venturepulse.org:8080/service-webapp/api/SingleEmployeeResources/590a4acd35522970c7956cdf").then().statusCode(200).extract().response();
        String statusLine = response.getStatusLine();
        int statusCode = response.getStatusCode();
        String body = response.getBody().prettyPrint();
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
        Assert.assertEquals(statusCode, 200);
    }

    @Test
    public void callSingleEmployeeRohanRahman() {
        Response response = given().when().get("http://info.venturepulse.org:8080/service-webapp/api/SingleEmployeeResources/590a4ada35522970c7956ce2").then().statusCode(200).extract().response();
        String statusLine = response.getStatusLine();
        int statusCode = response.getStatusCode();
        String body = response.getBody().prettyPrint();
        String header = response.getHeader("Content-Type");
        System.out.println(header);
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
        Assert.assertEquals(statusCode, 200);
        //System.out.println(response);
    }

    @Test
    public void postInfoFoysol() {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject jsonObject = new JSONObject();//json.simple.JSONObject
        jsonObject.put("empName", "Foysol");
        jsonObject.put("empEmail", "Ahmedfoysolhasan@@gmail.com");
        jsonObject.put("department", "QA");
        request.body(jsonObject.toJSONString());
        Response response = request.post("http://info.venturepulse.org:8080/service-webapp/api/SingleEmployeeResources");
        System.out.println(jsonObject);
    }
    @Test
    public void updateInfoFoysol(){
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("empName", "Foysol");
        jsonObject.put("empEmail", "AhmedFoysolHasan@gmail.com");
        jsonObject.put("department", "Finance");
        request.body(jsonObject.toJSONString());
        Response response = request.put("http://info.venturepulse.org:8080/service-webapp/api/SingleEmployeeResources/5c4bc0ec2fc21350f886bd4e");
        System.out.println(jsonObject);
    }
    @Test
    public void getInfoFoysol() {
        Response response = given().when().get("http://info.venturepulse.org:8080/service-webapp/api/SingleEmployeeResources/5c4bc0ec2fc21350f886bd4e").then().statusCode(200).extract().response();
    }
    @Test
    public void deleteInfoFoysol1() {
        RequestSpecification request = RestAssured.given();
        Response response = request.delete("http://info.venturepulse.org:8080/service-webapp/api/SingleEmployeeResources/5c49675a2fc21350f886bb56");
        boolean actual = response.equals(null);
        boolean expected = Boolean.parseBoolean(null);
        Assert.assertEquals(actual, expected);
    }
}