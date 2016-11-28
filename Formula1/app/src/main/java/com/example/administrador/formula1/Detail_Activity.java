package com.example.administrador.formula1;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Detail_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_);
        Piloto piloto = (Piloto) getIntent().getSerializableExtra("Piloto");

        ImageView imagen = (ImageView) findViewById(R.id.bandera);
        TextView nombre = (TextView) findViewById(R.id.nombre);
        TextView posicion = (TextView) findViewById(R.id.posicion);
        TextView nacimiento = (TextView) findViewById(R.id.nacimiento);
        TextView nacionalidad = (TextView) findViewById(R.id.nacionalidad);
        TextView puntos = (TextView) findViewById(R.id.puntos);
        TextView victorias = (TextView) findViewById(R.id.victorias);

        nombre.setText(piloto.getNombre());
        posicion.setText(Integer.toString(piloto.getPosicion()));
        imagen.setImageResource(piloto.getDrawableId());
        nacimiento.setText(piloto.getFecha_nac());
        nacionalidad.setText(piloto.getNacionalidad());
        puntos.setText(Integer.toString(piloto.getPuntos()));
        victorias.setText(Integer.toString(piloto.getVictorias()));
    }

}
