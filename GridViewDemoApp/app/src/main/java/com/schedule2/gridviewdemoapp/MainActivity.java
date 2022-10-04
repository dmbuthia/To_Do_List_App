package com.schedule2.gridviewdemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gridview;
    int images[] =
            {
                    R.drawable.a,
                    R.drawable.b,
                    R.drawable.c,
                    R.drawable.d,
                    R.drawable.e,
                    R.drawable.f,
                    R.drawable.g,
                    R.drawable.h,
                    R.drawable.i
            };
    String text [] = {"HTML", "JAVA", "JSP", "PHP", "PYTHON", "SQL", "ANDROID", "ANGULAR", "C++"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridview = (GridView)findViewById(R.id.datagrid);

        myAdapter ma = new myAdapter(images, text, this);
        gridview.setAdapter(ma);

    }
}