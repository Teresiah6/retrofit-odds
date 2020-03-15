package com.example.android.oddsbets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    public static final String BASE_URL = "https://api.the-odds-api.com/?";
    public String apiKey = "b06668474acf7d52f3d7bd3046b82b7f";

    private RecyclerView recyclerView;
    private Data data;
    private Interface anInterface;
    private ArrayList <OddsBet> list;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = new Data ();
        list = new ArrayList<>();
        recyclerView =(RecyclerView) findViewById(R.id.recycler_view);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        anInterface = retrofit.create(Interface.class);


        getDatafromApi ();
    }

    private void getDatafromApi() {
        anInterface.getData(apiKey).enqueue(new Callback<Data>() {
            @Override
            public void onResponse(Call<Data> call, Response<Data> response) {
                if (response.isSuccessful() == true){
                   //list.addAll(response.body().data);
                    Toast.makeText(MainActivity.this, "Request successful", Toast.LENGTH_SHORT).show();
                    Log.d("Error", "error here" + response.isSuccessful() );
     //               setupAdapter(list);


                }

                else {
                    Toast.makeText(MainActivity.this, "No response", Toast.LENGTH_SHORT).show();
                }


            }

            @Override
            public void onFailure(Call<Data> call, Throwable t) {

                Toast.makeText(MainActivity.this, "There was an error loading data", Toast.LENGTH_SHORT).show();
                Log.d("Error", "error here" + t.getMessage() );
            }
        });
    }

//    private void setupAdapter(ArrayList<OddsBet> list) {
//        OddsAdapter oddsAdapter = new OddsAdapter(list);
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,
//                LinearLayoutManager.VERTICAL,false);
//        recyclerView.setLayoutManager(linearLayoutManager);
//        recyclerView.setAdapter(oddsAdapter);




//    }
}
