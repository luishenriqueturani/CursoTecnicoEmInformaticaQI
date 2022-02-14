package com.example.alunos.biblioteca_de_jogos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CriaBanco extends SQLiteOpenHelper{
    private static final String NOME_BANCO= "biblioteca_de_jogos.db";
    static final String TABELA="jogos";
    static final String ID = "_id";
    static final String NOME = "nome";
    static final String PRECO = "preco";
    static final String GENERO = "genero";
    static final String PLATAFORMA = "plataforma";
    static final String CLASSIFICACAO = "classificacao_etaria";
    private static final int VERSAO = 1;



    public CriaBanco(Context context){
        super(context,NOME_BANCO, null,VERSAO);
    }

    public void onCreate(SQLiteDatabase sqLiteDatabase){
        String sql = "CREATE TABLE "+TABELA+" ("+
                ID+" INT(11),"+
                NOME+" VARCHAR(50),"+
                PRECO+" FLOAT(10.2),"+
                GENERO+" VARCHAR(50),"+
                PLATAFORMA+" VARCHAR(50),"+
                CLASSIFICACAO+" VARCHAR(50),"+
                " PRIMARY KEY("+ID+"))";
        sqLiteDatabase.execSQL(sql);
    }

    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1){
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABELA);
        onCreate(sqLiteDatabase);
    }

    public static String getID() {
        return ID;
    }

    public static String getNOME() {
        return NOME;
    }

    public static String getPRECO() {
        return PRECO;
    }

    public static String getGENERO() {
        return GENERO;
    }

    public static String getPLATAFORMA() {
        return PLATAFORMA;
    }

    public static String getCLASSIFICACAO() {
        return CLASSIFICACAO;
    }
}
