package com.schedule2.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.schedule2.gridview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String[] titleName = {"HR", "CEO", "CFO", "SECRETARY", "ADMINISTRATOR", "PRESIDENT", "VICE PRESIDENT",
                "CTO", "HR MANAGER", "ICT MANAGER", "IT SPECIALIST", "DEVOPS MANAGER", "PAYROLL MANAGER", "INTERN",
                "ACCOUNTANT", "SECURITY"};
        int[] image = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f,
                R.drawable.g, R.drawable.h, R.drawable.i, R.drawable.j, R.drawable.k, R.drawable.l, R.drawable.m,
                R.drawable.n, R.drawable.o, R.drawable.p,};

        GridAdapter gridAdapter = new GridAdapter(MainActivity.this,titleName,image);
        binding.gridView.setAdapter(gridAdapter);

        binding.gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Toast.makeText(MainActivity.this, "You Clicked on" + titleName[position],Toast.LENGTH_SHORT).show();
            }
        });

    }
}

