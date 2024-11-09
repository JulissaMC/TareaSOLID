package Reservas;

public class HabitacionFamiliar implements Habitacion {
    public String getTipoHabitacion() {
        return "Familiar";
    }

    public String getServiciosAdicionales() {
        return "Espacio adicional";
    }

    public boolean checkDisponibilidad() {
        return true;
    }

    public void bloquear() { }

    public void desbloquear() { }
}