package Exercicios.lista3.questao02;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private int CPF;
    private String telefone;
    private String matricula;

    private ArrayList<Emprestimo> emprestimo;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public ArrayList<Emprestimo> getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(ArrayList<Emprestimo> emprestimo) {
        this.emprestimo = emprestimo;
    }

    @Override
    public String toString() {
        return "nome: " + this.nome + ", CPF: " + this.CPF + ", telefone: " + this.telefone + ", matricula: " + this.matricula + ", emprestimo: " + this.emprestimo;
    }
}
