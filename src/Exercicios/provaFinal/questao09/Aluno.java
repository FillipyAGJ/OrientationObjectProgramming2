package Exercicios.provaFinal.questao09;

import java.util.ArrayList;

public class Aluno extends Pessoa {
    private ArrayList<String> disciplinas;
    private boolean estudando;
    private Aula aula;
    public void estudar() {
        if (estudando) {
            estudando = false;
        } else {
            estudando = true;
        }
    }
    public void addDisciplina(String disciplina) {
        disciplinas.add(disciplina);
    }

    public void imprimir() {
        System.out.println("O aluno + " + getNome() + " possui estas disciplinas: ");
        for (String disciplina: disciplinas) {
            System.out.println(disciplina);
        }
        System.out.println("Estudando: " + estudando);
    }
}
