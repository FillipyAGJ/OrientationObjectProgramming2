package Exercicios.lista5.questao03;

import java.time.LocalTime;

public class Turma {
    private String codigo;
    private String sala;
    private LocalTime hora;
    private Aluno[] alunos;
    private Professor[] professores;
    private boolean aberto;

    public boolean estaAberta() {
        return aberto;
    }

    public void definirAbertura(boolean aberto) {
        this.aberto = aberto;
    }

    public void definirCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String obterCodigo() {
        return codigo;
    }

    public void definirSala(String sala) {
        this.sala = sala;
    }

    public String obterSala() {
        return sala;
    }

    public void definirHora(LocalTime hora) {
        this.hora = hora;
    }

    public LocalTime obterHora() {
        return hora;
    }

    public void definirAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Aluno[] obterAlunos() {
        return alunos;
    }

    public void definirProfessores(Professor[] professores) {
        this.professores = professores;
    }

    public Professor[] obterProfessores() {
        return professores;
    }

    @Override
    public String toString() {
        return "codigo: " + codigo + ", sala: " + sala + ", horario: " + hora + ", alunos: " + alunos + ", professores: " + professores + ", aberto: "+ aberto;
    }
}
