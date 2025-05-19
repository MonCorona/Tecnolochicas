import java.util.Scanner;
public class SimuladorFarmacia {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String medicamento;
        double precio;
        int piezas;

        //PEDIR LOS DATOS AL USUARIO
        System.out.println("Ingresa el nombre del medicamento");
        medicamento = scanner.nextLine();

        System.out.println("Ingresa el precio del medicamento");
        precio = scanner.nextDouble();

        System.out.println("Ingresa el número de piezas");
        piezas = scanner.nextInt();

        // CÁLCULO DEL PRECIO Y CANTIDAD
        double CT =  (piezas * precio);
        // APLICA DESCUENTO SI EL TOTAL SUPERA LOS $500
        var AD = CT > 500;
        //ASIGNACIÓN DEL DESCUENTO (15%)
        double descuento = AD ? CT * 0.15 : 0;

        // CÁLCULO FINAL
        double RF = CT - descuento;

        System.out.println("\n \uD83D\uDCDD Resumen del pedido:\n");
        System.out.println("Medicamento:" + medicamento);
        System.out.println("Piezas:" + piezas);
        System.out.println("Precio unitario: $" + precio);
        System.out.println("¿Aplica descuento?: " + AD);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + RF);

    }
}