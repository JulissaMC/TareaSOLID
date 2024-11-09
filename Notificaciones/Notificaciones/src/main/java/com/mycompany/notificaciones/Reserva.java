/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notificaciones;

/**
 *
 * @author Ayman El Salous Mnz
 */
public class Reserva {
    private String idReserva;
    private String estado;
    private Cliente cliente;
    private Itinerario itinerario;

    public Reserva(String idReserva, Cliente cliente, Itinerario itinerario) {
        this.idReserva = idReserva;
        this.estado = "Pendiente";
        this.cliente = cliente;
        this.itinerario = itinerario;
    }

    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        notificarCambio();
    }

    public void notificarCambio() {
        SistemaNotificaciones.getInstance().enviarNotificacion("Reserva actualizada a: " + estado, cliente);
    }

}
