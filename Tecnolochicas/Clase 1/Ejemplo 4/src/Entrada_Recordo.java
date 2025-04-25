// Record con toString personalizado
public record Entrada_Recordo(String evento, double precio) {
    public void mostrarInformacion(){
        System.out.println("Evento: " + evento + " | Precio: $" + precio);
    }

}
