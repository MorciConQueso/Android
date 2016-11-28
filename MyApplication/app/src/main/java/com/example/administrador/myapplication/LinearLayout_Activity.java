package com.example.administrador.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LinearLayout_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout_);

        TextView conectar = (TextView) findViewById(R.id.textView10);
        conectar.setText(R.string.conectar);

        EditText correo = (EditText) findViewById(R.id.editText8);
        EditText pass = (EditText) findViewById(R.id.editText7);

        Button button = (Button) findViewById(R.id.button3);
        button.setText(R.string.iniciar_sesion);

        TextView olvido = (TextView) findViewById(R.id.textView11);
        olvido.setText(R.string.olvido_pass);
    }
}
