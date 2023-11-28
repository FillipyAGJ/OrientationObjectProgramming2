package Exercicios.lista11.questao02;

public class OperacaoMatematicaMain {
    public static void main(String[] args) {

        Soma soma = new Soma();
        System.out.println(soma.calcula(10, 25));

        Subtracao subtracao = new Subtracao();
        System.out.println(subtracao.calcula(25, 10));

        Multiplicacao multiplicacao = new Multiplicacao();
        multiplicacao.calcula(25, 10);

        Divisao divisao = new Divisao();
        divisao.calcula(20, 4);
    }
}
