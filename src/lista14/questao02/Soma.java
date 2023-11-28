package lista14.questao02;

// Nesta classe Soma ela está utilizando a interface OperacaoMatematica
// Ela será obrigada a implementar o método calcula e pode colocar diversos outros métodos
// o importante é que tenha o metodo calcula.
public class Soma implements OperacaoMatematica{

    public Soma() {}

    // Construtor com a chamada do método imprimindo no console.
    public Soma(int a, int b) {
        System.out.println(calcula(a, b));
    }
    
    // a execução do método fica dentro das chaves
    public int calcula(int a, int b) {
        return a + b;
    }
}
