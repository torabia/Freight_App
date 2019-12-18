package com.example.freightapp.Base_url;

import com.example.freightapp.DataModels.dataModelYakhchaldar;
import com.example.freightapp.DataModels.dataModel_Defult;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Interface_yakhchaldar_cr {
    @GET("bargir_yakhchaldar_table.php")
    Call<List<dataModelYakhchaldar>> GetInterfaceApi();
}
