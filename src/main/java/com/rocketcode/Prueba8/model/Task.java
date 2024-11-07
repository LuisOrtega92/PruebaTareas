package com.rocketcode.Prueba8.model;

import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

public class Task {
    private int id;
    private String nombre;
    private String descripcion;

    @DateTimeFormat(pattern = "yyyy-MM-dd")  // Especificamos el formato que esperamos para la fecha
    private String  fechaInicio;
    
    private Date fechaCreacion;
    private Date fechaActualizacion;

    // Getters y setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }
    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
}
