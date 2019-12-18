package com.example.freightapp.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.freightapp.DataModels.dataModelBonker;
import com.example.freightapp.R;

import java.util.List;

public class AdapterBonker extends RecyclerView.Adapter<AdapterBonker.viewHolderBonker> {
    Context context ;
    List<dataModelBonker>  dataModelBonkers ;

    public AdapterBonker(Context context, List<dataModelBonker> dataModelBonkers) {
        this.context = context;
        this.dataModelBonkers = dataModelBonkers;
    }

    @NonNull
    @Override
    public AdapterBonker.viewHolderBonker onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_data_cr, null);
        return new viewHolderBonker(view);



    }

    @Override
    public void onBindViewHolder(@NonNull AdapterBonker.viewHolderBonker holder, int i) {
        dataModelBonker dataModelBonkers1 =  dataModelBonkers.get(i);
        holder.tv_kala.setText(dataModelBonkers1.getKala());
        holder.tv_maghsad.setText(dataModelBonkers1.getMaghsad());
        holder.tv_mabdaa.setText(dataModelBonkers1.getMabdaa());
        holder.tv_bargirfa.setText(dataModelBonkers1.getBargirfa());
        holder.tv_daily.setText(dataModelBonkers1.getDaily());


    }

    @Override
    public int getItemCount() {
        return dataModelBonkers.size();
    }

    public class viewHolderBonker extends RecyclerView.ViewHolder {
        TextView tv_mabdaa, tv_maghsad, tv_kala, tv_bargirfa, tv_daily;
        RelativeLayout relItemLauoyt;

        public viewHolderBonker(@NonNull View itemView) {
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
