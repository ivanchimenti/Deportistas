package pb2.unlam.edu.ar;

import static org.junit.Assert.*;
import org.junit.Test;

public class testDeportistas {

    @Test
    public void queSePuedaCrearUnNadador(){
        Socio nadador = new Nadador(143314, "Marcos", TipoNado.CROLL);
        assertNotNull(nadador);
    }

    @Test
    public void queSePuedaCrearUnCorredor(){
        Socio corredor = new Corredor(126328, "Juan", 2);
        assertNotNull(corredor);
    }

    @Test
    public void queSePuedaCrearUnCiclista(){
        Socio ciclista = new Ciclista(293654, "Walter", TipoBici.MONTANIA);
        assertNotNull(ciclista);
    }

    @Test
    public void queSePuedaCrearUnTriatleta(){
        Socio triatleta = new Triatleta(623945, "Tomas", 20, TipoNado.CROLL, TipoBici.MONTANIA);
        assertNotNull(triatleta);
    }

    @Test
    public void queSePuedanIncorporarDistintosDeportistas(){
        Club casla = new Club("CASLA");

        Socio nadador = new Nadador(143314, "Marcos", TipoNado.ESPALDA);
        Socio corredor = new Corredor(126328, "Juan", 2);
        Socio ciclista = new Ciclista(325489, "Agustin", TipoBici.RUTA);
        Socio triatleta = new Triatleta(623945, "Tomas", 10, TipoNado.ESPALDA, TipoBici.TRIATLON);
        Socio nadador1 = new Nadador(253273, "Delfina", TipoNado.MARIPOSA);
        Socio corredor1= new Corredor(244269, "Usain", 42);
        Socio ciclista1 = new Ciclista(293654, "Walter", TipoBici.MONTANIA);
        Socio triatleta1 = new Triatleta(911923, "Facundo", 10, TipoNado.PECHO, TipoBici.RUTA);
        Socio nadador2 = new Nadador(471999, "Nacho", TipoNado.PECHO);

        casla.agregarDeportistas(nadador);
        casla.agregarDeportistas(nadador1);
        casla.agregarDeportistas(nadador2);
        casla.agregarDeportistas(corredor);
        casla.agregarDeportistas(corredor1);
        casla.agregarDeportistas(ciclista);
        casla.agregarDeportistas(ciclista1);
        casla.agregarDeportistas(triatleta);
        casla.agregarDeportistas(triatleta1);

        assertEquals((Integer) 9, casla.obtenerCantDeportistas());
    }

    @Test (expected = NoEstaPreparadoException.class)
    public void queUnCorredorNoSePuedaInscribirEnUnaCarreraDeNatacion() throws NoEstaPreparadoException {
        Club club = new Club("CASLA");
        Evento evento = club.crearEvento(71122, "Carrera de Natacion", TipoEvento.NATACION);

        Socio nadador = new Nadador(222019, "Delfina", TipoNado.MARIPOSA);
        Socio corredor = new Corredor(696969, "Usain", 42);

        club.inscribirAEventoDeNatacion(evento,nadador);
        club.inscribirAEventoDeNatacion(evento,corredor);
//        assertEquals((Integer) 1, evento.obtenerCantidadDeParticipantes());
    }

    @Test (expected = NoEstaPreparadoException.class)
    public void queUnCorredorNoSePuedaInscribirEnUnTriatlon() throws NoEstaPreparadoException {
        Club club = new Club("CASLA");
        Evento evento = club.crearEvento(81122, "Triatlon", TipoEvento.TRIATLON);

        Socio triatleta = new Triatleta(231941, "Joaquin", 8, TipoNado.PECHO, TipoBici.TRIATLON);
        Socio corredor = new Corredor(496532, "Valentin", 10);

        club.inscribirAEventoTriatlon(evento, triatleta);
        club.inscribirAEventoTriatlon(evento, corredor);

    }

    @Test
    public void queUnCorredorPuedaCorrerUnaMaraton() throws NoEstaPreparadoException {
        Club club = new Club("CASLA");
        Evento evento = club.crearEvento(81122, "Maraton", TipoEvento.RUNNING);

        Socio corredor = new Corredor(694233, "Usain", 42);

        club.inscribirAEventoDeRunning(evento, corredor);

        assertEquals((Integer)1, evento.obtenerCantidadDeParticipantes());
    }


}
