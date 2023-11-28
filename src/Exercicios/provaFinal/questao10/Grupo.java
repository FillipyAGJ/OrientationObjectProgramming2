package Exercicios.provaFinal.questao10;

import java.util.ArrayList;

public class Grupo {
    private String nome;
    private ArrayList<Selecao> selecoes;
    private int rodada;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Selecao> getSelecoes() {
        return selecoes;
    }

    public void setSelecoes(ArrayList<Selecao> selecoes) {
        this.selecoes = selecoes;
    }

    public int getRodada() {
        return rodada;
    }

    public void setRodada(int rodada) {
        this.rodada = rodada;
    }
}
