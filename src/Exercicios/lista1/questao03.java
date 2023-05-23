package Exercicios.lista1;

import java.util.Scanner;

public class questao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 3 valores:");
        int valor = scanner.nextInt();
        int valor2 = scanner.nextInt();
        int valor3 = scanner.nextInt();

        if (valor > valor2 && valor > valor3) {
            System.out.println("o " + valor + " é o maior deles");
        } else if (valor2 > valor3 && valor2 > valor) {
            System.out.println("o " + valor2 + " é o maior deles");
        } else if (valor3 > valor2 && valor3 > valor) {
            System.out.println("o " + valor3 + " é o maior deles");
        }
    }
}
