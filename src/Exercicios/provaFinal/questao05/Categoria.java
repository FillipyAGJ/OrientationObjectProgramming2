package Exercicios.provaFinal.questao05;

import java.util.ArrayList;

public class Categoria {
    private String nome;
    ArrayList<Livro> livros;

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
