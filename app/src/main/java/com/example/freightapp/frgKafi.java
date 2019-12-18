package com.example.freightapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.freightapp.Adapters.AdapterKafi;
import com.example.freightapp.Base_url.BaseURL_Multiple;
import com.example.freightapp.Base_url.Interface_kafi_cr;
import com.example.freightapp.DataModels.dataModelKafi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class frgKafi extends Fragment {
    View v  ;
    RecyclerView recyclerView ;
    Interface_kafi_cr interface_kafi_cr ;
    List<dataModelKafi> dataModelObjetcKafi ;
    BaseURL_Multiple baseURL_multiple ;
    AdapterKafi adapterKafi ;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_frg_kafi , container , false);

        setUpRecyclerView();

        // Inflate the layout for this fragment
        return v;
    }

    private void setUpRecyclerView() {
        baseURL_multiple = new BaseURL_Multiple() ;
        interface_kafi_cr = baseURL_multiple.getInterface_kafi_cr();
        Call<List<dataModelKafi>> listCall = interface_kafi_cr.GetInterfaceApi();
        listCall.enqueue(new Callback<List<dataModelKafi>>() {
            @Override
            public void onResponse(Call<List<dataModelKafi>> call, Response<List<dataModelKafi>> response) {
                Log.e("Eror", "Bug");
                if (response.isSuccessful()) {
                    dataModelObjetcKafi = response.body();
                    recyclerView = v.findViewById(R.id.reyclerViewKafi);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
                    recyclerView.setLayoutManager(linearLayoutManager);
                    recyclerView.setHasFixedSize(true);
                    adapterKafi = new AdapterKafi(getContext(), dataModelObjetcKafi);
                    recyclerView.setAdapter(adapterKafi);
                }
            }

            @Override
            public void onFailure(Call<List<dataModelKafi>> call, Throwable t) {

            }
        });


    }


}
