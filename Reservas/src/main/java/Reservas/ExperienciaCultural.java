package Reservas;

public class ExperienciaCultural implements PaseoTuristico {
    public String getTipoPaseo() {
        return "Experiencia Cultural";
    }

    public String getDuracion() {
        return "2 horas";
    }

    public boolean checkDisponibilidad() {
        return true;
    }

    public void bloquear() { }

    public void desbloquear() { }
}