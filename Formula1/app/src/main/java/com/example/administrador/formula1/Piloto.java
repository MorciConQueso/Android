package com.example.administrador.formula1;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrador on 23/11/2016.
 */

public class Piloto implements Serializable {
    private static final long serialVersionUID = -4276132820020651327L;
    String nombre;
    int drawableId;
    String fecha_nac;
    String nacionalidad;
    int puntos;
    int posicion;
    int victorias;


    public Piloto(int posicion, String nombre, int drawableId){
        this.posicion = posicion;
        this.nombre = nombre;
        this.drawableId = drawableId;

    }

    public Piloto(String nombre, int drawableId, String fecha_nac, String nacionalidad, int puntos, int posicion, int victorias) {
        this.nombre = nombre;
        this.drawableId = drawableId;
        this.fecha_nac = fecha_nac;
        this.nacionalidad = nacionalidad;
        this.puntos = puntos;
        this.posicion = posicion;
        this.victorias = victorias;

    }

    public String getNombre() {
        return nombre;
    }

    public int getDrawableId() {
        return drawableId;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getPosicion() {

        return posicion;
    }

    public int getVictorias() {
        return victorias;
    }
}
