package com.example.alunos.sistemadebiblioteca;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class BancoCRUD {
    //rsponsável por receber as ações
    private SQLiteDatabase db;
    //responsável por avisar as ações
    private CriaBanco banco;


    //a classe BancoCRUD trabalha manipulação
    //a classe CriaBanco monta estrutura
    public BancoCRUD(Context context){
        banco = new CriaBanco(context);
    }

    public String inserirDados(int id, String titulo, String autor, String editora){
        //conteinar que insere valores
        ContentValues valores;

        //sentinela de verificação
        long resultados;
        //avisa o banco que será ecrito
        db=banco.getWritableDatabase();
        valores=new ContentValues();
        //vinculando valor a coluna
        valores.put(CriaBanco.TITULO, titulo);
        valores.put(CriaBanco.EDITORA, editora);
        valores.put(CriaBanco.AUTOR, autor);
        valores.put(CriaBanco.ID, id);
        //inserindo o conteiner de dados na tabela Livro
        resultados = db.insert(CriaBanco.TABELA, null, valores);
        //se a variável resultado é igual a -1 significa que o dado não foi inserido
        if (resultados==-1){
            return "ERRO ao inserir!";
        }else {
            return "Inserido!!!";
        }

    }
    public Cursor buscarDados(){
        //tipo de dado que recebe info do banco
        Cursor cursor;
        //array referencia colunas a serem exibidas
        String[] campos = {banco.ID, banco.TITULO};
        //avisa o bd que haverá leitura
        db = banco.getReadableDatabase();
        //cursor recebe busca de todos os dados da tabela livro
        //o numero de parâmetros nulos nos diz que não temos uma busca específica no banco
        cursor = db.query(banco.TABELA, campos,
                null,
                null,
                null,
                null,
                null,
                null);
        //se há valores a serem retomados cursor não é nulo
        if (cursor!=null){
            //quando não nulo então apontar para o primeiro dado da tabela
            cursor.moveToFirst();
        }//encerra conexão
        db.close();
        //retorna dados
        return cursor;
    }
}
