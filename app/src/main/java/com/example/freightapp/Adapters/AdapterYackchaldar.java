package com.example.freightapp.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.freightapp.DataModels.dataModelYakhchaldar;
import com.example.freightapp.R;

import java.util.List;

public class AdapterYackchaldar extends RecyclerView.Adapter<AdapterYackchaldar.viewHolderYakhchaldar> {
    Context context ;
    List<dataModelYakhchaldar> dataModelYakhchaldars ;

    public AdapterYackchaldar(Context context, List<dataModelYakhchaldar> dataModelYakhchaldars) {
        this.context = context;
        this.dataModelYakhchaldars = dataModelYakhchaldars;
    }

    @NonNull
    @Override
    public AdapterYackchaldar.viewHolderYakhchaldar onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(context) ;
        View view = layoutInflater.inflate(R.layout.item_data_cr , null );
        return new viewHolderYakhchaldar(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterYackchaldar.viewHolderYakhchaldar viewHolderYakhchaldar, int i) {
        dataModelYakhchaldar yakhchaldar = dataModelYakhchaldars.get(i);
        viewHolderYakhchaldar.tv_kala.setText(yakhchaldar.getKala());
        viewHolderYakhchaldar.tv_maghsad.setText(yakhchaldar.getMaghsad());
        viewHolderYakhchaldar.tv_mabdaa.setText(yakhchaldar.getMabdaa());
        viewHolderYakhchaldar.tv_bargirfa.setText(yakhchaldar.getBargirfa());
        viewHolderYakhchaldar.tv_daily.setText(yakhchaldar.getDaily());

    }

    @Override
    public int getItemCount() {
        return dataModelYakhchaldars.size();
    }

    public class viewHolderYakhchaldar extends RecyclerView.ViewHolder {
        TextView tv_mabdaa, tv_maghsad, tv_kala, tv_bargirfa, tv_daily;
        RelativeLayout relItemLauoyt;
        public viewHolderYakhchaldar(@NonNull View itemView) {
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
