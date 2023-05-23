package Exercicios.lista3.questao01;

import java.util.Date;

public class Emprestimo {
    private long id;
    private Livro livro;
    private Pessoa pessoa;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String imprimeDados() {
        return "Dados do emprestimo: \nid: " + id + "\nlivro: " + livro.getTitulo() + "nome do cliente: " + pessoa.getNome();
    }
}
