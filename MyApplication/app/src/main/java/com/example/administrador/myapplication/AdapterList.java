package com.example.administrador.myapplication;

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
 * Created by Administrador on 22/11/2016.
 */

public class AdapterList extends ArrayAdapter<Empleado> {

    private final List<Empleado> empleados;
    private Activity context;

    public AdapterList(Activity context, List<Empleado> empleados) {
        super(context, R.layout.item_list,empleados);
        this.context = context;
        this.empleados = empleados;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View view = inflater.inflate(R.layout.item_list,null);

        Empleado item = empleados.get(position);

        ImageView imagen = (ImageView) view.findViewById(R.id.foto);
        TextView nombre = (TextView) view.findViewById(R.id.nombre);
        TextView apellido = (TextView) view.findViewById(R.id.apellido);

        nombre.setText(item.getNombre());
        apellido.setText(item.getApellido());
        imagen.setImageResource(item.getDrawableId());

        return view;
    }

    public void addItem(Empleado empleado) {
        empleados.add(empleado);
        notifyDataSetChanged();
    }
}
