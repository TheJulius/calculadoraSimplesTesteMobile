package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //arquivo que vai ser mostrado (front)

        EditText valor1 = (EditText) findViewById(R.id.valor1);
        EditText valor2 = (EditText) findViewById(R.id.valor2);
        TextView mensagem = (TextView) findViewById(R.id.mensagem);
        Button soma = (Button) findViewById(R.id.soma);
        Button subtracao = (Button) findViewById(R.id.subtracao);
        Button multiplicacao = (Button) findViewById(R.id.multiplicacao);
        Button divisao = (Button) findViewById(R.id.divisao);



        soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mensagem.setText(String.valueOf(Integer.parseInt(String.valueOf(valor1.getText())) + Integer.parseInt(String.valueOf(valor2.getText()))));
            }
        });

        subtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mensagem.setText(String.valueOf(Integer.parseInt(String.valueOf(valor1.getText())) - Integer.parseInt(String.valueOf(valor2.getText()))));
            }
        });

        multiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mensagem.setText(String.valueOf(Integer.parseInt(String.valueOf(valor1.getText())) * Integer.parseInt(String.valueOf(valor2.getText()))));
            }
        });

        divisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mensagem.setText(String.valueOf(Integer.parseInt(String.valueOf(valor1.getText())) / Integer.parseInt(String.valueOf(valor2.getText()))));
            }
        });
    }
}