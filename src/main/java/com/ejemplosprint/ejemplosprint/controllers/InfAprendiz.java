package com.ejemplosprint.ejemplosprint.controllers;
import java.time.LocalDateTime;

public class InfAprendiz {
    private LocalDateTime FechaHoy;
    private String Nombre;
    private String Apellido;
    private String Cedula;
    private String Usuario;
    
    public InfAprendiz(LocalDateTime fechaHoy, String nombre, String apellido, String cedula, String usuario) {
        FechaHoy = fechaHoy;
        Nombre = nombre;
        Apellido = apellido;
        Cedula = cedula;
        Usuario = usuario;
    }

    public InfAprendiz() {
    }

    public LocalDateTime getFechaHoy() {
        return FechaHoy;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setFechaHoy(LocalDateTime fechaHoy) {
        FechaHoy = fechaHoy;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }
    
    
}
