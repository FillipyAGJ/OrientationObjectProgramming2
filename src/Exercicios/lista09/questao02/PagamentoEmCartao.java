package Exercicios.lista09.questao02;

public class PagamentoEmCartao extends Pagamento{
    private String bandeira;
    private int numeroTransacao;

    public PagamentoEmCartao() {}
    public PagamentoEmCartao(double valor, String bandeira, int numeroTransacao) {
        super(valor);
        this.bandeira = bandeira;
        this.numeroTransacao = numeroTransacao;
    }

    @Override
    public String imprimir() {
        return "Valor da compra: " + getValor() + ", bandeira do cartão: " + bandeira + ", número da transação: " + numeroTransacao;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public int getNumeroTransacao() {
        return numeroTransacao;
    }

    public void setNumeroTransacao(int numeroTransacao) {
        this.numeroTransacao = numeroTransacao;
    }
}
