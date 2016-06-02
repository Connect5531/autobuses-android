package es.pue.autobuses.modelo;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Incidencia {
  private int codigo;
  private String nombre;
  //private LocalDate fecha;
  private TurnoNoche tNoche;



  public Incidencia(int codigo, String nombre, /*LocalDate fecha,*/
                    TurnoNoche tNoche) throws Exception{
    if (nombre == null || /*fecha ==null ||*/ tNoche == null){
      throw new Exception();
    }
    this.codigo = codigo;
    this.nombre = nombre;
    //this.fecha = fecha;
    this.tNoche = tNoche;
  }
}