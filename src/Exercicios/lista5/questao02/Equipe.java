package Exercicios.lista5.questao02;

public class Equipe {
    private int qtdDePontos = 0;
    private String nome;

    public void adicionarPontos(int quantidade) {
        this.qtdDePontos += quantidade;
    }

    public void removerPontos(int quantidade) {
        this.qtdDePontos -= quantidade;
    }

    public int getQtdDePontos() {
        return qtdDePontos;
    }

    public void setQtdDePontos(int qtdDePontos) {
        this.qtdDePontos = qtdDePontos;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
