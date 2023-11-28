package Exercicios.lista09.questao02;

public class NotaFiscalMain {
    public static void main(String[] args) {

        Pagamento pagamentoDinheiro = new PagamentoEmDinheiro(25,30);
        NotaFiscal notaFiscal = new NotaFiscal(5465, "referente ao mês de maio", pagamentoDinheiro);

        Pagamento pagamentoCartao = new PagamentoEmCartao(35.90, "Visa", 654654);
        NotaFiscal notaFiscal2 = new NotaFiscal(5465, "referente ao mês de maio", pagamentoCartao);

        notaFiscal.imprimirNota();

        notaFiscal2.imprimirNota();
    }
}
