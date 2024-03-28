package com.example.lab5_pd06976_nguyenkhactrung.services;

import static com.example.lab5_pd06976_nguyenkhactrung.services.ApiServices.BASE_URL;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HttpRequest {
    //BIến Interface ApiServices
    private  ApiServices requestInterface;

    public HttpRequest() {
        requestInterface = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(ApiServices.class);
    }
    public ApiServices callAPI() {
        //Get Retrofit
        return requestInterface;
    }
}

