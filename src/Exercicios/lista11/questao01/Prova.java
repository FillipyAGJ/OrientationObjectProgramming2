package Exercicios.lista11.questao01;

public class Prova extends Avaliacao {
    private double tempoDuracao;
    private int quantidadeDeQuestoes;
    private boolean consultaAutorizada;

    public Prova(String nome, double nota, double tempo, int qtdQuestoes, boolean consulta) {
        super(nome, nota);
        this.tempoDuracao = tempo;
        this.quantidadeDeQuestoes = qtdQuestoes;
        this.consultaAutorizada = consulta;
    }
}
