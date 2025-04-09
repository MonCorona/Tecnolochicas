package Hospital;

    public class Paciente {
    String Nombre;
    String Edad;
    String NumeroExpediente;

    //Método para mostrar la informacion del paciente
    public void mostrarInformacion(){
        System.out.println("\nDatos ingresados:");
        System.out.println("Nombre: " + Nombre);
        System.out.println("Edad: " + Edad);
        System.out.println("Expediente: " + NumeroExpediente);
    }



}