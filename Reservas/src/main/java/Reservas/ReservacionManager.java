package Reservas;

public class ReservacionManager {
    public boolean verificarDisponibilidad(Habitacion habitacion, PaseoTuristico paseo) {
        return habitacion.checkDisponibilidad() && paseo.checkDisponibilidad();
    }

    public void bloquear(Habitacion habitacion, PaseoTuristico paseo) {
        habitacion.bloquear();
        paseo.bloquear();
    }

    public void desbloquear(Habitacion habitacion, PaseoTuristico paseo) {
        habitacion.desbloquear();
        paseo.desbloquear();
    }
}