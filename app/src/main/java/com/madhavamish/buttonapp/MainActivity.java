package com.madhavamish.buttonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button1;
    TextView label;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        label = findViewById(R.id.num_field);

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("button pressed!");
                count++;
                label.setText("" + count);
                v.setBackgroundColor(Color.rgb(count%256, count%256, count%256));
            }
        });

    }

    public void increment(View view) {
        System.out.println("button pressed!");
        count++;
        label.setText("" + count);
        view.setBackgroundColor(Color.rgb(count%256, count%256, count%256));
    }
}

