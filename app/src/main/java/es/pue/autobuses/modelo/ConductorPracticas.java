package es.pue.autobuses.modelo;

import java.util.ArrayList;

/**
 * Created by poo2 on 17/05/2016.
 */
public class ConductorPracticas extends Conductor {

  private ArrayList<Asignadas> lineas;

  public ConductorPracticas(String dni, String nombre) throws Exception {
    super(dni, nombre);

    lineas = new ArrayList<>();
  }

  public void addAsignacion(Asignadas linea) throws Exception{
    if(linea == null || lineas.size() >= 4){
      throw new Exception();
    }
    lineas.add(linea);
  }

}
