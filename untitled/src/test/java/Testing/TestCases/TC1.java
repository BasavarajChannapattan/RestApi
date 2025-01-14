package Testing.TestCases;

import io.restassured.response.Response;
import Testing.ResponseValidation.ResponseValidate;
import Testing.TestSteps.HttpMethods;
import Testing.Utilities.PropertiesFileLoad;
import java.io.IOException;
import java.util.Properties;

public class TC1 {


    public static void main(String[] args) throws IOException {
        Properties pr = PropertiesFileLoad.PropFileLoad("../RestAutomationFramework/Env.Properties");
        HttpMethods httpMethods = new HttpMethods(pr);
        Response res =httpMethods.GetRequest("QA_URL2");
        ResponseValidate responseVal = new ResponseValidate();
        responseVal.validateResponse(res);
    }


}
