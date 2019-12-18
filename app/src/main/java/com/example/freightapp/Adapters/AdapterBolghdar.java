package com.example.freightapp.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.freightapp.DataModels.dataModelBolghdar;
import com.example.freightapp.R;

import java.util.List;

public class AdapterBolghdar extends RecyclerView.Adapter<AdapterBolghdar.viewHolderBolghdar> {
    Context context;
    List<dataModelBolghdar> dataModelBolghdar;

    public AdapterBolghdar(Context context, List<com.example.freightapp.DataModels.dataModelBolghdar> dataModelBolghdar) {
        this.context = context;
        this.dataModelBolghdar = dataModelBolghdar;
    }

    @NonNull
    @Override
    public AdapterBolghdar.viewHolderBolghdar onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_data_cr, null);
        return new viewHolderBolghdar(view);

    }

    @Override
    public void onBindViewHolder(@NonNull AdapterBolghdar.viewHolderBolghdar holder, int i) {
        dataModelBolghdar dataModelBolghdar1 = dataModelBolghdar.get(i);
        holder.tv_kala.setText(dataModelBolghdar1.getKala());
        holder.tv_maghsad.setText(dataModelBolghdar1.getMaghsad());
        holder.tv_mabdaa.setText(dataModelBolghdar1.getMabdaa());
        holder.tv_bargirfa.setText(dataModelBolghdar1.getBargirfa());
        holder.tv_daily.setText(dataModelBolghdar1.getDaily());


    }

    @Override
    public int getItemCount() {
        return dataModelBolghdar.size();
    }

    public class viewHolderBolghdar extends RecyclerView.ViewHolder {
        TextView tv_mabdaa, tv_maghsad, tv_kala, tv_bargirfa, tv_daily;
        RelativeLayout relItemLauoyt;

        public viewHolderBolghdar(@NonNull View itemView) {
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
