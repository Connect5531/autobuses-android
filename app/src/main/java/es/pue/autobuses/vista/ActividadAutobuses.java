package es.pue.autobuses.vista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import es.pue.autobuses.R;
import es.pue.autobuses.controlador.Controlador;

public class ActividadAutobuses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_autobuses);
    }

    public void crearBus(View botón) {
        TextView mat = (TextView) findViewById(R.id.matricula);
        String matricula = mat.getText().toString();

        TextView pla = (TextView) findViewById(R.id.plazas);
        int plazas = Integer.parseInt(pla.getText().toString());

        TextView lin = (TextView) findViewById(R.id.lineas);
        int lineas = Integer.parseInt(lin.getText().toString());

        try {
            MenuPrincipal.ctrl.addAutobús(matricula, plazas, lineas);
            Toast.makeText(this, "Autobus con matricula: " + matricula + " creado", Toast.LENGTH_LONG).show();
            mat.setText("");
            pla.setText("");
            lin.setText("");
        } catch (Exception e) {
            Toast.makeText(this, "Error: no se ha podido añadir el autobús " , Toast.LENGTH_LONG).show();
        }
    }


}
