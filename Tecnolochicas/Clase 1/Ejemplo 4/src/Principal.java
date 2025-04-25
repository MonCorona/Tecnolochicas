public class Principal {
    public static void main(String[] args) {
        entrada entrada1 = new entrada("Concierto de Bedu", 800.00);
        entrada entrada2 = new entrada("Obra de Teatro de Bedu", 450.50);

        entrada1.mostrarInformación();
        entrada2.mostrarInformación();

        // Reto adicional con record
        Entrada_Recordo entrada3 = new Entrada_Recordo("Sinfónico de Bedu", 1200.00);
        entrada3.mostrarInformacion();
    }
}

// Clase tradicional Entrada
class Entrada {
    private String evento;
    private double precio;

    public Entrada(String evento, double precio) {
        this.evento = evento;
        this.precio = precio;
    }

    public void mostrarInformación() {
        System.out.println("🎫 Evento: " + evento + " | Precio: $" + precio);
    }
}



