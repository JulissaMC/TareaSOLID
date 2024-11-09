package Reservas;

public class ExcursionAventura implements PaseoTuristico {
    public String getTipoPaseo() {
        return "Excursion de Aventura";
    }

    public String getDuracion() {
        return "5 horas";
    }

    public boolean checkDisponibilidad() {
        return true;
    }

    public void bloquear() { }

    public void desbloquear() { }
}
