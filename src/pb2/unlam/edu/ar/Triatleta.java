package pb2.unlam.edu.ar;

public class Triatleta extends Socio implements INadar, ICorrer, IBicicleta {

    private Integer kms;
    private TipoNado nado;
    private TipoBici bici;

    public Triatleta(Integer nro, String nombre, Integer kms, TipoNado nado, TipoBici bici) {
        super(nro, nombre);
        this.kms = kms;
        this.nado = nado;
        this.bici = bici;
    }

    public Integer getKms() {
        return kms;
    }

    public void setKms(Integer kms) {
        this.kms = kms;
    }

    public TipoNado getNado() {
        return nado;
    }

    public void setNado(TipoNado nado) {
        this.nado = nado;
    }

    public TipoBici getBici() {
        return bici;
    }

    public void setBici(TipoBici bici) {
        this.bici = bici;
    }

    @Override
    public String andarEnBici() {
        return "Puedo andar en bicicleta";
    }

    @Override
    public String correr() {
        return "Puedo correr";
    }

    @Override
    public String nadar() {
        return "Puedo nadar";
    }
}
