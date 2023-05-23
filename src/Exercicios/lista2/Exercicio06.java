package Exercicios.lista2;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contadorPar = 0;
        int contadorImpar = 0;

        System.out.println("Digite 10 valores aleatórios: ");
        int valores;

        for (int i = 0; i < 10; i++) {
            valores = scan.nextInt();
            if (valores % 2 == 0) {
                contadorPar++;
            } else {
                contadorImpar++;
            }
        }

        System.out.println(contadorPar + " valores são pares e " + contadorImpar + " são ímpares.");
    }
}
