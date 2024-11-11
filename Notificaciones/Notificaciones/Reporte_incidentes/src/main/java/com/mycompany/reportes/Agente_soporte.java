/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reportes;

/**
 *
 * @author Pc
 */
public class Agente_soporte extends Usuario{
    
    public Agente_soporte(String nombre) {
        super(nombre);
    }
    
    public void procesarIncidente(reporte_incidente incidente) {
        System.out.println(nombre + " está procesando el incidente: " + incidente.getDescripcion());
        incidente.setEstado("en proceso");
    }
    
    public void delegarIncidente(reporte_incidente incidente, Operador_turístico operador) {
        System.out.println(nombre + " está delegando el incidente: " + incidente.getDescripcion() + " al operador " + operador.nombre);
        operador.manejarIncidente(incidente);
    }
    
}
