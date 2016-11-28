package com.example.administrador.sharedpreferences;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Ejercicio extends AppCompatActivity {
    LinearLayout layoutName;
    EditText editText;
    TextView textName;

    LinearLayout layoutPass;

    SharedPreferences prefenrences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio);

        layoutName = (LinearLayout) findViewById(R.id.layoutName);
        textName = (TextView) findViewById(R.id.textName);

        layoutPass = (LinearLayout) findViewById(R.id.layoutPass);

        prefenrences = getSharedPreferences("preferencias", Context.MODE_PRIVATE);

        layoutName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Ejercicio.this);
                LayoutInflater inflater = getLayoutInflater();
                View layoutDialog = inflater.inflate(R.layout.dialog_name,null);

                editText = (EditText) layoutDialog.findViewById(R.id.editName);
                builder.setView(layoutDialog)
                        .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        dialogInterface.dismiss();
                    }
                });
                builder.create().show();
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        String name = editText.getText().toString();
        SharedPreferences.Editor editor = prefenrences.edit();
        editor.putString("name",name);
        editor.commit();
    }

    @Override
    protected void onResume() {
        super.onResume();

        String name = prefenrences.getString("name","Inserta tu nombre");
        textName.setText(name);
    }
}
