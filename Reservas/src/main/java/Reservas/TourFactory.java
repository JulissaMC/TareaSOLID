package Reservas;

public class TourFactory implements TravelStayFactory {
    public Habitacion createHabitacion() {
        return null; 
    }
    
    public PaseoTuristico createPaseoTuristico() {
        return new VisitaGuiada();
    }
    
    public PaqueteTuristico createPaqueteTuristico() {
        return null; 
    }
}