public class Principal {
    public static void main(String[] args){
        //Mas de dos objetos
        Entrada entrada1 = new Entrada("Obra de teatro",560.00 );
        Entrada entrada2 = new Entrada("Concierto",430.00);
        Entrada entrada3 = new Entrada("Cine",150.00);
        Entrada entrada4 = new Entrada("Convención", 280.00);
        Entrada entrada5 = new Entrada("Festival", 90.00);

//Llama al metodo mostrarInformacion() para mostrar los datos en consola
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();
        entrada3.mostrarInformacion();
        entrada4.mostrarInformacion();
        entrada5.mostrarInformacion();

    }
}