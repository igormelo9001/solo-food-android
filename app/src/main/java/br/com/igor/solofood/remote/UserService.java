package br.com.igor.solofood.remote;

import br.com.igor.solofood.model.ResLogin;
import br.com.igor.solofood.model.Usuario;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by igor on 11/03/2018.
 */

public interface UserService {

    @POST("login")
    Call<ResLogin> login(@Body() Usuario usuario);

    @POST("register")
    Call<ResLogin> cadastro(@Body() Usuario usuario);

}
