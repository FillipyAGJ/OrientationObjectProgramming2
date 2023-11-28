package Exercicios.provaFinal.questao05;

import java.util.Date;

public class Multa {
    private int valor;
    private int data_multa;
    private Status status;
    private Emprestimo emprestimo;

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getData_multa() {
        return data_multa;
    }

    public void setData_multa(int data_multa) {
        this.data_multa = data_multa;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
