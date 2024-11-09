package Reservas;

public interface TravelStayFactory {
    Habitacion createHabitacion();
    PaseoTuristico createPaseoTuristico();
    PaqueteTuristico createPaqueteTuristico();
}
