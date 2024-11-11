public class Habitacion implements IGestionEstado{
    private String idHabitacion;
    private String estado;

    public Habitacion(String idHabitacion, String estado){
        this.idHabitacion = idHabitacion;
        this.estado = estado;
    }

    @Override
    public void cambiarEstado(String nuevoEstado){
        this.estado = nuevoEstado;
        System.out.println("El estado de la habitación "+idHabitacion+" ha sido cambiado a: "+estado);
    }

    @Override
    public String obtenerEstado(){
        System.out.println("El estado actual de la habitación "+idHabitacion+" es: "+estado);
        return estado;
    }
}
