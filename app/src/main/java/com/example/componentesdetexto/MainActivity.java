package com.example.componentesdetexto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView etiqueta;
    EditText  campo1, campo2, campo3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etiqueta = findViewById(R.id.textView);
        campo1 = findViewById(R.id.editText2);
        campo2 = findViewById(R.id.editText4);
        campo3 = findViewById(R.id.editText3);
    }

    public void Onclick(View view) {

        switch (view.getId()) {
            case R.id.btnIngresar:
                obtenerInfo();
            break;
        }

    }

    private void obtenerInfo() {
        int numero = Integer.parseInt(campo1.getText().toString());
        String nombre = campo2.getText().toString();
        String parrafo = campo3.getText().toString();

        //Enviar a la etiqueta un nuevo titulo al presionar el botón

        etiqueta.setText("Nuevo titulo");

        Toast.makeText(this, "El número de identificación es: " + numero, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "El nombre es: " + nombre, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Su comentario es: " + parrafo, Toast.LENGTH_SHORT).show();
    }
}
