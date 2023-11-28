package Exercicios.provaFinal.questao05;

import java.util.ArrayList;
import java.util.Date;

public class Livro {
    private String titulo;
    private String resumo;
    private int edicao;
    private int anoedicao;
    private int paginas;
    private Date ano;
    private Status status;
    private ArrayList<Exemplar> exemplares;
    private Editora editora;
    private ArrayList<Autor> autores;
    private ArrayList<Categoria> categorias;

    public ArrayList<Exemplar> getExemplares() {
        return exemplares;
    }

    public void setExemplares(ArrayList<Exemplar> exemplares) {
        this.exemplares = exemplares;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getAnoedicao() {
        return anoedicao;
    }

    public void setAnoedicao(int anoedicao) {
        this.anoedicao = anoedicao;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
