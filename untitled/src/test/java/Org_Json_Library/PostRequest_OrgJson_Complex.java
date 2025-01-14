package Org_Json_Library;

import io.restassured.response.Response;
import org.json.simple.JSONObject;

import static io.restassured.RestAssured.given;

public class PostRequest_OrgJson_Complex {

    public static void main(String[] args) {
        JSONObject AddressInfo = new JSONObject();
        AddressInfo.put("HomeNo", "45/89");
        AddressInfo.put("StreetName", "Bannur");
        AddressInfo.put("ZipCode", "78945");

        JSONObject BasicInfo2= new JSONObject();
        BasicInfo2.put("FirstName", "Basava");
        BasicInfo2.put("LastName", "G");
        BasicInfo2.put("age", "25");
        BasicInfo2.put("id", "5");
        BasicInfo2.put("Address",AddressInfo);

        Response res = given()
                .contentType("application/json")
                .body(BasicInfo2.toString())
                .when()
                .post("http://localhost:3000/friends");

        System.out.println("Status Code: " + res.getStatusCode());
        System.out.println("Data Created");
        System.out.println("Response: " + res.asString());
    }
}
