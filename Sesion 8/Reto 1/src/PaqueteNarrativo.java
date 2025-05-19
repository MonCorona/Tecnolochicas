public class PaqueteNarrativo {
    private final TransicionHistoria transicion;
    private final GestorDialogo dialogo;
    private final LogicaDecision decision;

    public PaqueteNarrativo(TransicionHistoria transicion, GestorDialogo dialogo, LogicaDecision decision) {
        this.transicion = transicion;
        this.dialogo = dialogo;
        this.decision = decision;
    }

    public void ejecutarEscena() {
        dialogo.mostrarDialogo("El principe esta por tomar una desicion con quien casarse ...");
        dialogo.mostrarDialogo("A: Una princesa, este matrimonio esta propuesto desde que son niños.");
        dialogo.mostrarDialogo("B: Una plebella, que conocio hace 3 semanas .");

        String eleccion = decision.obtenerDecision();
        transicion.transicionar(eleccion);
        dialogo.mostrarDialogo("Tu decisión ha sido registrada. ¡La aventura continúa!");
    }
}