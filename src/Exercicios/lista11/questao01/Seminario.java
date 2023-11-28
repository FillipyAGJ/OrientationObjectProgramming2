package Exercicios.lista11.questao01;

public class Seminario extends Avaliacao {
    private String tema;
    private double tempoDuracao;

    public Seminario(String nome, double nota, double tempo, String tema) {
        super(nome, nota);
        this.tema = tema;
        this.tempoDuracao = tempo;
    }
}
