public class entrada {
    String evento;
    double preciio;

    //Constructor
    public entrada(String evento, double precio){
        this.evento = evento;
        this.preciio = precio;
    }
    //Método para mostrar los datos de la entrada
    public  void mostrarInformación(){
        System.out.println("Evento: " + evento + "| Precio: $" + preciio);
    }
}
