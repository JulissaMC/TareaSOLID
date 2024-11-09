package Reservas;

public interface Habitacion {
    String getTipoHabitacion();
    String getServiciosAdicionales();
    boolean checkDisponibilidad();
    void bloquear();
    void desbloquear();
}
