package com.schedule2.passingobjtoactivitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                giftToSend gift = new giftToSend("Naser", "Wishing you a great weekend!", "Enjoy your weekend to the Fullest!",
                        new String[]{ "Please do not forget to check previous lecture",
                                "Please prepare for the midterm!",
                                "Please watch some movies!!"
                               });

                intent.putExtra("giftbox",gift);
                startActivity(intent);


            }
        });
    }
}