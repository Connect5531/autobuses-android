package es.pue.autobuses.modelo;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Turno {

  // Atributos
  private Conductor conductor;
  //private LocalDate fecha;
  private TipoTurno tipoTurno;
  private Autobus bus;

  // Constructor
  public Turno(Conductor conductor, /*LocalDate fecha,*/
               TipoTurno tipoTurno, Autobus bus) throws Exception {
    if (conductor == null || /*fecha == null ||*/ tipoTurno == null || bus == null) {
      throw new Exception();
    }

    this.conductor = conductor;
    //this.fecha = fecha;
    this.tipoTurno = tipoTurno;
    this.bus = bus;
  }


}
