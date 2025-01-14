package POJO_LIbrary;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class PostRequest {
    public static void main(String[] args) {

        POJO_PostComplex_BasicInfo Data = new POJO_PostComplex_BasicInfo();
        Data.setFirstName(("Basavaraj"));
        Data.setLastName(("G"));
        Data.setId(365);
        Data.setMentorName("Basava");
        Data.setCourseName("RestAssured");
        Data.setDesignation("SDET 1");

        Response res= given()
                .contentType(ContentType.JSON)
                .body(Data)
                .when()
                .post("http://localhost:3000/friends");

        System.out.println("Status Code: " + res.getStatusCode());
        System.out.println("Data Created");
        System.out.println("Response: " + res.asString());

    }
}
