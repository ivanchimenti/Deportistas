package pb2.unlam.edu.ar;

import java.util.ArrayList;

public class Evento {
    private Integer idEvento;
    private String nombreEvento;
    private TipoEvento tipoEvento;
    private ArrayList<Socio> participantes;

    public Evento(Integer idEvento, String nombreEvento, TipoEvento tipoEvento) {
        this.idEvento = idEvento;
        this.nombreEvento = nombreEvento;
        this.tipoEvento = tipoEvento;
        this.participantes = new ArrayList<>();
    }

    public Integer getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Integer idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public void inscribirParticipantes(Socio s){
        this.participantes.add(s);
    }

    public Integer obtenerCantidadDeParticipantes(){
        return this.participantes.size();
    }

}
