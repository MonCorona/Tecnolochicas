public class Main {
    public static void main(String[] args) {
        // Crear pasajero y vuelo
        Pasajero pasajero1 = new Pasajero("Ana Martínez", "P123456");
        Vuelo vuelo = new Vuelo("UX123", "París", "14:30");

        // Reservar asiento
        vuelo.reservarAsiento(pasajero1);

        // Mostrar itinerario
        System.out.println(vuelo.obtenerItinerario());

        // Cancelar reserva
        vuelo.cancelarReserva();

        // Mostrar itinerario sin reserva
        System.out.println(vuelo.obtenerItinerario());

        // Reservar usando nombre y pasaporte (sobrecarga)
        vuelo.reservarAsiento("Mario Gonzalez", "X987654");

        // Mostrar itinerario actualizado
        System.out.println(vuelo.obtenerItinerario());
    }
}
