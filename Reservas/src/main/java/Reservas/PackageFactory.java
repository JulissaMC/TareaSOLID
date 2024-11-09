package Reservas;

public class PackageFactory implements TravelStayFactory {
    public Habitacion createHabitacion() {
        return new HabitacionSuite();
    }
    
    public PaseoTuristico createPaseoTuristico() {
        return new ExcursionAventura();
    }
    
    public PaqueteTuristico createPaqueteTuristico() {
        return new PaqueteHotelYTour(createHabitacion(), createPaseoTuristico());
    }
}