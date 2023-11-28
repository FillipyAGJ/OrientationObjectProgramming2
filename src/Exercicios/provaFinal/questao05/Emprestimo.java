package Exercicios.provaFinal.questao05;

import java.util.Date;

public class Emprestimo {
    private Date data_emprestimo;
    private Date data_devolucao;
    private Date data_devoculacao_real;
    private Status status;

    private Multa multa;

    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Multa getMulta() {
        return multa;
    }

    public void setMulta(Multa multa) {
        this.multa = multa;
    }

    public Date getData_emprestimo() {
        return data_emprestimo;
    }

    public void setData_emprestimo(Date data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public Date getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(Date data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

    public Date getData_devoculacao_real() {
        return data_devoculacao_real;
    }

    public void setData_devoculacao_real(Date data_devoculacao_real) {
        this.data_devoculacao_real = data_devoculacao_real;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
