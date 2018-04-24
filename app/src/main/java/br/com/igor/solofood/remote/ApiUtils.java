package br.com.igor.solofood.remote;

/**
 * Created by igor on 11/03/2018.
 */

public class ApiUtils {

    public static final String BASE_URL = "https://dev.people.com.ai/mobile/api/v2/";

    public static UserService getUserService(){
        return RetroFitClient.getClient(BASE_URL).create(UserService.class);
    }

}
