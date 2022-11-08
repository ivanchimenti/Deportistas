package pb2.unlam.edu.ar;

public class Corredor extends Socio implements ICorrer {
    private Integer distancia;

    public Corredor(Integer nro, String nombre, Integer distancia) {
        super(nro, nombre);
        this.distancia = distancia;
    }

    public Integer getDistancia() {
        return distancia;
    }

    public void setDistancia(Integer distancia) {
        this.distancia = distancia;
    }

    @Override
    public String correr() {
        return "Puedo correr";
    }
}
