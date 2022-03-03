package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

//Muzafarov Maxim//

public class MainActivity extends AppCompatActivity {
    private EditText num1, num2, num3;
    private TextView view1;
    private Button btn, btn2, btnTask2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        num1 = (EditText) findViewById(R.id.editTextNumber);
        num2 = (EditText) findViewById(R.id.editTextNumber2);
        num3 = (EditText) findViewById(R.id.editTextNumber3);
        view1 = (TextView) findViewById(R.id.textViewResult);
        btn = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        btnTask2 = findViewById(R.id.buttonTask2);
        btn.setOnClickListener(
                new View.OnClickListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onClick(View view) {
                        int length = Integer.parseInt(num1.getText().toString());
                        int width = Integer.parseInt(num2.getText().toString());
                        int height = Integer.parseInt(num3.getText().toString());
                        Cuboid cub = new Cuboid(length, width, height);
                        view1.setText(Double.toString(cub.getSurfaceArea()));
                    }
                }
        );
        btn2.setOnClickListener(
                new View.OnClickListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onClick(View view) {
                        int length = Integer.parseInt(num1.getText().toString());
                        int width = Integer.parseInt(num2.getText().toString());
                        int height = Integer.parseInt(num3.getText().toString());
                        Cuboid cub = new Cuboid(length, width, height);
                        view1.setText(Double.toString(cub.getVolume()));
                    }
                }
        );
        btnTask2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.myapplication.SecondActivity");
                startActivity(intent);
            }
        });


    }
}