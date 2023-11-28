package Exercicios.lista09.questao01;

public abstract class Avaliacao {
    private String nome;
    private double nota;

    public Avaliacao(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }
}
