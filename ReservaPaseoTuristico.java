public class ReservaPaseoTuristico extends Reserva{
    private PaseoTuristico paseoTuristico;

    public ReservaPaseoTuristico(String idReserva, Calendar fechaInicio, Calendar fechaFin, PaseoTuristico paseoTuristico){
        super(idReserva, fechaInicio, fechaFin);
        this.paseoTuristico = paseoTuristico;
    }

    public void especificarPaseoTuristico(){
        System.out.println("Reserva de paseo turístico especificada: "+paseoTuristico.obtenerEstado());
    }
}
