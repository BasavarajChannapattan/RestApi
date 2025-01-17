package RestAssuredBdd.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;


public class Products {

    private Response response;
    public ResponseBody body;

    @Given("I want to get all products")
    public void i_want_to_get_all_products() {
        RestAssured.baseURI = "https://fakestoreapi.com";
    }

    @When("I send a GET request to products")
    public void i_send_a_get_request_to_products() {
        RequestSpecification httpRequest = RestAssured.given();
        response = httpRequest.get("/products");
    }

    @Then("I should get a {int} status code")
    public void i_should_get_a_status_code(int expectedStatusCode) {
        int actualStatusCode = response.getStatusCode();
        System.out.println("Status code: " + actualStatusCode);
        assert actualStatusCode == expectedStatusCode : "Expected: " + expectedStatusCode + ", but got: " + actualStatusCode;
    }

    @Then("I want to get the first product of {}")
    public void i_want_to_get_the_first_product(String org0) {
        // Write code here that turns the phrase above into concrete actions
        body = response.getBody();
        JsonPath jsonPath = response.jsonPath();
        //String firstRating = jsonPath.getJsonObject("rating[0].rate");
       // System.out.println("First rating: " + firstRating);
        //throw new io.cucumber.java.PendingException();
    }
}
