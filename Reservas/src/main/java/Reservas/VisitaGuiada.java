package Reservas;

public class VisitaGuiada implements PaseoTuristico {
    public String getTipoPaseo() {
        return "Visita Guiada";
    }

    public String getDuracion() {
        return "3 horas";
    }

    public boolean checkDisponibilidad() {
        return true;
    }

    public void bloquear() { }

    public void desbloquear() { }
}