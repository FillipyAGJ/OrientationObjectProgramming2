package Exercicios.ListaDeExemplo;

public class questaoDeExemplo {
    public static int multiplicar (int valor1, int valor2) {
        return valor1 * valor2;
    }

    public static int multiplicar (int valor1, int valor2, int valor3) {
        return multiplicar(valor1, valor2) * valor3;
    }
}
