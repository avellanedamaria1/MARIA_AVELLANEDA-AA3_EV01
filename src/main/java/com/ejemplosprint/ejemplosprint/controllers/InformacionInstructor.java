package com.ejemplosprint.ejemplosprint.controllers;
import java.time.LocalDateTime;

public class InformacionInstructor {

    private LocalDateTime FechaHoy;
    private String Nombre;
    private String apellido;
    private String ficha;
    
    public InformacionInstructor(LocalDateTime fechaHoy, String nombre, String apellido, String ficha) {
        FechaHoy = fechaHoy;
        Nombre = nombre;
        this.apellido = apellido;
        this.ficha = ficha;
    }

    public InformacionInstructor() {
    }

    public LocalDateTime getFechaHoy() {
        return FechaHoy;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFicha() {
        return ficha;
    }

    public void setFechaHoy(LocalDateTime fechaHoy) {
        FechaHoy = fechaHoy;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFicha(String ficha) {
        this.ficha = ficha;
    } 




}
