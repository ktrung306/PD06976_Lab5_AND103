package com.example.lab5_pd06976_nguyenkhactrung.services;

import com.example.lab5_pd06976_nguyenkhactrung.model.Distributor;
import com.example.lab5_pd06976_nguyenkhactrung.model.Response;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ApiServices {
    //Sử dụng máy ảo android studio thì localhost thay thành ip 10.0.0.2
    //Đối với máy thật ta sử dụng ip của máy
    //Base_URL là url của api


    //Annotations @GET cho method GET và url phương gọi
    // Base_URL + @GET("get-list-distributor") = http://192.168.1.6/api/get-list-distributor
    public static final String BASE_URL = "http://192.168.1.6:3000/api/";
    @GET("get-list-distributor")
        Call<Response<ArrayList<Distributor>>> getListDistributor();
    @GET("search-distributor")
        Call<Response<ArrayList<Distributor>>> searchDistributor(@Query("key") String key);
    @POST("add-distributor")
        Call<Response<Distributor>> addDistributor(@Body Distributor distributor);
    @PUT("update-distributor-by-id/{id}")
        Call<Response<Distributor>> updateDistributor(@Path("id") String id, @Body Distributor distributor);
    @DELETE("delete-distributor-by-id/{id}")
        Call<Response<Distributor>> deleteDistributor(@Path("id") String id);
}
