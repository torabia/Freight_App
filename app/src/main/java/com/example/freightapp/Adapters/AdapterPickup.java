package com.example.freightapp.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.freightapp.DataModels.dataModelPickup;
import com.example.freightapp.R;

import java.util.List;

public class AdapterPickup extends RecyclerView.Adapter<AdapterPickup.viewHolderAdapterPickup> {
    Context context ;
    List<dataModelPickup> dataModelPickups ;

    public AdapterPickup(Context context, List<dataModelPickup> dataModelPickups) {
        this.context = context;
        this.dataModelPickups = dataModelPickups;
    }

    @NonNull
    @Override
    public AdapterPickup.viewHolderAdapterPickup onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_data_cr, null);
        return new viewHolderAdapterPickup(view);

    }

    @Override
    public void onBindViewHolder(@NonNull AdapterPickup.viewHolderAdapterPickup viewHolderAdapterPickup, int i) {
        dataModelPickup dataModelPickup = dataModelPickups.get(i);
        viewHolderAdapterPickup.tv_kala.setText(dataModelPickup.getKala());
        viewHolderAdapterPickup.tv_maghsad.setText(dataModelPickup.getMaghsad());
        viewHolderAdapterPickup.tv_mabdaa.setText(dataModelPickup.getMabdaa());
        viewHolderAdapterPickup.tv_bargirfa.setText(dataModelPickup.getBargirfa());
        viewHolderAdapterPickup.tv_daily.setText(dataModelPickup.getDaily());

    }

    @Override
    public int getItemCount() {
        return dataModelPickups.size();
    }

    public  class viewHolderAdapterPickup extends RecyclerView.ViewHolder {

        TextView tv_mabdaa, tv_maghsad, tv_kala, tv_bargirfa, tv_daily;
        RelativeLayout relItemLauoyt;

        public viewHolderAdapterPickup(@NonNull View itemView) {
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
