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
import com.example.freightapp.Adapters.AdapterCompersi;
import com.example.freightapp.Base_url.BaseURL_Multiple;
import com.example.freightapp.Base_url.Interface_compersi_cr;
import com.example.freightapp.DataModels.DataModel_GridView;
import com.example.freightapp.DataModels.dataModelCompresi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class frgCompersi extends Fragment {
    View v ;
    RecyclerView recyclerView ;
    Interface_compersi_cr interface_compersi_cr ;
    List<dataModelCompresi> dataModelObject ;
    BaseURL_Multiple baseURL_multiple  ;
    Context context ;
    AdapterCompersi adapterCompersi ;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_frg_compersi , container , false);

        setUpRecyclerView();
        // Inflate the layout for this fragment
        return v;
    }

    private void setUpRecyclerView() {


    }


}
