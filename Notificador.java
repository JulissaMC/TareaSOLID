public class Notificador implements INotificador{

    @Override
    public void notificarCambioEstado(){
        System.out.println("Notificación: El estado ha cambiado.");
    }

    @Override
    public void notificarCambioPolitica(){
        System.out.println("Notificación: La política ha cambiado.");
    }
}
