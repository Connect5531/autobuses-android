package es.pue.autobuses.vista;

import es.pue.autobuses.controlador.Controlador;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import es.pue.autobuses.R;

public class ActivityLineas extends AppCompatActivity {

  private Controlador ctrl;

  public ActivityLineas() {
    ctrl = new Controlador();
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_activity_lineas);
  }

  public void crearLínea(View botón) {
    TextView tv = (TextView) findViewById(R.id.textoLínea);
    int númLínea = Integer.parseInt(tv.getText().toString());

    try {
      ctrl.addLínea(númLínea);
      Toast.makeText(this, "Línea " + númLínea + " creada", Toast.LENGTH_LONG).show();
      tv.setText("");
    } catch (Exception e) {
      Toast.makeText(this, "Error: ya existe la línea " + númLínea, Toast.LENGTH_LONG).show();
    }
  }
}
