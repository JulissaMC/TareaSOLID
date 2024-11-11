public class ReservaHabitacion extends Reserva{
    private Habitacion habitacion;

    public ReservaHabitacion(String idReserva, Calendar fechaInicio, Calendar fechaFin, Habitacion habitacion){
        super(idReserva, fechaInicio, fechaFin);
        this.habitacion = habitacion;
    }

    public void especificarHabitacion(){
        System.out.println("Reserva de habitación especificada: " + habitacion.obtenerEstado());
    }
}
