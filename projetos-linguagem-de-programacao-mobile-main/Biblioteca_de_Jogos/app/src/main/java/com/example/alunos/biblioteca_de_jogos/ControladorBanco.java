package com.example.alunos.biblioteca_de_jogos;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class ControladorBanco {
    private SQLiteDatabase db;
    private CriaBanco banco;


    public ControladorBanco (Context context){
        banco = new CriaBanco(context);
    }

    public String inserirDados(int id, String nome, float preco, String genero, String plataforma, String classificacao){
        ContentValues valores;
        long resultado;

        db = banco.getWritableDatabase();
        valores = new ContentValues();

        valores.put(CriaBanco.ID, id);
        valores.put(CriaBanco.NOME, nome);
        valores.put(CriaBanco.PRECO, preco);
        valores.put(CriaBanco.GENERO, genero);
        valores.put(CriaBanco.PLATAFORMA, plataforma);
        valores.put(CriaBanco.CLASSIFICACAO, classificacao);

        resultado = db.insert(CriaBanco.TABELA, null,valores);
        db.close();

        if (resultado== -1){
            return "Erro ao inserir!";
        }else{
            return "Inserido com sucesso!";
        }
    }

    public Cursor exibirDados(){
        Cursor cursor;
        String[] campos = {banco.ID, banco.NOME, banco.PRECO, banco.GENERO, banco.PLATAFORMA, banco.CLASSIFICACAO};

        db = banco.getReadableDatabase();

        cursor = db.query(banco.TABELA, campos, null,null, null,null,null,null);

        if (cursor!=null){
            cursor.moveToFirst();
        }

        db.close();
        return cursor;
    }

    public Cursor exibeById(int id){
        Cursor cursor;
        String[] campos = {banco.ID, banco.NOME, banco.PRECO, banco.GENERO, banco.PLATAFORMA, banco.CLASSIFICACAO};

        String where = CriaBanco.ID + " = " + id;
        db = banco.getReadableDatabase();
        cursor = db.query(CriaBanco.TABELA, campos, where, null,null,null,null,null);
        if (cursor!=null){
            cursor.moveToFirst();
        }

        db.close();
        return cursor;

    }

    public void alteraDados(int id, String nome, float preco, String genero, String plataforma, String classificacao){
        ContentValues values;
        String where;

        db = banco.getWritableDatabase();
        where = CriaBanco.ID + " = " + id;

        values = new ContentValues();
        values.put(CriaBanco.NOME, nome);
        values.put(CriaBanco.PRECO, preco);
        values.put(CriaBanco.GENERO, genero);
        values.put(CriaBanco.PLATAFORMA, plataforma);
        values.put(CriaBanco.CLASSIFICACAO, classificacao);

        db.update(CriaBanco.TABELA, values, where, null);
        db.close();
    }

    public void deletarDados(int id){
        String where = CriaBanco.ID + " = " + id;
        db = banco.getReadableDatabase();
        db.delete(CriaBanco.TABELA, where, null);
        db.close();
    }


}
