package es.pue.autobuses.modelo;

/**
 * Created by poo2 on 23/05/2016.
 */
public class ParadaEnLinea {

  private Linea linea;
  private Parada parada;
  private ParadaEnLinea anterior;
  private ParadaEnLinea posterior;

  public ParadaEnLinea(Linea linea, Parada parada) throws Exception {
    if (linea == null || parada == null) {
      throw new Exception();
    }

    this.linea = linea;
    this.parada = parada;

  }

  public void setAnterior(ParadaEnLinea anterior) throws Exception {
    if (anterior == null || anterior.linea != this.linea || anterior == this) {
      throw new Exception();
    }

    this.anterior = anterior;
  }

  public void setPosterior(ParadaEnLinea posterior) throws Exception {
    if (posterior == null || posterior.linea != this.linea || posterior == this) {
      throw new Exception();
    }

    this.posterior = posterior;
  }
}
