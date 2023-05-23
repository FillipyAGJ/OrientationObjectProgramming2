package Exercicios.lista3.questao02;

import java.util.ArrayList;
import java.util.Date;

public class Livro {
    private String titulo;
    private String autor;
    private Date ano;
    private int edicao;
    private String editora;
    private String ISBN;
    private ArrayList<Exemplar> exemplar;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public ArrayList<Exemplar> getExemplar() {
        return exemplar;
    }

    public void setExemplar(ArrayList<Exemplar> exemplar) {
        this.exemplar = exemplar;
    }

    @Override
    public String toString() {
        return "titulo: " + this.titulo + ", autor: " + this.autor + ", ano: " + this.ano + ", edição: " + this.edicao + ", editora: " + this.editora + ", ISBN: " + this.ISBN + ", exemplares: " + this.exemplar;
    }
}
