package com.example.program2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox f1, f2, f3;
    Button submit, reset;
    TextView tv;
    int price = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        f1 = findViewById(R.id.f1);
        f2 = findViewById(R.id.f2);
        f3 = findViewById(R.id.f3);
        tv = findViewById(R.id.tv);
        submit = findViewById(R.id.submit);
        reset = findViewById(R.id.reset);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (f1.isChecked()) {
                        price = price + 40;
                    }
                    if (f2.isChecked()) {
                        price = price + 50;
                    }
                    if (f3.isChecked()) {
                        price = price + 10;
                    }
                    tv.setText(Integer.toString(price) );
                    price= 0;
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, e.getMessage() , Toast.LENGTH_SHORT).show();
                }


            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                tv.setText(null);
                }catch ( Exception e ){
                    Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}