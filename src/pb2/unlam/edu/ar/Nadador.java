package pb2.unlam.edu.ar;

public class Nadador extends Socio implements INadar{
    private TipoNado tipoNado;

    public Nadador(Integer nro, String nombre, TipoNado tipoNado) {
        super(nro, nombre);
        this.tipoNado = tipoNado;
    }

    public TipoNado getTipoNado() {
        return tipoNado;
    }

    public void setTipoNado(TipoNado tipoNado) {
        this.tipoNado = tipoNado;
    }

    @Override
    public String nadar() {
        return "Puedo nadar";
    }
}
