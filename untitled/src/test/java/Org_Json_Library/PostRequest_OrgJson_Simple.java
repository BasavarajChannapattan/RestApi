package Org_Json_Library;

import io.restassured.response.Response;
import org.json.simple.JSONObject;

import static io.restassured.RestAssured.given;

public class PostRequest_OrgJson_Simple {

    public static void main(String[] args) {

        JSONObject BasicInfo = new JSONObject();
        BasicInfo.put("FirstName", "Basava");
        BasicInfo.put("LastName", "G");
        BasicInfo.put("age", "25");
        BasicInfo.put("id", "5");


        Response res = given()
                .contentType("application/json")
                .body(BasicInfo.toString())
                .when()
                .post("http://localhost:3000/friends");

        System.out.println("Status Code: " + res.getStatusCode());
        System.out.println("Data Created");
        System.out.println("Response: " + res.asString());
    }
}
