package rest_Assured;

import dataAndResources.PayLoad;
import dataAndResources.Resources;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class AddandDeletePlaceTest {

    Properties prop=new Properties();

    @BeforeTest
    public void getData() throws IOException
    {
        FileInputStream fis=new FileInputStream("../Rest_Assured/src/test/resources/env.properties");
        prop.load(fis);
    }

    @Test
    public void addAndDeletePlace()
    {
        //Task 1- Grab the response
        RestAssured.baseURI= prop.getProperty("HOST");
        Response res = given().
                queryParam("key",prop.getProperty("KEY")).
                body(PayLoad.getPostData()).
                when().
                post(Resources.placePostData()).
                then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
                body("status",equalTo("OK")).
                extract().response();
        // Task 2- Grab the Place ID from response

        String responseString=res.asString();
        System.out.println(responseString);
        JsonPath js= new JsonPath(responseString);
        String placeId=js.get("place_id");
        System.out.println(placeId);


        //Task 3 place this place id in the Delete request
        given().
                queryParam("key",prop.getProperty("KEY")).

                body("{"+
                        "\"place_id\": \""+placeId+"\""+
                        "}").
                when().
                post(Resources.placeDeleteData()).
                then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
                body("status",equalTo("OK"));
    }


}
