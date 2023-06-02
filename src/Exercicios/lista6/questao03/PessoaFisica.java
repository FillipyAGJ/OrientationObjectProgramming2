package Exercicios.lista6.questao03;

public class PessoaFisica extends Pessoa{
    private int cpf;

    public PessoaFisica() {}
    public PessoaFisica(String nome, int cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
