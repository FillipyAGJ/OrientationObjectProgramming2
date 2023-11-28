package lista14.questao02;

public class Divisao implements OperacaoMatematica {
    public Divisao() {};

    public Divisao(int a, int b) {
        System.out.println(calcula(a, b));
    };

    @Override
    public int calcula(int a, int b) {
        return a / b;
    }
}
