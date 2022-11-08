package pb2.unlam.edu.ar;

import java.util.ArrayList;
import java.util.TreeSet;

public class Club {
    private String nombre;
    private ArrayList<Socio> deportistas;

    public Club(String nombre) {
        this.nombre = nombre;
        this.deportistas = new ArrayList<>();
    }

    public void agregarDeportistas(Socio s){
        this.deportistas.add(s);
    }

    public Integer obtenerCantDeportistas(){
        return this.deportistas.size();
    }

    public Evento crearEvento(Integer idEvento, String nombreEvento, TipoEvento tipoEvento) {
        return new Evento(idEvento, nombreEvento, tipoEvento);
    }

    public void inscribirAEventoDeNatacion(Evento e, Socio n) throws NoEstaPreparadoException {
        if (n instanceof INadar){
            e.inscribirParticipantes(n);
        }else{
            throw new NoEstaPreparadoException("El deportista no está preparado para esta competición");
        }
    }

    public void inscribirAEventoTriatlon(Evento e, Socio t) throws NoEstaPreparadoException {
        if ((t instanceof INadar) && (t instanceof ICorrer) && (t instanceof IBicicleta)){
            e.inscribirParticipantes(t);
        }else{
            throw new NoEstaPreparadoException("El deportista no está preparado para esta competición");
        }
    }

    public void inscribirAEventoDeRunning(Evento e, Socio c) throws NoEstaPreparadoException {
        if (c instanceof ICorrer){
            e.inscribirParticipantes(c);
        }else{
            throw new NoEstaPreparadoException("El deportista no está preparado para esta competición");
        }
    }
}
