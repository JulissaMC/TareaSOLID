/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reportes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pc
 */
public class GestorIncidentesSingleton {
    private static GestorIncidentesSingleton instancia;
    private List<reporte_incidente> incidentes;
    
     private GestorIncidentesSingleton() {
        incidentes = new ArrayList<>();
    }
    
    public static GestorIncidentesSingleton getInstancia() {
        if (instancia == null) {
            instancia = new GestorIncidentesSingleton();
        }
        return instancia;
    }
    public void registrarIncidente(String descripcion) {
        reporte_incidente nuevoIncidente = new reporte_incidente(descripcion);
        incidentes.add(nuevoIncidente);
        System.out.println("Incidente registrado: " + descripcion);
    }
}
