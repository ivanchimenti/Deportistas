package pb2.unlam.edu.ar;

public abstract class Socio {
    protected Integer nro;
    protected String nombre;

    public Socio(Integer nro, String nombre) {
        this.nro = nro;
        this.nombre = nombre;
    }

    public Integer getNro() {
        return nro;
    }

    public void setNro(Integer nro) {
        this.nro = nro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
