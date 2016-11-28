package com.example.administrador.formula1;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrador on 23/11/2016.
 */

public class Adapter_List extends ArrayAdapter<Piloto> {


    private final List<Piloto> pilotos;
    private Activity context;

    public Adapter_List(Activity context, List<Piloto> pilotos) {
        super(context, R.layout.item_list,pilotos);
        this.context = context;
        this.pilotos = pilotos;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View view = inflater.inflate(R.layout.item_list,null);

        Piloto item = pilotos.get(position);

        ImageView imagen = (ImageView) view.findViewById(R.id.bandera);
        TextView nombre = (TextView) view.findViewById(R.id.nombre);
        TextView posicion = (TextView) view.findViewById(R.id.posicion);

        nombre.setText(item.getNombre());
        posicion.setText(Integer.toString(item.getPosicion()));
        imagen.setImageResource(item.getDrawableId());

        return view;
    }

}
