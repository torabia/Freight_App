package com.example.freightapp.Base_url;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BaseURL_Multiple {
    private Interface_yakhchaldar_cr interface_yakhchaldar_cr ;
    private Interface_bolghdar_cr interface_bolghdar_cr;
    private Interface_bonker_cr interface_bonker_cr ;
    private Interface_compersi_cr interface_compersi_cr ;
    private Interface_kafi_cr interface_kafi_cr ;
    private Interface_pickup_cr interface_pickup_cr;
    private Interface_tanker_cr interface_tanker_cr ;

    public BaseURL_Multiple(){
        Gson gson = new GsonBuilder().setLenient().create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://razifreightapplication.ir/FreightAppilication/")
                .addConverterFactory(GsonConverterFactory.create(gson)).build();

        interface_yakhchaldar_cr = retrofit.create(Interface_yakhchaldar_cr.class);
        interface_bolghdar_cr = retrofit.create(Interface_bolghdar_cr.class);
        interface_bonker_cr = retrofit.create(Interface_bonker_cr.class);
        interface_compersi_cr = retrofit.create(Interface_compersi_cr.class);
        interface_kafi_cr =  retrofit.create(Interface_kafi_cr.class);
        interface_pickup_cr =  retrofit.create(Interface_pickup_cr.class);
        interface_tanker_cr =  retrofit.create(Interface_tanker_cr.class);

    }

    public Interface_yakhchaldar_cr getInterface_yakhchaldar_cr() {
        return interface_yakhchaldar_cr;
    }
    public Interface_bolghdar_cr getInterface_bolghdar_cr() {
        return interface_bolghdar_cr;
    }
    public Interface_bonker_cr getInterface_bonker_cr(){
        return interface_bonker_cr;
    }
    public Interface_pickup_cr getInterface_pickup_cr(){
        return interface_pickup_cr;
    }
    public Interface_tanker_cr getInterface_tanker_cr(){
        return interface_tanker_cr;
    }
    public Interface_compersi_cr getInterface_compersi_cr(){
        return interface_compersi_cr;
    }
    public Interface_kafi_cr getInterface_kafi_cr(){
        return  interface_kafi_cr ;
    }


}
