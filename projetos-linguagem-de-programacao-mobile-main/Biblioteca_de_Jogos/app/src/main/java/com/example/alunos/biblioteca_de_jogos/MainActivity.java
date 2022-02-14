package com.example.alunos.biblioteca_de_jogos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btcadastro;
    Button btAlterar;
    Button btListar;

    public void carregaElementos(){
        btAlterar = (Button) findViewById(R.id.bt_alterar);
        btcadastro = (Button) findViewById(R.id.bt_cadastrar);
        btListar = (Button) findViewById(R.id.bt_listar);
    }

    public void cadastro(){
        btcadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( MainActivity.this, CadastroActivity.class);
                startActivity(intent);
            }
        });
    }

    public void altera(){
        btAlterar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListagemActivity.class);
                startActivity(intent);
            }
        });
    }

    public void listar(){
        btListar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListagemActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        carregaElementos();
        cadastro();
        altera();
        listar();
    }
}
