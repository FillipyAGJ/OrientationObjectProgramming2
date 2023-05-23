package Exercicios.lista1;

import java.util.Scanner;

public class questao04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dois valores inteiros");

        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();

        if (valor1 > valor2) {
            System.out.println(valor2 + ", " + valor1);
        } else {
            System.out.println(valor1 + ", " + valor2);
        }
    }
}
