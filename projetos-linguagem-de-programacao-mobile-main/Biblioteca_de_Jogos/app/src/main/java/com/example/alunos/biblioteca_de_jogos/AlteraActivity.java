package com.example.alunos.biblioteca_de_jogos;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AlteraActivity extends AppCompatActivity {

    EditText etNome;
    EditText etPreco;
    EditText etGenero;
    EditText etPlataforma;
    EditText etIdade;
    Button btAlterar;
    Button btDeletar;
    String id;
    Cursor cursor;
    ControladorBanco crud;

    public void carregaElementos(){
        etNome = (EditText) findViewById(R.id.et_nome);
        etPreco = (EditText) findViewById(R.id.et_preco);
        etGenero = (EditText) findViewById(R.id.et_genero);
        etPlataforma = (EditText) findViewById(R.id.et_plataforma);
        etIdade = (EditText) findViewById(R.id.et_class_etaria);
        btAlterar = (Button) findViewById(R.id.bt_alterar);
        btDeletar = (Button) findViewById(R.id.bt_deletar);
    }

    public void alterarDadosInterface(){
        btAlterar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                crud.alteraDados(Integer.parseInt(id), etNome.getText().toString(), Float.parseFloat(etPreco.getText().toString()),
                        etGenero.getText().toString(), etPlataforma.getText().toString(), etIdade.getText().toString());

                Intent intent = new Intent(AlteraActivity.this, ListagemActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }

    public void deleta(){
        btDeletar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                crud.deletarDados(Integer.parseInt(id));
                Intent intent = new Intent(AlteraActivity.this, ListagemActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altera);
        carregaElementos();

        id = this.getIntent().getStringExtra("id");

        crud = new ControladorBanco(getBaseContext());

        cursor = crud.exibeById(Integer.parseInt(id));

        etNome.setText(cursor.getString(cursor.getColumnIndexOrThrow(CriaBanco.NOME)));

        etPreco.setText(cursor.getString(cursor.getColumnIndexOrThrow(CriaBanco.PRECO)));

        etGenero.setText(cursor.getString(cursor.getColumnIndexOrThrow(CriaBanco.GENERO)));

        etPlataforma.setText(cursor.getString(cursor.getColumnIndexOrThrow(CriaBanco.PLATAFORMA)));

        etIdade.setText(cursor.getString(cursor.getColumnIndexOrThrow(CriaBanco.CLASSIFICACAO)));

        alterarDadosInterface();
        deleta();

    }
}
