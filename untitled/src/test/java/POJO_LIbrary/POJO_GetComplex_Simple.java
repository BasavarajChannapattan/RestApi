package POJO_LIbrary;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class POJO_GetComplex_Simple {

    public static void main(String[] args) {


        Response res = given()
                .contentType(ContentType.JSON)
                .when()
                .get("http://localhost:3000/friends");

        System.out.println("response status code "+ res.getStatusCode());
        System.out.println("response body "+ res.getBody().asString());
    }
}
