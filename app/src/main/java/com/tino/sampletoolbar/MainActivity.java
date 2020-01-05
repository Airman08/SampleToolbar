package com.tino.sampletoolbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    Button button_intent1;
    FloatingActionButton button_intent2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_intent1 = findViewById(R.id.button_intent1);
        button_intent1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Intent1Activity.class);
                startActivity(intent);

            }
        });

        button_intent2 = findViewById(R.id.button_intent2);
        button_intent2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, Intent2Activity.class);
                startActivity(intent);
            }
        });
    }
}
