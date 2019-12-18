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

import com.example.freightapp.Adapters.AdapterBonker;
import com.example.freightapp.Base_url.BaseURL_Multiple;
import com.example.freightapp.Base_url.Interface_bonker_cr;
import com.example.freightapp.DataModels.dataModelBonker;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class frgBonker extends Fragment {
    View v ;
    RecyclerView recyclerViewBonker ;
    Interface_bonker_cr interface_bonker_cr ;
    List<dataModelBonker> dataModelObject ;
    BaseURL_Multiple baseURL_multiple ;
    Context context ;
    AdapterBonker adapterBonker ;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       v = inflater.inflate(R.layout.fragment_frg_bonker , container , false);
        setUpRecyclerView();

        return v;
    }

    private void setUpRecyclerView() {
        baseURL_multiple = new BaseURL_Multiple() ;
        interface_bonker_cr = baseURL_multiple.getInterface_bonker_cr();
        Call<List<dataModelBonker>> listCall = interface_bonker_cr.GetInterfaceApi();
        listCall.enqueue(new Callback<List<dataModelBonker>>() {
            @Override
            public void onResponse(Call<List<dataModelBonker>> call, Response<List<dataModelBonker>> response) {
                dataModelObject = response.body() ;
                recyclerViewBonker = v.findViewById(R.id.recyclerView) ;
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
                recyclerViewBonker.setLayoutManager(linearLayoutManager);
                recyclerViewBonker.setHasFixedSize(true);
                adapterBonker = new AdapterBonker(getContext() , dataModelObject);
                recyclerViewBonker.setAdapter(adapterBonker);


            }

            @Override
            public void onFailure(Call<List<dataModelBonker>> call, Throwable t) {

            }
        });

    }

}
