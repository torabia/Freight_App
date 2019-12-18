package com.example.freightapp.Base_url;

import com.example.freightapp.DataModels.dataModelBonker;
import com.example.freightapp.DataModels.dataModel_Defult;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Interface_bonker_cr {
    @GET("bonker_bar_table.php")
    Call<List<dataModelBonker>> GetInterfaceApi();
}
