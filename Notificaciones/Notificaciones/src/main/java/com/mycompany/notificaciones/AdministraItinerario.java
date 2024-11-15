/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notificaciones;

/**
 *
 * @author Ayman El Salous Mnz
 */
public class AdministraItinerario {
    private String idAdministraIt;
    public void gestionarItinerario(Itinerario itinerario, String nuevoDetalle) {
        itinerario.actualizarItinerario(nuevoDetalle);
        System.out.println("Itinerario actualizado con nuevo detalle: " + nuevoDetalle);
    }
}
