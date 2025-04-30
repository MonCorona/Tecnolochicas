public class Main {
    public static void main(String[] args) {
        // Crear facturas
        Factura f1 = new Factura(2500.0, "Servicio de consultoría", "ABCC010101XYZ");
        Factura f2 = new Factura(1800.0, "Reparación de equipo", null);

        // Imprimir resumen
        System.out.println(f1.getResumen());
        System.out.println();
        System.out.println(f2.getResumen());
    }
}
