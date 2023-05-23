package Exercicios.lista3.questao02;

import java.util.ArrayList;

public class Exemplar {
    private int codigo;
    private boolean cativa;
    private boolean emprestada;
    private Livro livro;
    private ArrayList<Emprestimo> emprestimo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isCativa() {
        return cativa;
    }

    public void setCativa(boolean cativa) {
        this.cativa = cativa;
    }

    public boolean isEmprestada() {
        return emprestada;
    }

    public void setEmprestada(boolean emprestada) {
        this.emprestada = emprestada;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public ArrayList<Emprestimo> getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(ArrayList<Emprestimo> emprestimo) {
        this.emprestimo = emprestimo;
    }

    @Override
    public String toString() {
        return "codigo: " + this.codigo + ", cativa: " + this.cativa + ", emprestado: " + this.emprestada + ", livro: " + this.livro + ", emprestimo: " + this.emprestimo;
    }
}
