package Exercicios.lista4.questao02;

public class Pessoa {
    private String nome;
    private String CPF;
    private Endereco endereco;

    public Pessoa() {}
    public Pessoa(String nome, String CPF, Endereco endereco) {
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "nome: " + nome + ", CPF: " + CPF + ", endereco: " + endereco;
    }
}
