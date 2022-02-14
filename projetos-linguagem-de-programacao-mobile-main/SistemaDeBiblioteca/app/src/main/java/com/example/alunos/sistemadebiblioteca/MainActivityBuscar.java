package com.example.alunos.sistemadebiblioteca;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

public class MainActivityBuscar extends AppCompatActivity {

    TextView tvTitulo;
    TextView tvID;
    ListView lvDados;

    private void carregaElementos(){
        tvTitulo = (TextView) findViewById(R.id.tv_titulo);
        tvID = (TextView) findViewById(R.id.tv_id);
        lvDados = (ListView) findViewById(R.id.lv_dados);
    }

    private void chamaBusca(){
        BancoCRUD crud = new BancoCRUD(getBaseContext());
        Cursor cursor = crud.buscarDados();

        String[] nomeCampos = new String[]{CriaBanco.ID, CriaBanco.TITULO};
        int[] idTv = new int[]{R.id.tv_id, R.id.tv_titulo};
        //vincular interface com colunas do bd
        SimpleCursorAdapter adapter = new SimpleCursorAdapter(getBaseContext(),
                R.layout.activity_main_buscar, cursor, nomeCampos,idTv, 0);
        lvDados.setAdapter(adapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_buscar);
        carregaElementos();
        chamaBusca();
    }
}
