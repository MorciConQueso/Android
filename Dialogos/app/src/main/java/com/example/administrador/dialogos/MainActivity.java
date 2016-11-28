package com.example.administrador.dialogos;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button alerta = (Button) findViewById(R.id.alerta);
        alerta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Esto es un dialogo de alerta")
                        .setTitle("ALERTA")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.dismiss();
                            }
                        });
                builder.create().show();
            }
        });

        Button confirmacion = (Button) findViewById(R.id.confirmacion);
        confirmacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("¿Confirma o no?")
                        .setTitle("CONFIRMACIÓN")
                        .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                Log.d("Dialogos","Confirmacion aceptada");
                                dialog.dismiss();
                            }
                        })
                        .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                Log.d("Dialogos","Confirmacion cancelada");
                                dialog.dismiss();
                            }
                        });
                builder.create().show();
            }
        });

        final String[] items = {"Español", "Inglés", "Swajili"};
        Button seleccion = (Button) findViewById(R.id.seleccion);
        seleccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("SELECCIÓN")
                        .setItems(items, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int posicion) {
                                Log.d("Dialogos","Opcion seleccionada "+ items[posicion]);
                            }
                        });
                builder.create().show();
            }
        });

        final int posicionGuardada = -1;
        Button radiobutton = (Button) findViewById(R.id.radiobutton);
        radiobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("RADIOBUTTON")
                        .setSingleChoiceItems(items, posicionGuardada, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int posicion) {
                                Log.d("Dialgoos","Seleccionado "+items[posicion]);
                                //posicionGuardada = posicion;
                            }
                        });
                builder.create().show();
            }
        });


        final boolean[] answers = {false,false,false};
        Button checkbox = (Button) findViewById(R.id.checkbox);
        checkbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("CHECKBOX")
                        .setMultiChoiceItems(items, answers, new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int position, boolean state) {
                                answers[position] = state;
                                Log.d("Dialogos","posicion "+items[position]);
                            }
                        });
                builder.create().show();
            }
        });

        Button personalizado = (Button) findViewById(R.id.personalizado);
        personalizado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                LayoutInflater inflater = getLayoutInflater();
                View layoutDialog = inflater.inflate(R.layout.dialog_custom,null);
                TextView text = (TextView) layoutDialog.findViewById(R.id.texto1);

                builder.setView(layoutDialog)
                        .setTitle("PERSONALIZADO")
                        .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        });
                builder.create().show();
            }
        });

        Button toast = (Button) findViewById(R.id.toast);
        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Hola esto es un TOAST",Toast.LENGTH_LONG).show();
            }
        });

    }
}
