public class Main {
    public static void main(String[] args) {
        Contacto c1 = new Contacto("555-1234");
        Contacto c2 = new Contacto(null);

        // 🧪 Uso de isPresent (menos recomendado)
        if (c1.getTelefono().isPresent()) {
            System.out.println("📞 Teléfono (isPresent): " + c1.getTelefono().get());
        }

        // 🧪 Uso de ifPresent (más recomendado)
        c2.getTelefono().ifPresent(tel -> System.out.println("📞 Teléfono (ifPresent): " + tel));

        // 🧪 Uso de orElse
        String tel1 = c1.getTelefono().orElse("No registrado");
        String tel2 = c2.getTelefono().orElse("No registrado");

        System.out.println("📞 Teléfono 1: " + tel1);
        System.out.println("📞 Teléfono 2: " + tel2);

        // 🧪 Uso de orElseThrow
        String telSeguro = c1.getTelefono()
                .orElseThrow(() -> new RuntimeException("⚠️ Teléfono obligatorio"));

        System.out.println("✅ Teléfono asegurado: " + telSeguro);
    }
}
