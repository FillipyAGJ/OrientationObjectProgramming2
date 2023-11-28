package lista14.questao02;

public class Soma implements OperacaoMatematica{

    public Soma() {}
    public Soma(int a, int b) {
        System.out.println(calcula(a, b));
    }
    public int calcula(int a, int b) {
        return a + b;
    }
}
