package com.example.alunos.sistemadebiblioteca;

public class Livro {
    private int codigo;
    private String autor;
    private String editora;
    private String titulo;

    @Override
    public String toString() {
        return "Livro{" +
                "codigo=" + codigo +
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                ", titulo='" + titulo + '\'' +
                '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
