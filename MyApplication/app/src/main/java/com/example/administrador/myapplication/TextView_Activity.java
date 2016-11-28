package com.example.administrador.myapplication;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TextView_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view_);

        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText("Texto en código");
        textView.setTextSize(20);
        textView.setTextColor(Color.parseColor("#0be53a"));
        //textView.setBackground(Color.parseColor("00b6ff"));
        textView.setTypeface(Typeface.DEFAULT_BOLD);


    }
}
