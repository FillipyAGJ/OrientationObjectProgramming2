package lista14.questao02;

public class Subtracao implements OperacaoMatematica {
    public Subtracao() {}

    public Subtracao(int a, int b) {
        System.out.println(calcula(a, b));
    }
    public int calcula(int a, int b) {
        return a - b;
    }
}
