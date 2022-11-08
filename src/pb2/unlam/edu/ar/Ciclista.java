package pb2.unlam.edu.ar;

public class Ciclista extends Socio implements IBicicleta {

    private TipoBici tipoBici;

    public Ciclista(Integer nro, String nombre, TipoBici tipoBici) {
        super(nro, nombre);
        this.tipoBici = tipoBici;
    }

    public TipoBici getTipoBici() {
        return tipoBici;
    }

    public void setTipoBici(TipoBici tipoBici) {
        this.tipoBici = tipoBici;
    }

    @Override
    public String andarEnBici() {
        return "Puedo andar en bicicleta";
    }
}
