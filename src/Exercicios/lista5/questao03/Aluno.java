package Exercicios.lista5.questao03;

public class Aluno {
    private String nome;
    private int matricula;
    private Turma turma;

    public void definirNome(String nome) {
        this.nome = nome;
    }

    public String obterNome() {
        return nome;
    }

    public void definirMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int obterMatricula() {
        return matricula;
    }

    public void definirTurma(Turma turma) {
        this.turma = turma;
    }

    public Turma obterTurma() {
        return turma;
    }

    @Override
    public String toString() {
        return "nome: " + nome + ", matricula: " + matricula + ", turma: " + turma;
    }
}
