import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;

public class RegistroMuestras {

    public static void main(String[] args) {

        // Paso 1: ArrayList para registrar todas las especies en orden de llegada
        ArrayList<String> listaMuestras = new ArrayList<>();
        listaMuestras.add("Perro ");
        listaMuestras.add("Gato ");
        listaMuestras.add("Maíz");
        listaMuestras.add("Perro "); // muestra repetida

        // Paso 2: HashSet para filtrar especies únicas
        HashSet<String> especiesUnicas = new HashSet<>(listaMuestras);

        // Paso 3: HashMap para asociar ID de muestra con investigador
        HashMap<String, String> mapaMuestrasInvestigador = new HashMap<>();
        mapaMuestrasInvestigador.put("M-001", "Dra. Karla Garcia");
        mapaMuestrasInvestigador.put("M-002", "Dr. Daniel Martinez");
        mapaMuestrasInvestigador.put("M-003", "Mtra. Martha Gonzales");

        // Paso 4: Mostrar resultados

        // Mostrar lista completa y ordenada de muestras
        System.out.println("Lista completa de muestras en orden de llegada:");
        for (String especie : listaMuestras) {
            System.out.println("• " + especie);
        }

        System.out.println("\nEspecies únicas procesadas:");
        for (String especieUnica : especiesUnicas) {
            System.out.println("• " + especieUnica);
        }

        System.out.println("\nRelación ID de muestra → Investigador:");
        for (String id : mapaMuestrasInvestigador.keySet()) {
            System.out.println(id + " → " + mapaMuestrasInvestigador.get(id));
        }

        // Búsqueda por ID de muestra
        System.out.println("\nBúsqueda de investigador por ID de muestra:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese ID de muestra (ej. M-002): ");
        String idBusqueda = scanner.nextLine();

        if (mapaMuestrasInvestigador.containsKey(idBusqueda)) {
            System.out.println("Investigador responsable: " + mapaMuestrasInvestigador.get(idBusqueda));
        } else {
            System.out.println("No se encontró un investigador para ese ID.");
        }

        scanner.close();
    }
}