package Org_Json_Library;

import io.restassured.response.Response;
import org.example.Main;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import static io.restassured.RestAssured.given;

public class PostRequest_OrgJson_Array {


    public static void main(String[] args) {
        JSONArray arr = new JSONArray();
        JSONObject firstInfo = new JSONObject();
        firstInfo.put("HomeNo", "564");
        firstInfo.put("Street","KomalNagara");
        firstInfo.put("ZipCode","785641546");

        JSONObject SecondInfo = new JSONObject();
        SecondInfo.put("HomeNo", "53453");
        SecondInfo.put("Street","Kamanahalli");
        SecondInfo.put("ZipCode","560041");

        arr.add(0,firstInfo);
        arr.add(1,SecondInfo);

        JSONObject BasicInfo3= new JSONObject();
        BasicInfo3.put("FirstName", "Basava");
        BasicInfo3.put("LastName", "G");
        BasicInfo3.put("age", "25");
        BasicInfo3.put("id", "5");
        BasicInfo3.put("Address",arr);


        Response res=
                given()
                        .contentType("application/json")
                        .body(BasicInfo3.toString())
                        .when()
                        .post("http://localhost:3000/friends");

        System.out.println("Status Code: " + res.getStatusCode());
        System.out.println("Data Created");
        System.out.println("Response: " + res.asString());




    }

}
