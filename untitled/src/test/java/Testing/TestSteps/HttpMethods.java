package Testing.TestSteps;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import Testing.Payloads.PojoBodyData;
import Testing.Payloads.helper_Products;

import java.util.Properties;

import static io.restassured.RestAssured.given;

public class HttpMethods {

    static Properties pr;
    public HttpMethods(Properties pr) {
      this.pr=pr;
    }

    public static Response GetRequest(String URI)
    {
          Response res=
                  given()
                          .contentType(ContentType.JSON)
                  .when()
                          .get(pr.getProperty(URI));
          return res;
    }

    public static Response PostRequest(PojoBodyData Body, String URI)
    {
        Response res=
                given()
                        .contentType(ContentType.JSON)
                        .body(Body)
                        .when()
                        .post(pr.getProperty(URI));
        return res;
    }

    public static Response PostRequest(helper_Products Body, String URI)
    {
        Response res=
                given()
                        .contentType(ContentType.JSON)
                        .body(Body)
                        .when()
                        .post(pr.getProperty(URI));
        return res;
    }

    public static Response GetRequest(String URI, String Id) {
        // Construct the full URL by appending the product ID to the URI
        String endpoint = pr.getProperty(URI) + "/" + Id;
        Response res = given()
                .contentType(ContentType.JSON)
                .when()
                .get(endpoint);
        return res;
    }


}
