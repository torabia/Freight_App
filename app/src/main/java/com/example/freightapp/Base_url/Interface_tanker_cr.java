package com.example.freightapp.Base_url;

import com.example.freightapp.DataModels.dataModelTanker;
import com.example.freightapp.DataModels.dataModel_Defult;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Interface_tanker_cr {
    @GET("tanker_bar_table.php")
    Call<List<dataModelTanker>> GetInterfaceApi();
}
