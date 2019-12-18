package com.example.freightapp.Base_url;

import com.example.freightapp.DataModels.dataModelKafi;
import com.example.freightapp.DataModels.dataModel_Defult;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Interface_kafi_cr {
    @GET("kafi_bar_table.php")
    Call<List<dataModelKafi>> GetInterfaceApi();
}
