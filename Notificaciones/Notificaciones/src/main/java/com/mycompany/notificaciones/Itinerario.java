/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notificaciones;

/**
 *
 * @author Ayman El Salous Mnz
 */
public class Itinerario {
    private String idItinerario;
    private String detalle;
    private String fecha;

    public Itinerario(String idItinerario, String detalle, String fecha) {
        this.idItinerario = idItinerario;
        this.detalle = detalle;
        this.fecha = fecha;
    }

    public void actualizarItinerario(String nuevoDetalle) {
        this.detalle = nuevoDetalle;
    }
}
