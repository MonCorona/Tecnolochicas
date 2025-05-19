public class TransicionSimple implements TransicionHistoria {
    @Override
    public void transicionar(String decision) {
        if ("A".equalsIgnoreCase(decision)) {
            System.out.println("Es obligado a casarse ...");
        } else if ("B".equalsIgnoreCase(decision)) {
            System.out.println("Conocio el amor de su vida ...");
        } else {
            System.out.println("La indecisión del héroe ha cambiado el destino.");
        }
    }
}