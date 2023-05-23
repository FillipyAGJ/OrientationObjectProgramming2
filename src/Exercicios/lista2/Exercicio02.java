package Exercicios.lista2;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor = 0;
        int contadorPositivo = 0, contadorNegativo = 0;

        System.out.println("Digite 10 valores reais.");
        for (int i = 0; i < 3; i++) {
            valor = scan.nextInt();

            if (valor > 0) {
                contadorPositivo++;
            } else {
                contadorNegativo++;
            }
        }
        System.out.println(contadorPositivo + " é (são) positivo(s), " + contadorNegativo + " é (são) negativo(s).");
    }
}
