package es.pue.autobuses.modelo;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Asignadas {
  private float horas;

  private ConductorPracticas practicas;
  private Linea lineas;

  public Asignadas(float horas, ConductorPracticas conductorPracticas,
      Linea linea) throws Exception {
    if ( conductorPracticas == null || linea == null){
      throw new NullPointerException();
    }
    if (horas <= 100){
      throw new Exception();
    }
    this.horas = horas;
    this.practicas = conductorPracticas;
    this.lineas = linea;
  }
}
