package com.example.administrador.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EditText_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text_);

        final EditText editTextNormal = (EditText) findViewById(R.id.editText);
        final EditText editTextPass = (EditText) findViewById(R.id.editText2);
        final EditText editTextPhone = (EditText) findViewById(R.id.editText3);
        final TextView textView = (TextView) findViewById(R.id.textView3);
        Button button = (Button) findViewById(R.id.button2);

        editTextNormal.setText("Pepe");
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String cadena = "";
                cadena += editTextNormal.getText().toString()+ " ";
                cadena += editTextPass.getText().toString()+ " ";
                cadena += editTextPhone.getText().toString()+ " ";

                textView.setText(cadena);
            }
        });
    }
}
