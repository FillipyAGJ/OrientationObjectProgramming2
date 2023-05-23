package Exercicios.lista3.questao03;

import java.util.Date;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private Date dataDeNascimento;
    private Contato contato;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "nome: " + nome + ", sobrenome: "+ this.sobrenome + ", data de nascimento: " + dataDeNascimento + ", contato: " + contato;
    }
}
