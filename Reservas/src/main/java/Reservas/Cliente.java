package Reservas;

public class Cliente {
    private final ReservacionManager reservacionManager = new ReservacionManager();

    public void reservarHospedaje(TravelStayFactory factory) {
        Habitacion habitacion = factory.createHabitacion();
        PaseoTuristico paseo = factory.createPaseoTuristico();

        if (reservacionManager.verificarDisponibilidad(habitacion, paseo)) {
            reservacionManager.bloquear(habitacion, paseo);
            System.out.println("Reservación bloqueada temporalmente");

            // Aquí iría la lógica de confirmación de pago

            reservacionManager.desbloquear(habitacion, paseo);
            System.out.println("Reservación completada y bloqueos eliminados");
        } else {
            System.out.println("Disponibilidad insuficiente para la reserva solicitada.");
        }
    }
}