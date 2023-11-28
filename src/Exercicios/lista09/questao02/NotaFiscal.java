package Exercicios.lista09.questao02;

public class NotaFiscal {
    int numero;
    String resumo;
    Pagamento pagamento;

    public NotaFiscal(int numero, String resumo, Pagamento pagamento) {
        this.numero = numero;
        this.resumo = resumo;
        this.pagamento = pagamento;
    }

    public void imprimirNota() {
        System.out.println("Nota Fiscal Numero " + numero);
        System.out.println("Resumo da compra:\n" + resumo);
        System.out.println("Forma de Pagamento:"+pagamento.imprimir());
    }
}
