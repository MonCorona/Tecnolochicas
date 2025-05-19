public class Patrulla extends UnidadEmergencia{
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;

    public Patrulla(String nombre, String nombreOperador){
        super(nombre);
        gps = new SistemaGPS();
        sirena = new Sirena();
        operador = new Operador(nombreOperador);
    }

    public void iniciarOperacion(){
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }

    @Override
    public void responder(){
        System.out.println("Patrulla atendiendo situación de seguridad ciudadana");
    }
}