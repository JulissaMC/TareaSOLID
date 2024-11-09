package Reservas;

public class HotelFactory implements TravelStayFactory {
    public Habitacion createHabitacion() {
        return new HabitacionEstandar();
    }
    
    public PaseoTuristico createPaseoTuristico() {
        return null; 
    }
    
    public PaqueteTuristico createPaqueteTuristico() {
        return null; 
    }
}