package RestAssuredBdd;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetAllProducts {

    @Test
    public  void getAlltheProducts(){

        given()
                .when()
                .get("https://fakestoreapi.com/products")
                  .then()
                .statusCode(200)
                .assertThat().body("id[0]",equalTo(1))
                .header("Server", "cloudflare").log().all();



    }
}
