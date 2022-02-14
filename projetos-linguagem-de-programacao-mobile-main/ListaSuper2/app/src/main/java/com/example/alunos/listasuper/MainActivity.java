package com.example.alunos.listasuper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etItem;
    EditText etPreco;
    Button btAdicionar;
    ListView lvItens;
    Button btFinalizar;
    TextView tvResultado;
    ArrayAdapter<CharSequence> adapter;
    Calculos c = new Calculos();

    public void carregaElementos(){
        etItem = (EditText) findViewById(R.id.et_item);
        etPreco = (EditText) findViewById(R.id.et_preco);
        btAdicionar = (Button) findViewById(R.id.bt_adicionar);
        lvItens = (ListView) findViewById(R.id.lv_itens);
        btFinalizar = (Button) findViewById(R.id.bt_finalizar);
        tvResultado = (TextView) findViewById(R.id.tv_Resultado);
    }

    public void carregaItens(){

        c.getItens().add(etItem.getText().toString());
        c.getPreco().add(Float.parseFloat(etPreco.getText().toString()));
        adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_checked,c.getItens());
        lvItens.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        lvItens.setAdapter(adapter);
    }

    public String calculaItens(){
        return c.getItens().toString()+"R$ "+c.getPreco()+"\n";
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        carregaElementos();
        btAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                carregaItens();
            }
        });
        btFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResultado.setText(calculaItens());
            }
        });


    }
}
