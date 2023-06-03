package Resumao;

import java.util.Scanner;

public class questao50 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor;

        System.out.println("Digite 10 valores: ");
        for (int i = 0; i < 10; i++) {
            valor = scan.nextInt();

            if (valor < 0) {
                System.out.println(valor + " é negativo.");
            }
        }
    }
}
