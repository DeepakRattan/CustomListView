package com.example.deepakrattan.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Deepak Rattan on 28-Dec-16.
 */

public class MyAdapter extends BaseAdapter {
    private Context context;
    private List<SingleRow> singleRowList;
    private LayoutInflater inflater;

    public MyAdapter(Context context, List<SingleRow> singleRowList) {
        this.context = context;
        this.singleRowList = singleRowList;
    }

    @Override
    public int getCount() {
        return singleRowList.size();
    }

    @Override
    public Object getItem(int position) {
        return singleRowList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.single_row, parent, false);

        //Getting views of single row
        TextView txtNAme = (TextView) convertView.findViewById(R.id.txtName);
        TextView txtDesc = (TextView) convertView.findViewById(R.id.txtDesc);
        ImageView img = (ImageView) convertView.findViewById(R.id.img);

        SingleRow singleRow = singleRowList.get(position);

        //Setting values in views
        txtNAme.setText(singleRow.name);
        txtDesc.setText(singleRow.desc);
        img.setImageResource(singleRow.image);


        return convertView;
    }
}
