package co.edu.unipiloto.ecoreciclaje_equipo05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class pantalla_consejos extends AppCompatActivity {

    ImageView ivDevolver;


    private TextView tvinformacion;
    private Button btnConsejo1, btnConsejo2, btnConsejo3, btnConsejo4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_consejos);

        ivDevolver=findViewById(R.id.ivDevolver);

        tvinformacion = findViewById(R.id.tvinformacion);
        btnConsejo1 = findViewById(R.id.btn_consejo1);
        btnConsejo2 = findViewById(R.id.btn_consejo2);
        btnConsejo3 = findViewById(R.id.btn_consejo3);
        btnConsejo4 = findViewById(R.id.btn_consejo4);

        ivDevolver.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent pantalla_consejos=new Intent(getApplicationContext(),Perfil_usuario.class);
                startActivity(pantalla_consejos);
            }
        });

        btnConsejo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarInformacion("Separa los materiales reciclables de los no reciclables. Al clasificarlos adecuadamente, facilitas el proceso de reciclaje y evitas contaminar los materiales reciclables con residuos no reciclables.");
            }
        });

        btnConsejo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarInformacion("Antes de reciclar, considera reducir y reutilizar. Compra productos con menos envases y busca alternativas reutilizables. Por ejemplo, utiliza bolsas de tela en lugar de bolsas de plástico y opta por botellas de agua reutilizables en lugar de botellas de un solo uso.");
            }
        });

        btnConsejo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarInformacion("Familiarízate con los símbolos de reciclaje en los envases. Estos símbolos te indicarán si un producto es reciclable y te ayudarán a clasificarlos correctamente.");
            }
        });

        btnConsejo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarInformacion("Favorece productos fabricados con materiales reciclados. Esto ayuda a cerrar el ciclo del reciclaje y a apoyar la demanda de productos sostenibles.");
            }
        });
    }
    private void mostrarInformacion(String texto) {
        tvinformacion.setText(texto);
    }
}


