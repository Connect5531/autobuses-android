package es.pue.autobuses.modelo;

import java.util.ArrayList;

/**
 * Created by poo2 on 17/05/2016.
 */
public class ConductorVeterano extends Conductor {

  private Linea noLinea;

  public ConductorVeterano(String dni, String nombre) throws Exception {
    super(dni, nombre);


  }

  public void setNoLinea(Linea noLinea) throws Exception{
    if(noLinea == null){
      throw new Exception();
    }

    this.noLinea = noLinea;
  }
}
