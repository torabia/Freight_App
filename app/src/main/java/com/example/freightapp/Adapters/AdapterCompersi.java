package com.example.freightapp.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.freightapp.DataModels.dataModelCompresi;
import com.example.freightapp.R;

import java.util.List;

public class AdapterCompersi extends RecyclerView.Adapter<AdapterCompersi.viewHolderCompersi> {
    Context context ;
    List<dataModelCompresi> dataModelCompersib ;

    public AdapterCompersi(Context context, List<dataModelCompresi> dataModelCompersi1) {
        this.context = context;
        this.dataModelCompersib = dataModelCompersi1;
    }

    @NonNull
    @Override
    public AdapterCompersi.viewHolderCompersi onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_data_cr , null);
        return new viewHolderCompersi(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderCompersi holder, int i) {
        dataModelCompresi dataModelCompersi = dataModelCompersib.get(i);
        holder.tv_kala.setText(dataModelCompersi.getKala());
        holder.tv_maghsad.setText(dataModelCompersi.getMaghsad());
        holder.tv_mabdaa.setText(dataModelCompersi.getMabdaa());
        holder.tv_bargirfa.setText(dataModelCompersi.getBargirfa());
        holder.tv_daily.setText(dataModelCompersi.getDaily());

    }

    @Override
    public int getItemCount() {
        return dataModelCompersib.size();
    }
    
    public  class viewHolderCompersi extends RecyclerView.ViewHolder {
        TextView tv_mabdaa, tv_maghsad, tv_kala, tv_bargirfa, tv_daily;
        RelativeLayout relItemLauoyt;
        public viewHolderCompersi(@NonNull View itemView) {
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
