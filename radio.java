package com.example.coursesel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg = findViewById(R.id.rg);
        b = findViewById(R.id.sel);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = rg.getCheckedRadioButtonId();
                if(id==-1)
                    Toast.makeText(MainActivity.this, "No Course Selected", Toast.LENGTH_SHORT).show();
                else{
                    RadioButton r = findViewById(id);
                    Toast.makeText(MainActivity.this, r.getText().toString()+" Selected", Toast.LENGTH_SHORT).show();
                }
            }
        });

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i!=-1) {
                    RadioButton r = findViewById(i);
                    Toast.makeText(MainActivity.this, r.getText().toString()+" Selected", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}