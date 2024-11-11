public class PoliticasReserva{
    private String politicas;

    public void configurarPolitica(String nuevaPolitica){
        this.politicas = nuevaPolitica;
        System.out.println("Política configurada a: "+politicas);
    }

    public String obtenerPolitica(){
        System.out.println("La política actual es: "+politicas);
        return politicas;
    }
}
