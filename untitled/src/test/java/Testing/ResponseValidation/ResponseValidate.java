package Testing.ResponseValidation;

import io.restassured.response.Response;

public class ResponseValidate {

    public void validateResponse(Response res)
    {
        System.out.println(res.getStatusLine());
        System.out.println(res.getBody().asString());
    }

}
