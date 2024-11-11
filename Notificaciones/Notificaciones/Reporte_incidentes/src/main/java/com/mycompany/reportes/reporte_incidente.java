/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reportes;

/**
 *
 * @author Pc
 */
public class reporte_incidente {
    private String descripcion;
    private String estado;

    public reporte_incidente(String descripcion) {
        this.descripcion = descripcion;
        this.estado = "pendiente";
    }


    public String getDescripcion() {
        return descripcion;
    }


    public String getEstado() {
        return estado;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }
}
