package com.schedule2.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class GridAdapter extends BaseAdapter {

    Context context;
    String[] titleName;
    int[] image;

    LayoutInflater inflater;

    public GridAdapter(Context context, String[] titleName, int[] image) {
        this.context = context;
        this.titleName = titleName;
        this.image = image;


    }

    @Override
    public int getCount() {
        return titleName.length;
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
    public View getView(int position, View view, ViewGroup viewGroup) {

        if (inflater == null)
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (view == null){

            view = inflater.inflate(R.layout.grid_design, null);
        }

        ImageView imageView = view.findViewById(R.id.grid_image);
        TextView textView = view.findViewById(R.id.item_name);

        imageView.setImageResource(image[position]);
        textView.setText(titleName[position]);

        return view;
    }
}
