package com.example.alunos.biblioteca_de_jogos;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

public class ListagemActivity extends AppCompatActivity {
    ListView lvList;
    Cursor cursor;
    private AlertDialog alerta;


    public void carregaelementos(){
        lvList = (ListView) findViewById(R.id.lv_list);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem);
        ControladorBanco crud = new ControladorBanco(getBaseContext());


        cursor = crud.exibirDados();
        String[] nomeCampos = new String[]{
            CriaBanco.ID, CriaBanco.NOME, CriaBanco.CLASSIFICACAO
        };

        int[] colunas = new int[]{
            R.id.tv_id, R.id.tv_nome, R.id.tv_etaria
        };

        SimpleCursorAdapter adapter = new SimpleCursorAdapter(getBaseContext(), R.layout.activity_listagem, cursor, nomeCampos, colunas, 0);

        carregaelementos();

        lvList.setAdapter(adapter);

        cliqueItem();

    }

    public void alerta(final String codigo){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Descrição");
        builder.setMessage("ID: "+CriaBanco.getID()+"\nNome: "+CriaBanco.getNOME()+"\nPreco: "+CriaBanco.getPRECO()+"\nGênero: "+CriaBanco.getGENERO()
                +"\nPlateforma: "+CriaBanco.getPLATAFORMA()+"\nClassificacão etária: "+CriaBanco.getCLASSIFICACAO());

        builder.setPositiveButton("Alterar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(ListagemActivity.this, AlteraActivity.class);
                intent.putExtra("id",codigo);
                startActivity(intent);
            }
        });
        builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(ListagemActivity.this, "Dados inalterados",Toast.LENGTH_SHORT).show();
            }
        });
        alerta = builder.create();
        alerta.show();
    }

    public void cliqueItem(){
        lvList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String codigo;
                cursor.moveToPosition(i);
                codigo = cursor.getString(cursor.getColumnIndexOrThrow(CriaBanco.ID));
                alerta(codigo);

                //finish();
            }
        });
    }



}
