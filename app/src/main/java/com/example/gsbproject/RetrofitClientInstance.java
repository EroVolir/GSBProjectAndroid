package com.example.gsbproject;

import android.text.TextUtils;
import android.util.Log;

import java.io.IOException;
import java.util.Base64;

import okhttp3.Credentials;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {

    private static Retrofit retrofit;

    private static final String BASE_URL = "http://192.168.1.68/GSB/";



    public static Retrofit getRetrofitInstance(final String login, final String password) {
        if (retrofit == null) {

           OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
            httpClient.addInterceptor(new Interceptor() {
                String encodage =login+":"+password;
                final String encodedString = Base64.getEncoder().encodeToString(encodage.getBytes());
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Request request = chain.request().newBuilder().addHeader("Authorization", "Basic " + encodedString ).build();
                    return chain.proceed(request);
                }
            });


            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient.build())
                    .build();
        }
        return retrofit;

    }



}

