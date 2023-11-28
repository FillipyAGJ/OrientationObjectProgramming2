package Exercicios.lista09.questao02;

public abstract class Pagamento {
    private double valor;

    public Pagamento() {}
    public Pagamento(double valor) {
        this.valor = valor;
    }
    public abstract String imprimir();

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
