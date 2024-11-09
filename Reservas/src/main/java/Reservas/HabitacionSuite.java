package Reservas;

public class HabitacionSuite implements Habitacion {
    public String getTipoHabitacion() {
        return "Suite";
    }

    public String getServiciosAdicionales() {
        return "Acceso a áreas exclusivas";
    }

    public boolean checkDisponibilidad() {
        return true;
    }

    public void bloquear() { }

    public void desbloquear() { }
}
