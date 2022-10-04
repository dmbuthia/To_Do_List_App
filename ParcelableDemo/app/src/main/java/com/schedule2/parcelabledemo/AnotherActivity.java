package com.schedule2.parcelabledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Arrays;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        giftToSend gift = (giftToSend) getIntent().getParcelableExtra("birthdaygift");
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(
                gift.senderName + "/n"
                + gift.subject + "/n"
                + gift.wishes + "/n"
                + Arrays.toString(gift.message) + "/n"

        );


    }
}