package LivroOrientacaoAObjetos;

public class Conta {
    public Conta() {}
    public Conta(String nomeTitular, int numero, double saldo) {
        this.nomeTitular = nomeTitular;
        this.numero = numero;
        this.saldo = saldo;
    }
    private int numero;
    private String nomeTitular;
    private double saldo;

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeTitular() {
        return this.nomeTitular;
    }

    public void setNomeTitular(String nome) {
        this.nomeTitular = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar (double valor) {
        setSaldo(saldo + valor);
    }

    public void sacar (double saque) {
        if(saque >= this.saldo) {
            setSaldo(saldo - saque);
            System.out.println("Foi realizado um saque de: " + saque);
        } else {
            System.out.println("Não foi possível realizar o valor desejado.");
        }
    }
}
