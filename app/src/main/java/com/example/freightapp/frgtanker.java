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

import com.example.freightapp.Adapters.AdapterTanker;
import com.example.freightapp.Base_url.BaseURL_Multiple;
import com.example.freightapp.Base_url.Interface_tanker_cr;
import com.example.freightapp.DataModels.dataModelTanker;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class frgtanker extends Fragment {
    View v ;
    RecyclerView recyclerViewTanker ;
    AdapterTanker adapterTanker ;
    List<dataModelTanker> dataModelTankerObject ;
    BaseURL_Multiple baseURL_multiple ;
    Interface_tanker_cr interface_tanker_cr ;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v= inflater.inflate(R.layout.fragment_frgtanker, container, false);

        setUpRecyclerView();
        return v;
    }

    private void setUpRecyclerView() {
        baseURL_multiple = new BaseURL_Multiple() ;
        interface_tanker_cr = baseURL_multiple.getInterface_tanker_cr() ;
        Call<List<dataModelTanker>> listCall = interface_tanker_cr.GetInterfaceApi();
        listCall.enqueue(new Callback<List<dataModelTanker>>() {
            @Override
            public void onResponse(Call<List<dataModelTanker>> call, Response<List<dataModelTanker>> response) {
                if(response.isSuccessful()){
                    dataModelTankerObject = response.body();
                    recyclerViewTanker = v.findViewById(R.id.RecyclerViewTankerView) ;
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext() , LinearLayoutManager.VERTICAL , false);
                    recyclerViewTanker.setLayoutManager(linearLayoutManager);
                    adapterTanker = new AdapterTanker(getContext() , dataModelTankerObject);
                    recyclerViewTanker.setAdapter(adapterTanker);

                }
            }

            @Override
            public void onFailure(Call<List<dataModelTanker>> call, Throwable t) {

            }
        });


    }


}
