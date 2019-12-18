package com.example.freightapp.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.freightapp.DataModels.dataModelTanker;
import com.example.freightapp.R;

import java.util.List;

public class AdapterTanker extends RecyclerView.Adapter<AdapterTanker.viewHolderTanker> {
    Context context;
    List<dataModelTanker> dataModelTankers ;

    public AdapterTanker(Context context, List<dataModelTanker> dataModelTankers) {
        this.context = context;
        this.dataModelTankers = dataModelTankers;
    }

    @NonNull
    @Override
    public AdapterTanker.viewHolderTanker onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_data_cr, null);
        return new viewHolderTanker(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterTanker.viewHolderTanker viewHolderTanker, int i) {
       dataModelTanker dataModelTankersi =  dataModelTankers.get(i);
        viewHolderTanker.tv_kala.setText(dataModelTankersi.getKala());
        viewHolderTanker.tv_maghsad.setText(dataModelTankersi.getMaghsad());
        viewHolderTanker.tv_mabdaa.setText(dataModelTankersi.getMabdaa());
        viewHolderTanker.tv_bargirfa.setText(dataModelTankersi.getBargirfa());
        viewHolderTanker.tv_daily.setText(dataModelTankersi.getDaily());

    }

    @Override
    public int getItemCount() {
        return dataModelTankers.size();
    }

    public class viewHolderTanker extends RecyclerView.ViewHolder {
        TextView tv_mabdaa, tv_maghsad, tv_kala, tv_bargirfa, tv_daily;
        RelativeLayout relItemLauoyt;

        public viewHolderTanker(@NonNull View itemView) {
            super(itemView);
            tv_mabdaa = itemView.findViewById(R.id.tv_mabdaa_harrixAtom);
            tv_maghsad = itemView.findViewById(R.id.tv_maghsad_harrixAtom);
            tv_kala = itemView.findViewById(R.id.tv_kala_harrixAtom);
            tv_bargirfa = itemView.findViewById(R.id.tv_bargir_harrixAtom);
            tv_daily = itemView.findViewById(R.id.tv_daily_harrixAtom);
            relItemLauoyt = itemView.findViewById(R.id.Rel_ItemLayout);
        }
    }


}
