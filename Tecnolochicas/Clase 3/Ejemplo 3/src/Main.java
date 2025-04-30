public class Main {
    public static void main(String[] args) {
        // 🧪 Prueba de Usuario con encapsulamiento
        Usuario u = new Usuario("Mario", 500.0);

        System.out.println("👤 Usuario: " + u.getNombre());
        System.out.println("💰 Saldo inicial: $" + u.getSaldo());

        u.depositar(250.0);
        System.out.println("💰 Saldo después del depósito: $" + u.getSaldo());

        // 🧪 Prueba de herencia y uso de protected
        Empleado empleado = new Empleado();
        empleado.mostrarNacionalidad();
    }
}
