package com.example.logonrm.myapplication;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout tilValor1;
    private TextInputLayout tilValor2;
    private EditText etResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tilValor1 = (TextInputLayout) findViewById(R.id.tilValor1);
        tilValor2 = (TextInputLayout) findViewById(R.id.tilValor2);
        etResultado = (EditText) findViewById(R.id.etResultado);
    }

    public void somar(View v){

        try {
            double valor1 = Double.parseDouble(tilValor1.getEditText().getText().toString());
            double valor2 = Double.parseDouble(tilValor2.getEditText().getText().toString());
            etResultado.setText(String.valueOf(valor1 + valor2));

        }catch (Exception e){
            Toast.makeText(this,"Valor nao pode ser nulo", Toast.LENGTH_SHORT).show();
        }

    }

    public void subtrair(View v) {

        try {
            double valor1 = Double.parseDouble(tilValor1.getEditText().getText().toString());
            double valor2 = Double.parseDouble(tilValor2.getEditText().getText().toString());
            etResultado.setText(String.valueOf(valor1 - valor2));
        }catch (Exception e){
            Toast.makeText(this,"Valor nao pode ser nulo", Toast.LENGTH_SHORT).show();
        }
    }

    public void multiplicar(View v) {

        try {
            double valor1 = Double.parseDouble(tilValor1.getEditText().getText().toString());
            double valor2 = Double.parseDouble(tilValor2.getEditText().getText().toString());
            etResultado.setText(String.valueOf(valor1 * valor2));
        }catch (Exception e){
            Toast.makeText(this,"Valor nao pode ser nulo", Toast.LENGTH_SHORT).show();
        }
    }

    public void dividir(View v) {

        try {
            double valor1 = Double.parseDouble(tilValor1.getEditText().getText().toString());
            double valor2 = Double.parseDouble(tilValor2.getEditText().getText().toString());

            if (valor2 <= 0){
                Toast.makeText(this, "Não é possivel dividir por 0", Toast.LENGTH_SHORT).show();
            }else{
                etResultado.setText(String.valueOf(valor1 / valor2));
            }

        }catch (Exception e){
            Toast.makeText(this,"Valor nao pode ser nulo", Toast.LENGTH_SHORT).show();
        }

    }
}
