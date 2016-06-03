package es.pue.autobuses.vista;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import es.pue.autobuses.R;
import es.pue.autobuses.controlador.Controlador;

public class MenuPrincipal extends AppCompatActivity {

  static Controlador ctrl = new Controlador();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_menu_principal);
  }

  public void abrirNuevaLínea(View botón) {
    // Se ha pulsado el botón de crear una nueva línea
    Intent intentoAbrirLínea = new Intent(this, ActivityLineas.class);
    startActivity(intentoAbrirLínea);
  }

  public void crearNuevoAutobús(View botón) {
    // Se ha pulsado el botón de crear una nueva línea
    Intent intentoCrearAutobús = new Intent(this, ActividadAutobuses.class);
    startActivity(intentoCrearAutobús);
  }
}
