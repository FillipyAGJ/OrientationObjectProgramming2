package lista14.questao02;

public class OperacaoMatematicaMain {
    public static void main(String[] args) {

        Soma soma = new Soma(10, 2);
        Subtracao subtracao = new Subtracao(10, 5);
        Multiplicacao multiplicacao = new Multiplicacao(2,2);
        Divisao divisao = new Divisao(10,2);

        soma.calcula(5,5);
        subtracao.calcula(5,2);
        multiplicacao.calcula(5,5);
        divisao.calcula(5,2 );

    }
}
