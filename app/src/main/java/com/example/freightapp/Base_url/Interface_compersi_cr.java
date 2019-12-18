package com.example.freightapp.Base_url;

import com.example.freightapp.DataModels.dataModelCompresi;
import com.example.freightapp.DataModels.dataModel_Defult;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Interface_compersi_cr {
    @GET("compersi_bar_table.php")
    Call<List<dataModelCompresi>> GetInterfaceApi();
}
