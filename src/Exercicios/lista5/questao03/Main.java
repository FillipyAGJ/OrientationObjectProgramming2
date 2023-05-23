package Exercicios.lista5.questao03;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        // DEFININDO PROFESSORES

        Professor professor = new Professor();
        professor.definirNome("Gustavo");
        professor.definirTitulacao("Programação Orientada a Objetos");

        Professor professor2 = new Professor();
        professor2.definirNome("Felipe");
        professor2.definirTitulacao("Analise e Projeto de Sistemas");

        Professor professor3 = new Professor();
        professor3.definirNome("Diogenes");
        professor3.definirTitulacao("Administração de Serviços");

        Professor[] professores = new Professor[3];
        professores[0] = professor;
        professores[1] = professor2;
        professores[2] = professor3;

        // DEFININDO ALUNOS

        Aluno aluno = new Aluno();
        aluno.definirNome("Fillipy");
        aluno.definirMatricula(154601);

        Aluno aluno2 = new Aluno();
        aluno2.definirNome("Micaelly");
        aluno2.definirMatricula(654567);

        Aluno aluno3 = new Aluno();
        aluno3.definirNome("Kristyan");
        aluno3.definirMatricula(564564);

        Aluno[] alunos = new Aluno[3];
        alunos[0] = aluno;
        alunos[1] = aluno2;
        alunos[2] = aluno3;

        Turma turma = new Turma();
        turma.definirCodigo("TSI3N");
        turma.definirSala("laboratório 8");
        turma.definirHora(LocalTime.of(18,30));
        turma.definirAbertura(true);
        turma.definirAlunos(alunos);
        turma.definirProfessores(professores);

        Turma[] turmas = new Turma[1];
        turmas[0] = turma;

        professor.definirTurmas(turmas);
        professor2.definirTurmas(turmas);
        professor3.definirTurmas(turmas);

        aluno.definirTurma(turma);
        aluno2.definirTurma(turma);
        aluno3.definirTurma(turma);

        System.out.println(aluno.toString());
        System.out.println(professor.toString());
        System.out.println(turma.toString());
    }
}
