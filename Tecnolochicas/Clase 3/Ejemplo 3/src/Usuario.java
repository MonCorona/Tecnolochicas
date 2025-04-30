public class Usuario {
    private String nombre;
    private double saldo;  // 🔒 No debe accederse directamente

    public Usuario(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    // 🔑 Métodos públicos (getters y método para modificar saldo)
    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }
}
