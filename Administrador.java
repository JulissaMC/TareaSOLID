public class Administrador {
    private String idAdministrador;
    private String nombre;

    public Administrador(String idAdministrador, String nombre){
        this.idAdministrador = idAdministrador;
        this.nombre = nombre;
    }

    public void gestionarPolitica(){
        System.out.println("Gestionando políticas de reservas y cancelaciones.");
    }

    public void gestionarEstado(){
        System.out.println("Gestionando estado de habitaciones y paseos turísticos.");
    }

    public void gestionarInventario(){
        System.out.println("Ajustando inventario de paseos turísticos.");
    }
}
