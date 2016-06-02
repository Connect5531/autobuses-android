package es.pue.autobuses.controlador;

import es.pue.autobuses.modelo.Conductor;
import es.pue.autobuses.modelo.Autobus;
import es.pue.autobuses.modelo.Linea;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;

public class Controlador {

  private HashMap<String, Conductor> conductores;
  private HashMap<Integer, Linea> lineas;
  private HashMap<String, Autobus> autobuses;

  public Controlador() {
    System.out.println("Construyendo Controlador");
    this.conductores = new HashMap<>();
    this.lineas = new HashMap<>();
    this.autobuses = new HashMap<>();
  }

  public void addConductor(String dni, String nombre) throws Exception {
    this.conductores.put(dni, new Conductor(dni, nombre));
  }

  public void addLínea(int numLinea) throws Exception {
    if (lineas.get(numLinea) != null) { // Ya existe una linea con este numero
      throw new Exception();
    }

    this.lineas.put(numLinea, new Linea(numLinea));

    //guardarLineas();
  }

  public Integer[] listarLineas() {
    return lineas.keySet().toArray(new Integer[0]);
  }

  public void guardarLineas() throws Exception {
    PrintWriter pw = new PrintWriter(new File("C:/Users/Poo2/lineas.txt"));

    for(int l: listarLineas()) {
      pw.println(l);
    }

    pw.close();
  }

  public void addAutobús(String matricula, int plazas, int numLinea)
      throws Exception {

    Linea linea = this.lineas.get(numLinea);
    if (linea == null) {
      throw new Exception();
    }

    Autobus b1 = this.autobuses.get(matricula);
    if (b1 != null) {
      throw new Exception();
    }

    b1 =new Autobus(matricula, plazas, linea);
    autobuses.put(matricula, b1);
    linea.addAutobus(b1);
  }

}
