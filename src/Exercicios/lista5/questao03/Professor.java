package Exercicios.lista5.questao03;

public class Professor {
    private String nome;
    private String titulacao;
    private Turma[] turmas;

    public void definirNome(String nome) {
        this.nome = nome;
    }

    public String obterNome() {
        return nome;
    }

    public void definirTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String obterTitulacao() {
        return titulacao;
    }

    public void definirTurmas(Turma[] turmas) {
        this.turmas = turmas;
    }

    public Turma[] obterTurmas() {
        return turmas;
    }

    @Override
    public String toString() {
        return "nome: " + nome + ", titulação: " + titulacao + ", turmas: " + turmas;
    }
}
