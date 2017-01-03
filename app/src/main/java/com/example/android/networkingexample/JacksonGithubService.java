package com.example.android.networkingexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface JacksonGithubService {

    @GET("users/{user}/repos")
    Call<List<Repo>> listRepos(@Path("user") String username);
}
