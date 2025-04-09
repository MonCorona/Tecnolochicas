public class Principal {
    public static void main(String[] args) {
        //Crear mis objetos
        //1. Clase
        //2. Identificador
        //3. new + constructor
        Estudiante estudiante1 = new Estudiante();   // crea el objeto 1

        //Asignación valores a objeto 1
        estudiante1.Nombre = "Valeria";
        estudiante1.Edad = 22;

        //Acción del objeto 1
        estudiante1.saludar();

    }
}