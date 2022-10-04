package com.schedule2.gridviewdemoapp;

import android.content.Context;
import android.graphics.drawable.Icon;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class myAdapter extends BaseAdapter {

    private final int icons[];
    private final String captions[];
    Context context;

    public myAdapter(int[] icons, String[] captions, Context context) {
        this.icons = icons;
        this.captions = captions;
        this.context = context;
    }


    @Override
    public int getCount() {
        return captions.length;
    }

    @Override
    public Object getItem(int position) {
        return captions.length;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view1 = inflater.inflate(R.layout.singleitem, null);
        ImageView img = (ImageView) view1.findViewById(R.id.img1);
        TextView tv = (TextView) view.findViewById(R.id.tv1);
        img.setImageResource(icons[position]);
        tv.setText(captions[position]);

        return view1;
    }
}
