package com.technic.contaderestaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private double consumo, couvert, /*taxa,total, pessoa,*/  calcpessoa, calctotal, calctaxa;
    private int dividir;
    private EditText edtConsumo ,edtCouvert, edtDividir, edtTaxa, edtPessoa, edtTotal;
    private Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtConsumo = findViewById(R.id.edtConsumo);
        edtCouvert = findViewById(R.id.edtCouvert);
        edtDividir = findViewById(R.id.edtDividir);
        edtTaxa    = findViewById(R.id.edtTaxa);
        edtPessoa  = findViewById(R.id.edtPessoa);
        edtTotal   = findViewById(R.id.edtTotal);
        btnCalcular = findViewById(R.id.btnCalcular);


    }
    public void botaoCalcular (View view) {

        consumo  = Double.parseDouble(edtConsumo.getText().toString());
        couvert  = Double.parseDouble(edtCouvert.getText().toString());
      //  taxa     = Double.parseDouble(edtTaxa.getText().toString());
       // pessoa   = Double.parseDouble(edtPessoa.getText().toString());
      //  total    = Double.parseDouble(edtTotal.getText().toString());
         dividir  = Integer.parseInt(edtDividir.getText().toString());

        edtConsumo.setText(String.valueOf(consumo));
        edtCouvert.setText(String.valueOf(couvert));

        edtTaxa.setText(String.valueOf(calctaxa));
        calctaxa = (consumo*10)/100;

        edtDividir.setText(String.valueOf(dividir));

        calcpessoa = calctotal/dividir;
        edtPessoa.setText(String.valueOf(calcpessoa));

        calctotal = consumo + couvert + calctaxa;
        edtTotal.setText(String.valueOf(calctotal));

    }
}