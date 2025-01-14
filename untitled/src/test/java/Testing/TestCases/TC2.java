package Testing.TestCases;

import io.restassured.response.Response;
import Testing.Payloads.PojoBodyData;
import Testing.Payloads.PojoSimpleBody;
import Testing.ResponseValidation.ResponseValidate;
import Testing.TestSteps.HttpMethods;
import Testing.Utilities.PropertiesFileLoad;
import java.io.IOException;
import java.util.Properties;

public class TC2 {


    public static void main(String[] args) throws IOException {
        Properties pr = PropertiesFileLoad.PropFileLoad("../RestAutomationFramework/Env.Properties");
        HttpMethods httpMethods = new HttpMethods(pr);

        PojoBodyData data = PojoSimpleBody.GetBodyData();
        Response res =httpMethods.PostRequest(data, "QA_URL1");
        ResponseValidate responseVal = new ResponseValidate();
        responseVal.validateResponse(res);
    }
}
