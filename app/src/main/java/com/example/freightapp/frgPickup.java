package com.example.freightapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.freightapp.Adapters.AdapterPickup;
import com.example.freightapp.Base_url.BaseURL_Multiple;
import com.example.freightapp.Base_url.Interface_pickup_cr;
import com.example.freightapp.DataModels.dataModelPickup;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class frgPickup extends Fragment {
    View v ;
    AdapterPickup adapterPickup ;
    RecyclerView recyclerViewPickup ;
    Interface_pickup_cr interface_pickup_cr ;
    List<dataModelPickup> dataModelPickups ;
    BaseURL_Multiple baseURL_multiple ;
    Context context ;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_frg_pickup , container , false);
        setUpRecyclerView();
        return v ;
    }
    public  void  setUpRecyclerView(){
        baseURL_multiple = new BaseURL_Multiple() ;

        interface_pickup_cr = baseURL_multiple.getInterface_pickup_cr() ;

        Call<List<dataModelPickup>> listCall = interface_pickup_cr.GetInterfaceApi();

       listCall.enqueue(new Callback<List<dataModelPickup>>() {
           @Override
           public void onResponse(Call<List<dataModelPickup>> call, Response<List<dataModelPickup>> response) {
               if (response.isSuccessful()){

                   dataModelPickups = response.body() ;
                   recyclerViewPickup = v.findViewById(R.id.recycelerViewPickup);
                   LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
                   recyclerViewPickup.setLayoutManager(linearLayoutManager);
                   recyclerViewPickup.setHasFixedSize(true);
                   adapterPickup = new AdapterPickup(getContext() , dataModelPickups);
                   recyclerViewPickup.setAdapter(adapterPickup);

               }
           }

           @Override
           public void onFailure(Call<List<dataModelPickup>> call, Throwable t) {

           }
       });

    }



}
