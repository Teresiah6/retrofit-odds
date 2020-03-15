package com.example.android.oddsbets;



import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Interface {

    @GET("v3/odds?sport=soccer_epl&region=uk&")
    Call<Data> getData (@Query("apiKey") String api);
}
