package com.example.freightapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.freightapp.R;

public class GridViewAdapter extends BaseAdapter {
    Context context;
    private final String[] values;
    View view;
    LayoutInflater layoutInflater;

    public GridViewAdapter(Context context, String[] values) {
        this.context = context;
        this.values = values;
    }

    @Override
    public int getCount() {
        return values.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null){
            view = new View(context);
            view =layoutInflater.inflate(R.layout.single_item , null);
            TextView textView = (TextView) view.findViewById(R.id.txt_title);
            textView.setText(values[position]);

        }
        return  view;
    }
}
