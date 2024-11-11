public class PaseoTuristico implements IGestionEstado{
    private String idPaseo;
    private String estado;
    private int plazasDisponibles;

    public PaseoTuristico(String idPaseo, String estado, int plazasDisponibles){
        this.idPaseo = idPaseo;
        this.estado = estado;
        this.plazasDisponibles = plazasDisponibles;
    }

    @Override
    public void cambiarEstado(String nuevoEstado){
        this.estado = nuevoEstado;
        System.out.println("El estado del paseo turístico "+idPaseo+" ha sido cambiado a: " + estado);
    }

    @Override
    public String obtenerEstado(){
        System.out.println("El estado actual del paseo turístico "+idPaseo+" es: " + estado);
        return estado;
    }

    public boolean verificarDisponibilidad(){
        boolean disponible = plazasDisponibles > 0;
        System.out.println("Disponibilidad del paseo turístico "+idPaseo+": " + (disponible ? "Disponible" : "No disponible"));
        return disponible;
    }
}
