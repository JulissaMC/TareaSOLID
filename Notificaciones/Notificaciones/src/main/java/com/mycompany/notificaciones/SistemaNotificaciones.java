/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notificaciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ayman El Salous Mnz
 */


public class SistemaNotificaciones {
    private static SistemaNotificaciones instance;
    private List<CanalNotificacion> canalesNotificacion;

    private SistemaNotificaciones() {
        this.canalesNotificacion = new ArrayList<>();
    }

    public static SistemaNotificaciones getInstance() {
        if (instance == null) {
            instance = new SistemaNotificaciones();
        }
        return instance;
    }
}
