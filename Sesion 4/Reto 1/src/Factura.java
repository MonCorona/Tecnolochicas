import java.util.Objects;

public class Factura {

    //Atributos
    private String folio;
    private String cliente;
    private double total;

    public Factura(String folio, String cliente, double total){
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    @Override
    public String toString(){
        return "Factura [Folio= "+folio+", Cliente= "+cliente+", Total= $"+total+"]";
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Factura factura = (Factura) obj;
        return folio.equals(factura.folio);
    }

    @Override
    public int hashCode(){
        return folio.hashCode();
    }
}