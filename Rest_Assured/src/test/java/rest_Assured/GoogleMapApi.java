package rest_Assured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class GoogleMapApi {

    @BeforeMethod
    public void getApi () {

    }

    @Test
    public void getDta () {
        RestAssured.baseURI="https://maps.googleapis.com";
        given().
                param("location","-33.8670522,151.1957362").
                param("radius","1500").
                param("key","AIzaSyDIQgAh0B4p0SdyYkyW8tlG-y0yJMfss5Y").
                when().get("/maps/api/place/nearbysearch/json").
                //verify Content type
                then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
                //verify the body
                body("results[0].name",equalTo("Sydney")).and().
                //verify the body
                body("results[0].place_id",equalTo("ChIJP3Sa8ziYEmsRUKgyFmh9AQM")).and().
                //Header responses
                header("Server","scaffolding on HTTPServer2");

    }

    @Test
    public void createPlaceAPI() {
        RestAssured.baseURI = "https://maps.googleapis.com";
        given().

                queryParam("key", "AIzaSyDIQgAh0B4p0SdyYkyW8tlG-y0yJMfss5Y").
                body("{" +
                        "\"location\": {" +
                        "\"lat\": -33.8669710," +
                        "\"lng\": 151.1958750" +
                        "}," +
                        "\"accuracy\": 50," +
                        "\"name\": \"Google Shoes!\"," +
                        "\"phone_number\": \"(02) 9374 4000\"," +
                        "\"address\": \"48 Pirrama Road, Pyrmont, NSW 2009, Australia\"," +
                        "\"types\": [\"shoe_store\"]," +
                        "\"website\": \"http://www.google.com.au/\"," +
                        "\"language\": \"en-AU\"" +
                        "}").
                when().
                post("/maps/api/place/add/json").
                then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
                body("status", equalTo("OK"));

    }

}
