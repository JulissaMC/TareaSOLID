package Reservas;

public interface PaseoTuristico {
    String getTipoPaseo();
    String getDuracion();
    boolean checkDisponibilidad();
    void bloquear();
    void desbloquear();
}