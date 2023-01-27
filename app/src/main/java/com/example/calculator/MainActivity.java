package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private TextView matn = findViewById(R.id.operand);
    private TextView result = findViewById(R.id.result);
    private Button two = findViewById(R.id.two);
    private Button one = findViewById(R.id.one);
    private Button three = findViewById(R.id.three);
    private Button four = findViewById(R.id.four);
    private Button five = findViewById(R.id.five);
    private Button six = findViewById(R.id.six);
    private Button seven = findViewById(R.id.seven);
    private Button eight = findViewById(R.id.eight);
    private Button nine = findViewById(R.id.nine);
    private Button zero = findViewById(R.id.zero);
    private Button point = findViewById(R.id.point);
    private Button equal = findViewById(R.id.equal);
    private Button division = findViewById(R.id.divison);
    private Button multiplying = findViewById(R.id.multiplying);
    private Button minus = findViewById(R.id.minus);
    private Button plus = findViewById(R.id.plus);
    private Button clear_all = findViewById(R.id.clear_all );
    private Button delete_last = findViewById(R.id.delete_last );
    private Button degree = findViewById(R.id.degree );
    private Button percent = findViewById(R.id.percent );






    @SuppressLint("SetTextI18n")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}