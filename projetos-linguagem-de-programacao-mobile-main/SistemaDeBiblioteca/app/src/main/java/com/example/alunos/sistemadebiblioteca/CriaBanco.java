package com.example.alunos.sistemadebiblioteca;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CriaBanco extends SQLiteOpenHelper{

    private static final String NOME_BANCO="banco.db";
    static final String TABELA="livro";
    static final String AUTOR="autor";
    static final String EDITORA="editora";
    static final String TITULO="titulo";
    static final String ID="_id";
    private static final  int VERSAO=1;

    public CriaBanco(Context context){
        super(context, NOME_BANCO,null, VERSAO);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "CREATE TABLE "+TABELA+" ("+ID+" INT(11),"+TITULO+" VARCHAR(50),"+AUTOR+" VARCHAR(50),"
                +EDITORA+" VARCHAR(50),"+" PRIMARY KEY ("+ID+"))";
        sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        //se a tabela não existe, ele cria. Se existe ele dá um upgrade.
        sqLiteDatabase.execSQL("DROP TABLE IF"+
            " EXISTS "+TABELA);
        onCreate(sqLiteDatabase);
    }
}
