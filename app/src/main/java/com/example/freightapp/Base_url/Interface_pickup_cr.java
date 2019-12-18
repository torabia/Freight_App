package com.example.freightapp.Base_url;

import com.example.freightapp.DataModels.dataModelPickup;
import com.example.freightapp.DataModels.dataModel_Defult;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Interface_pickup_cr {

    @GET("pickup_truck_table.php")
    Call<List<dataModelPickup>> GetInterfaceApi();

}
