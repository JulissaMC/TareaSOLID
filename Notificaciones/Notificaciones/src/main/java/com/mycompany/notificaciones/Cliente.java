/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notificaciones;

/**
 *
 * @author Ayman El Salous Mnz
 */
public class Cliente {
    private String idCliente;
    private String nombre;
    private String email;
    private String numero;

    public Cliente(String idCliente, String nombre, String email, String numero) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.email = email;
        this.numero = numero;
    }

    public void recibirNotificacion(String mensaje) {
        System.out.println("Notificación recibida por " + nombre + ": " + mensaje);
    }

    // Getters y Setters
    public String getEmail() { return email; }
    public String getNumero() { return numero; }
}
