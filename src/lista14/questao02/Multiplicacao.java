package lista14.questao02;

public class Multiplicacao implements OperacaoMatematica {
    public Multiplicacao() {}

    public Multiplicacao(int a, int b) {
        System.out.println(calcula(a, b));
    }

    @Override
    public int calcula(int a, int b) {
        return a * b;
    }
}
