package RestAssuredBdd;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class CreateProducts {

    public static HashMap map = new HashMap();
    @BeforeClass
    public static void postData(){
        map.put("title", RestUtils.getTitle());
        map.put("price", RestUtils.getPrice());
        map.put("category", RestUtils.getCategory());
        map.put("description", RestUtils.getDescription());
        map.put("image", RestUtils.getImage());

        RestAssured.baseURI="https://fakestoreapi.com";
        RestAssured.basePath="/products";

    }

    @Test
    public void createProduct(){

        given()
                .contentType(ContentType.JSON)
                .body(map)
                .when()
                .post()
                .then()
                .statusCode(200)
                .log().all();

    }
}
