/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reportes;

/**
 *
 * @author Pc
 */
public class Operador_turístico extends Usuario{
    
    public Operador_turístico(String nombre) {
        super(nombre);
    }
    
      // Método para manejar un incidente
    public void manejarIncidente(reporte_incidente incidente) {
        System.out.println(nombre + " está manejando el incidente: " + incidente.getDescripcion());
        incidente.setEstado("en proceso por operador");
    }

    // Método para actualizar el estado de un incidente
    public void actualizarIncidente(reporte_incidente incidente, String nuevoEstado) {
        System.out.println(nombre + " actualiza el incidente a: " + nuevoEstado);
        incidente.setEstado(nuevoEstado);
    }
    
}
