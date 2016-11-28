package com.example.administrador.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Lista_Empleados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista__empleados);

        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Empleado 1","Apellido 1",R.mipmap.ic_launcher));
        empleados.add(new Empleado("Empleado 2","Apellido 1",R.mipmap.ic_launcher));
        empleados.add(new Empleado("Empleado 3","Apellido 1",R.mipmap.ic_launcher));
        empleados.add(new Empleado("Empleado 4","Apellido 1",R.mipmap.ic_launcher));
        empleados.add(new Empleado("Empleado 5","Apellido 1",R.mipmap.ic_launcher));

        ListView listaEmpleados = (ListView) findViewById(R.id.listEmpleados);
        final TextView texto = (TextView) findViewById(R.id.textView40);

        Button botonAñadir = (Button) findViewById(R.id.botonLista);

        final AdapterList adapter = new AdapterList(this,empleados);
        listaEmpleados.setAdapter(adapter);

        listaEmpleados.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Empleado empleado = (Empleado) parent.getAdapter().getItem(position);
                texto.setText(empleado.getNombre());
            }
        });

        botonAñadir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Empleado empleado = new Empleado("Empleado ADD","Apellido ADD", R.mipmap.ic_launcher);
                adapter.addItem(empleado);
            }
        });
    }
}
