package es.pue.autobuses.modelo;

import java.util.ArrayList;

public class Parada {
  private String nomParada;

  private ArrayList<ParadaEnLinea> paradasLineas;


  public Parada(String nomParada) {
    this.nomParada = nomParada;

    paradasLineas = new ArrayList<>();
  }

  public void addParadas(ParadaEnLinea posParada)
      throws Exception {
    if (posParada == null) {
      throw new Exception();
    }
    paradasLineas.add(posParada);
  }
}
