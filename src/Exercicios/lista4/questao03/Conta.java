package Exercicios.lista4.questao03;

public class Conta {
    public int numero;
    public double saldo;
    public double limite;
    public String nome;

    public Conta() {}
    public Conta(int numero, double saldo, double limite, String nome) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.nome = nome;
    }
    public boolean Saca(double valor) {
        if (valor <= saldo && valor <= limite) {
            this.saldo -= valor;
            this.limite -= valor;
            return true;
        } else {
            return false;
        }
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(Conta destino, double valor) {
        if(valor <= this.saldo && valor <= limite) {
            this.saldo -= valor;
            destino.saldo += valor;
            limite -= valor;
        } else {
            System.out.println("não foi possível realizar uma transferência.");
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
