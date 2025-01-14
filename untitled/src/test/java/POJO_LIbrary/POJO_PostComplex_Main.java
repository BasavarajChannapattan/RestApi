package POJO_LIbrary;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class POJO_PostComplex_Main {

    public static void main(String[] args) {
//        POJO_PostComplex_Address Address = new POJO_PostComplex_Address();
//        Address.setHomeNo("2544/89");
//        Address.setStreet("HBR");
//        Address.setZipCode("5600453");

        POJO_PostComplex_Address[] address = new POJO_PostComplex_Address[2];
        address[0] = new POJO_PostComplex_Address();
        address[1]=new POJO_PostComplex_Address();

        address[0].setHomeNo("2544/89");
        address[0].setStreet("HBR");
        address[0].setZipCode("5600453");

        address[1].setHomeNo("2544/89");
        address[1].setStreet("HBR");
        address[1].setZipCode("5600453");


        POJO_PostComplex_BasicInfo Info = new POJO_PostComplex_BasicInfo();
        Info.setFirstName("John");
        Info.setLastName("l");
        Info.setMentorName("Basava");
        Info.setId(45);
        Info.setDesignation("Design");
        Info.setCourseName("Course");
        Info.setAddress(address);


        Response res =
                given()
                        .contentType(ContentType.JSON)
                        .body(Info)
                        .when()
                        .post("http://localhost:3000/friends");

        System.out.println("Status Code: " + res.getStatusCode());
        System.out.println("Data Created");
        System.out.println("Response: " + res.asString());

    }
}
