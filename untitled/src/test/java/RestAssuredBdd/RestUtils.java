package RestAssuredBdd;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {


    public static String getTitle(){
        String generatedString = RandomStringUtils.randomAlphabetic(1);
        return ("dummy product"+generatedString);
    }

    public static String getPrice(){
        String generatedString = RandomStringUtils.random(1);
        return ("10" +generatedString);
    }

    public static String getCategory(){
        String generatedString = RandomStringUtils.randomAlphabetic(1);
       return ("dummy category"+generatedString);
    }

    public static String getDescription(){
        String generatedString = RandomStringUtils.randomAlphabetic(1);
        return ("EOD"+generatedString);
    }

    public static String getImage(){
        String generatedString = RandomStringUtils.randomAlphabetic(1);
        return ("dummy image"+generatedString);
    }


}
