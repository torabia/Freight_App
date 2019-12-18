package com.example.freightapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.freightapp.DataModels.DataModel_GridView;
import com.example.freightapp.R;

import java.security.PrivateKey;
import java.util.ArrayList;

public class gridViewAdapter extends BaseAdapter {
    private LayoutInflater layoutInflater;
        private Context context ;
        private ArrayList<DataModel_GridView> dataModel_gridViews ;
        private ImageView imageItem ;
        private TextView textView ;
    public gridViewAdapter(Context context, int[] myImageList){
            context = context;
        }
        @Override
        public int getCount() {
            return dataModel_gridViews.size();
        }

        @Override
        public Object getItem(int position) {
            return dataModel_gridViews.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View itemView = layoutInflater.inflate(R.layout.item_grid_view_it , parent ,false );
            textView = (TextView) itemView.findViewById(R.id.title_item);
            imageItem = (ImageView) itemView.findViewById(R.id.image_item);

            imageItem.setImageResource(dataModel_gridViews.get(position).getImage_drawable());
            textView.setText(dataModel_gridViews.get(position).getName());
            return itemView;
    }
}
