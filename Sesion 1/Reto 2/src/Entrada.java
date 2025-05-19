public class Entrada {
    //Atributos
    String Nombre;
    double Precio;

    //Constructor

    public Entrada(String Nombre, double Precio){
        this.Nombre = Nombre;
        this.Precio = Precio;
    }
    //Metodo
    public void mostrarInformacion(){
        System.out.println("Event: " + Nombre);
        System.out.println("Precio: $" + Precio);

    }
}
