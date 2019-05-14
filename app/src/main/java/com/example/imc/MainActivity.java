package com.example.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvPeso;
    private TextView tvAltura;
    private TextView tvIMC;
    private EditText etPeso;
    private EditText etAltura;
    private EditText etIMC;
    private Button btCalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvPeso = (TextView) findViewById(R.id.tvPeso);
        tvAltura = (TextView) findViewById(R.id.tvAltura);
        tvIMC = (TextView) findViewById(R.id.tvIMC);
        etPeso = (EditText) findViewById(R.id.etPeso);
        etAltura = (EditText) findViewById(R.id.etAltura);
        etIMC = (EditText) findViewById(R.id.etIMC);
        btCalcular = (Button) findViewById(R.id.btCalcular);

        this.btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double peso = Double.valueOf(etPeso.getText().toString());
                double altura = Double.valueOf(etAltura.getText().toString());
                double calc = peso/(altura*altura);

                etIMC.setText(String.format("%.2f",calc));
            }
        });
    }
}
