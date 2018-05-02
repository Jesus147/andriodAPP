package com.example.sloff.tokentestempty;


import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;



public interface UserClient {

    @POST("/api/login")
    Call<User> login(@Body Login login);

    @POST("user")
    Call<User> createAccount(@Body User user);

    @GET("/api/dashboard")
    Call<ResponseBody> getJSON(@Header("Authorization") String authToken);

    @GET("/users/{user}/repos")
    Call<List<User>> reposForUser(@Path("user") String user);

    @Multipart
    @POST("/")
    Call<ResponseBody> postImage(@Part MultipartBody.Part image, @Part("name") RequestBody name);

}
