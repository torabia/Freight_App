package com.example.freightapp.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.freightapp.DataModels.dataModelKafi;
import com.example.freightapp.R;

import java.util.List;

public class AdapterKafi extends RecyclerView.Adapter<AdapterKafi.viewHolderKafi> {
    Context context ;
    List<dataModelKafi> dataModelKafis ;

    public AdapterKafi(Context context, List<dataModelKafi> dataModelKafis) {
        this.context = context;
        this.dataModelKafis = dataModelKafis;
    }

    @NonNull
    @Override
    public AdapterKafi.viewHolderKafi onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_data_cr , null);

        return new viewHolderKafi(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterKafi.viewHolderKafi holder, int i) {
        dataModelKafi dataModelKafi1 =dataModelKafis.get(i);
        holder.tv_kala.setText(dataModelKafi1.getKala());
        holder.tv_maghsad.setText(dataModelKafi1.getMaghsad());
        holder.tv_mabdaa.setText(dataModelKafi1.getMabdaa());
        holder.tv_bargirfa.setText(dataModelKafi1.getBargirfa());
        holder.tv_daily.setText(dataModelKafi1.getDaily());



    }

    @Override
    public int getItemCount() {
        return dataModelKafis.size();
    }
    //dataModelKafi

    public class viewHolderKafi extends RecyclerView.ViewHolder {
        TextView tv_mabdaa, tv_maghsad, tv_kala, tv_bargirfa, tv_daily;
        RelativeLayout relItemLauoyt;

        public viewHolderKafi(@NonNull View itemView) {
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
