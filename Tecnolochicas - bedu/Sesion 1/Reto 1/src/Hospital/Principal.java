package Hospital;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Paciente p1 = new Paciente();

        //Solicitar datos al usuario
        System.out.println("Ingresa el nombre del paciente: ");
        p1.Nombre = scanner.nextLine(); //limpiar el buffer

        System.out.println("Ingresa la edad: ");
        p1.Edad = scanner.nextLine();

        System.out.println("Ingresa el número de expediente ");
        p1.NumeroExpediente = scanner.nextLine();

        //Mostrar la información
        System.out.println("\n--- Ingresa el número de expediente ---");
        p1.mostrarInformacion();

        scanner.close();

    }
}