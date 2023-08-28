package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button_multiplicar;
    Button button_potencia;
    Button button_fibonacci;
    Button button_ncalculo;

    TextView resultado;
     EditText numero1;
    EditText numero2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_multiplicar = findViewById(R.id.button_multiplicar);
        button_potencia = findViewById(R.id.button_potencia);
        button_fibonacci = findViewById(R.id.button_fibonacci);
        button_ncalculo = findViewById(R.id.button_ncalculo);

        resultado = findViewById(R.id.resultado);

        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);

        button_multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(numero1.getText().toString());
                int n2 = Integer.parseInt(numero2.getText().toString());
                int resultad = n1 * n2;
                resultado.setText("Multiplicación: " + resultad);
            }
        });

        button_fibonacci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(numero1.getText().toString());
                int resultad = fibonacci(n1);
                resultado.setText("Fibonacci: " + resultad);
            }
        });


        button_potencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(numero1.getText().toString());
                int n2 = Integer.parseInt(numero2.getText().toString());
                double resultad = Math.pow(n1, n2);
                resultado.setText("Potencia: " + resultad);
            }
        });


        button_ncalculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero1.setText("");
                numero2.setText("");
            }
        });
    }


    public int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }


    }
