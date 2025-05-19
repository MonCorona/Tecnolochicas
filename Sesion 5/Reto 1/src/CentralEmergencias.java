public class CentralEmergencias {
    public static void main (String[] args){
        Ambulancia ambulancia = new Ambulancia("Ambulancia","Carlota ");
        Patrulla patrulla = new Patrulla("Patrulla","Daniel ");
        UnidadBomberos bomberos = new UnidadBomberos("UnidadBomberos", "Mariana ");

        System.out.println();
        ambulancia.iniciarOperador();

        System.out.println();
        patrulla.iniciarOperacion();

        System.out.println();
        bomberos.inicarOperacion();
    }
}