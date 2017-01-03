package com.example.android.networkingexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Manuel on 03.01.2017.
 */

public interface ShowWiFiLocationService {

    @GET("http://redi-free-wifi.herokuapp.com/venues.json")
    Call<List<String>> listWiFiLocations();

}
