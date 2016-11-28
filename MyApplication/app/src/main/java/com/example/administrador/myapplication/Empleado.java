package com.example.administrador.myapplication;

/**
 * Created by Administrador on 22/11/2016.
 */

public class Empleado {
    String nombre;
    String apellido;
    int drawableId;

    public Empleado(String nombre, String apellido, int drawableId) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.drawableId = drawableId;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDrawableId() {
        return drawableId;
    }
}
