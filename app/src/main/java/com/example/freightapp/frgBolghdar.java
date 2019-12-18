package com.example.freightapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.freightapp.Adapters.AdapterBolghdar;
import com.example.freightapp.Base_url.BaseURL_Multiple;
import com.example.freightapp.Base_url.Interface_bolghdar_cr;
import com.example.freightapp.DataModels.dataModelBolghdar;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class frgBolghdar extends Fragment {
    RecyclerView recyclerViewBolghdar;
    AdapterBolghdar adapterBolghdar;
    View v;
    Interface_bolghdar_cr interface_bolghdar_cr;
    List<dataModelBolghdar> dataModelObject;
    BaseURL_Multiple baseURL_multiple;
    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.frg_bloghdar, container, false);

        setUpRecyclerView();


        return v;
    }

    public void setUpRecyclerView() {
        baseURL_multiple = new BaseURL_Multiple();

        interface_bolghdar_cr = baseURL_multiple.getInterface_bolghdar_cr();

        Call<List<dataModelBolghdar>> listCall = interface_bolghdar_cr.GetInterfaceApi();

        listCall.enqueue(new Callback<List<dataModelBolghdar>>() {
            @Override
            public void onResponse(Call<List<dataModelBolghdar>> call, Response<List<dataModelBolghdar>> response) {

                if (response.isSuccessful()) {

                    dataModelObject = response.body();
                    recyclerViewBolghdar = v.findViewById(R.id.RecyclerView);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
                    recyclerViewBolghdar.setLayoutManager(linearLayoutManager);
                    recyclerViewBolghdar.setHasFixedSize(true);
                    adapterBolghdar = new AdapterBolghdar(getContext(), dataModelObject);
                    recyclerViewBolghdar.setAdapter(adapterBolghdar);

                }
            }

            @Override
            public void onFailure(Call<List<dataModelBolghdar>> call, Throwable t) {


            }
        });

    }


}
