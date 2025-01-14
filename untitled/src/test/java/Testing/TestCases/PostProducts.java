package Testing.TestCases;

import io.restassured.response.Response;
import Testing.Payloads.helpers_Products_Data;
import Testing.Payloads.helper_Products;
import Testing.ResponseValidation.ResponseValidate;
import Testing.TestSteps.HttpMethods;
import Testing.Utilities.PropertiesFileLoad;

import java.io.IOException;
import java.util.Properties;

public class PostProducts {

    public static void main(String[] args) throws IOException {
        Properties pr = PropertiesFileLoad.PropFileLoad("../RestAutomationFramework/Env.Properties");
        HttpMethods httpMethods = new HttpMethods(pr);

        helper_Products products = helpers_Products_Data.getProductsData();
        Response res = httpMethods.PostRequest(products, "BaseProductURL");
        System.out.println("Product Created: " + res.asString());
        String ProductId = res.jsonPath().getString("id");


        Response getResponse = httpMethods.GetRequest("BaseProductURL", ProductId);
        System.out.println("Retrieved Product: " + getResponse.asString());
        ResponseValidate resVal = new ResponseValidate();
        resVal.validateResponse(getResponse);
    }
}
