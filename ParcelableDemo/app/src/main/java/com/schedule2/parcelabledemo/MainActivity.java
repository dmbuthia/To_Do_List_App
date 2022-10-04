package com.schedule2.parcelabledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
            giftToSend gift = new giftToSend("Denis", "Happy Birthday!", "May you live to blow 1001 candles!",
                  new String[]{
                          "Please remember to make a wish, that will eventually come true!"
                  }  );
            intent.putExtra("birthdaygift", gift);
            startActivity(intent);
        });
    }
}