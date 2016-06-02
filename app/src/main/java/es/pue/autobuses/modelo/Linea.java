package es.pue.autobuses.modelo;

import java.util.ArrayList;
import es.pue.autobuses.modelo.excepciones.CodigoLineaInvalida;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Linea {
  // Atributos
  private int numLinea;

  // Resultado de la normalización
  private ArrayList<Asignadas> asignaciones;
  private ArrayList<ConductorVeterano> conductorVeteranos;
  private ArrayList<Autobus> autobuses;
  private ArrayList<ParadaEnLinea> paradas;

  public Linea(int numLinea) throws CodigoLineaInvalida {
    if (numLinea < 0) {
      throw new CodigoLineaInvalida();
    }

    this.numLinea = numLinea;

    asignaciones = new ArrayList<>();
    conductorVeteranos = new ArrayList<>();
    autobuses = new ArrayList<>();
    paradas = new ArrayList<>();
  }

  public int getNumLinea() {
    return numLinea;
  }

  public void addAutobus(Autobus bus)
      throws Exception{
    if (bus == null) {
      throw new Exception();
    }
    this.autobuses.add(bus);
  }
}
