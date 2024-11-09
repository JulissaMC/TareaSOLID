package Reservas;

public class PaqueteHotelYTour implements PaqueteTuristico {
    private final Habitacion habitacion;
    private final PaseoTuristico paseo;

    public PaqueteHotelYTour(Habitacion habitacion, PaseoTuristico paseo) {
        this.habitacion = habitacion;
        this.paseo = paseo;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public PaseoTuristico getPaseos() {
        return paseo;
    }

    public String getServiciosAdicionales() {
        return "Traslado y cena tematica";
    }
}