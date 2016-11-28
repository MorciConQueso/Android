package com.example.administrador.formula1;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrador on 23/11/2016.
 */

public class Lista_Pilotos extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Piloto> pilotos = new ArrayList<>();
        //pilotos.add(new Piloto());

        ListView listaEmpleados = (ListView) findViewById(R.id.listView);
        final TextView nombre = (TextView) findViewById(R.id.nombre);
        final TextView posicion = (TextView) findViewById(R.id.posicion);

        final Adapter_List adapter = new Adapter_List(this, pilotos);
        listaEmpleados.setAdapter(adapter);

        listaEmpleados.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Piloto piloto = (Piloto) parent.getAdapter().getItem(position);
                nombre.setText(piloto.getNombre());
                posicion.setText(piloto.getPosicion());
            }
        });

    }


}
