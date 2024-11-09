package Reservas;

public class HabitacionEstandar implements Habitacion {
    public String getTipoHabitacion() {
        return "Estandar";
    }
    
    public String getServiciosAdicionales() {
        return "Desayuno incluido";
    }
    
    public boolean checkDisponibilidad() {

        return true;
    }
    
    public void bloquear() {

    }
    
    public void desbloquear() {

    }
}