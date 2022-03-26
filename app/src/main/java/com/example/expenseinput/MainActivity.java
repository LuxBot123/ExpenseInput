package com.example.expenseinput;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText ev1,ev2, ev3,ev4,ev5,ev6,ev7,ev8,ev9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ev1 = (EditText) findViewById(R.id.ev1);
        ev2 = (EditText) findViewById(R.id.ev2);
        ev3=(EditText) findViewById(R.id.ev3);
        ev4 = (EditText) findViewById(R.id.ev4);
        ev5 = (EditText) findViewById(R.id.ev5);
        ev6=(EditText) findViewById(R.id.ev6);
        ev7 = (EditText) findViewById(R.id.ev7);
        ev8=(EditText) findViewById(R.id.ev8);
        ev9=(EditText) findViewById(R.id.ev9);
    }

    public void ComputeExpenses(View view) {
        float g1,g2,g3,g4,g5,g6,g7,g8,g9;
        g1 = Float.parseFloat(ev1.getText().toString());
        g2 = Float.parseFloat(ev2.getText().toString());
        g3 = Float.parseFloat(ev3.getText().toString());
        g4 = Float.parseFloat(ev4.getText().toString());
        g5 = Float.parseFloat(ev5.getText().toString());
        g6 = Float.parseFloat(ev6.getText().toString());
        g7 = Float.parseFloat(ev7.getText().toString());
        g8 = Float.parseFloat(ev8.getText().toString());
        g9 = Float.parseFloat(ev9.getText().toString());
        Intent n = new Intent(this, com.example.expenseinput.ResultsExpense.class);
        n.putExtra("1",g1);
        n.putExtra("2",g2);
        n.putExtra("3",g3);
        n.putExtra("4",g4);
        n.putExtra("5",g5);
        n.putExtra("6",g6);
        n.putExtra("7",g7);
        n.putExtra("8",g8);
        n.putExtra("9",g9);

        startActivity(n);
    }
}