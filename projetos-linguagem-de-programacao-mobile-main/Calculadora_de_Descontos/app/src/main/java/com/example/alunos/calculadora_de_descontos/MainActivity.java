package com.example.alunos.calculadora_de_descontos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etValor;
    EditText etPorc;
    TextView resposta;
    Button btCalc;
    Calculadora c;

    public void carregaComponente(){
        etValor = (EditText) findViewById(R.id.et_valor);
        etPorc = (EditText) findViewById(R.id.et_porc);
        resposta = (TextView) findViewById(R.id.tv_resposta);
        btCalc = (Button) findViewById(R.id.bt_calc);
        c = new Calculadora();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        carregaComponente();
        btCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.setDesconto(Double.parseDouble(etPorc.getText().toString()));
                c.setValor(Double.parseDouble(etValor.getText().toString()));
                resposta.setText(c.toString());
            }
        });
    }
}
