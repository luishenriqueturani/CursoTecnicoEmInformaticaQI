package com.example.alunos.sistemadebiblioteca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etCodigo;
    EditText etAutor;
    EditText etTitulo;
    EditText etEditora;
    Button btCadastrar;
    Button btBuscar;
    Livro li= new Livro();

    private void carregaElementos(){
        etAutor = (EditText) findViewById(R.id.et_autor);
        etCodigo = (EditText) findViewById(R.id.et_codigo);
        etEditora = (EditText) findViewById(R.id.et_editora);
        etTitulo = (EditText) findViewById(R.id.et_titulo);
        btBuscar = (Button) findViewById(R.id.bt_buscar);
        btCadastrar = (Button) findViewById(R.id.bt_cadastrar);
    }

    private void recebeDados(){
        li.setAutor(etAutor.getText().toString());
        li.setEditora(etEditora.getText().toString());
        li.setTitulo(etTitulo.getText().toString());
        li.setCodigo(Integer.parseInt(etCodigo.getText().toString()));
        Toast.makeText(MainActivity.this, li.toString(),Toast.LENGTH_SHORT).show();
    }

    private void cadastraDados(){
        BancoCRUD crud = new BancoCRUD(getBaseContext());
        String msg=crud.inserirDados(li.getCodigo(),li.getTitulo(),li.getAutor(),li.getEditora());
        Toast.makeText(MainActivity.this,msg,Toast.LENGTH_SHORT).show();
    }

    private void cliqueBuscar(){
        btBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivityBuscar.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        carregaElementos();
        cliqueBuscar();
        btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recebeDados();
                cadastraDados();
            }
        });
    }
}
