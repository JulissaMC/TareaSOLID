/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notificaciones;

/**
 *
 * @author Ayman El Salous Mnz
 */
public class CorreoElectronico implements CanalNotificacion {
    @Override
    public void enviar(String mensaje, Cliente cliente) {
        System.out.println("Enviando email a " + cliente.getEmail() + " con mensaje: " + mensaje);
    }
}
