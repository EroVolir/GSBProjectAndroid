package com.example.gsbproject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GsbService {

    @GET("visiteurs.json")
    Call<Visiteurs> getAllVisiteurs();

    @GET("praticiens.json")
    Call<Praticiens> getAllPraticiens();
}
