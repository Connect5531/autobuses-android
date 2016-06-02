package es.pue.autobuses.modelo;

import java.util.ArrayList;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Conductor {
  private String dni;
  private String nombre;

  private ArrayList<Turno> busTurno;


  public Conductor(String dni, String nombre) throws Exception{
    if (dni == null || nombre == null) {
      throw new Exception();
    }
    this.dni = dni;
    this.nombre = nombre;

    busTurno = new ArrayList<>();
  }

  public String getNombre() {
    return nombre;
  }

  public void addTurno(Turno turno) throws Exception{
    if (turno == null) {
      throw new Exception();
    }

    busTurno.add(turno);

  }

  public String toString() {
    return "Nombre: " + this.nombre + ", DNI: " + this.dni;
  }

}
