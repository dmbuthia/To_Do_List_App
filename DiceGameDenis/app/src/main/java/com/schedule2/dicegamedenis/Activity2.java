package com.schedule2.dicegamedenis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class Activity2 extends AppCompatActivity {

    public static final Random RANDOM = new Random();
    private Button rollDices;
    private ImageView imageView1, imageView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     /*   setContentView(R.layout.activity_2);
        rollDices = (Button) findViewById(R.id.rollDices);
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);

        rollDices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value1 = randomDiceValue();
                int value2 = randomDiceValue();

                int res1 = getResources().getIdentifier("dice_" + value1, "drawable", "com.schedule2.dicegamedenis");
                int res2 = getResources().getIdentifier("dice_" + value2, "drawable", "com.schedule2.dicegamedenis");

                imageView1.setImageResource(res1);
                imageView2.setImageResource(res2);
            }
        });

        */

    }

    /*
    private int randomDiceValue() {
        return RANDOM.nextInt(6) + 1;
    }*/
}