package com.example.hemanthkumar.retrofit;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by hemanthkumar on 2/11/17.
 */

public interface Api {
    String BASE_URL = "http://sweettutos.com/";
    @GET("movies.json/")
    Call<Hero> getHeroes();
}
