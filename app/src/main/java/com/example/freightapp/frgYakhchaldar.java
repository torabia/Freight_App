package com.example.freightapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.freightapp.Base_url.BaseURL_Multiple;
import com.example.freightapp.Base_url.Interface_yakhchaldar_cr;
import com.example.freightapp.DataModels.dataModelYakhchaldar;

import java.util.List;


public class frgYakhchaldar extends Fragment {
    View v ;
    BaseURL_Multiple baseURL_multiple ;
    RecyclerView recyclerView ;
    Interface_yakhchaldar_cr interface_yakhchaldar_cr  ;
    List<dataModelYakhchaldar> dataModelYakhchaldars ;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_frg_yakhchaldar, container, false);
        setUpRecyclerView();
        return v;
    }

    private void setUpRecyclerView() {
        baseURL_multiple = new BaseURL_Multiple();
        interface_yakhchaldar_cr = baseURL_multiple.getInterface_yakhchaldar_cr();
        Call<List<dataModelYakhchaldar>> listCall = interface_yakhchaldar_cr.GetInterfaceApi();


    }

}
