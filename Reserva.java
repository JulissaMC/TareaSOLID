import java.util.Calendar;

public class Reserva{
    private String idReserva;
    private Calendar fechaInicio;
    private Calendar fechaFin;

    public Reserva(String idReserva, Calendar fechaInicio, Calendar fechaFin) {
        this.idReserva = idReserva;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public void cancelarReserva(){
        System.out.println("Reserva cancelada con ID: "+idReserva);
    }

    public void crearReserva() {
        System.out.println("Reserva creada con ID: " + idReserva + 
                           ", Fecha de inicio: " + fechaInicio.getTime() + 
                           ", Fecha de fin: " + fechaFin.getTime());
    }
    
    
}
