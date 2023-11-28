package Exercicios.lista09.questao01;

public class EstudoDirigido extends Avaliacao{
    private String tema;
    private int numeroDePaginas;

    public EstudoDirigido(String nome, double nota, int numPaginas, String tema) {
        super(nome, nota);
        this.tema = tema;
        this.numeroDePaginas = numPaginas;
    }
}
