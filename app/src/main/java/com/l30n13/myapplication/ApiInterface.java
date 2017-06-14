package com.l30n13.myapplication;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/**
 * Created by leon on 6/14/17.
 */

public interface ApiInterface {
    @Headers({
            "authorization:32DFCFD@#&DSFDSFSDF!L@?hh7@32DF"
    })
    @GET("client")
    Call<ClientResponse> getClients();
}
