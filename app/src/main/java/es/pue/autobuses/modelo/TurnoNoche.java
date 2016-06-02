package es.pue.autobuses.modelo;

import java.util.ArrayList;

/**
 * Created by poo2 on 17/05/2016.
 */
public class TurnoNoche extends Turno {

  // Atributos

  // normalizacion
  private ArrayList<Incidencia> incidencias;


  public TurnoNoche(Conductor conductor, /*LocalDate fecha,*/
                    TipoTurno tipoTurno, Autobus bus) throws Exception{
    super (conductor, /*fecha,*/ tipoTurno, bus );

    if (tipoTurno != TipoTurno.NOCHE) {
      throw new Exception();
    }
    incidencias = new ArrayList<Incidencia>();
  }

  public void addIncidencia(Incidencia problema) throws Exception{
    if (problema==null){
      throw new Exception();
    }

    incidencias.add(problema);

  }
}
