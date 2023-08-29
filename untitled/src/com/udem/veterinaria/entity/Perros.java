package com.udem.veterinaria.entity;

import com.udem.veterinaria.abstrac.Caninos;

public class Perros extends Caninos {
    private String id;
    private String nombre;
    private int edad;
    private String nomDueno;

    public Perros(String id, String nombre, int edad, String nomDueno) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.nomDueno = nomDueno;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNomDueno() {
        return nomDueno;
    }

    public void setNomDueno(String nomDueno) {
        this.nomDueno = nomDueno;
    }

    @Override
    public void mover() {

    }
}
