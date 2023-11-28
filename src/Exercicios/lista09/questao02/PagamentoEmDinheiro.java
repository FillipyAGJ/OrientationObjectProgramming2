package Exercicios.lista09.questao02;

public class PagamentoEmDinheiro extends Pagamento {
    private double valorRecebido;
    private double troco;

    public PagamentoEmDinheiro() {}
    public PagamentoEmDinheiro(double valor, double valorRecebido) {
        super(valor);
        this.valorRecebido = valorRecebido;

        if (valor < valorRecebido) {
            this.troco = valor - valorRecebido;
        }
    }
    @Override
    public String imprimir() {
        return "Valor da compra: " + this.getValor() + ", valor do pagamento: " + valorRecebido + ", troco a receber: " + troco;
    }

    public double getValorRecebido() {
        return valorRecebido;
    }

    public void setValorRecebido(double valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    public double getTroco() {
        return troco;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }
}
