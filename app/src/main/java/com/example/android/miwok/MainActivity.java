package com.example.android.miwok;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView) findViewById(R.id.numbers);
        TextView family = (TextView) findViewById(R.id.family);
        TextView phrases = (TextView) findViewById(R.id.phrases);
        TextView colors = (TextView) findViewById(R.id.colors);

        numbers.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(getApplicationContext(), NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        family.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }
        });

        phrases.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });

        colors.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });
    }


}