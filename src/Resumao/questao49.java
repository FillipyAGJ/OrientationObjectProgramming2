package Resumao;

import java.util.Scanner;

public class questao49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contador = 0, valor;

        System.out.println("Digite 10 valores: ");
        while (contador < 10) {
            valor = scan.nextInt();

            if (valor < 0) {
                System.out.println(valor + " é negativo.");
            }
            contador++;
        }
    }
}
