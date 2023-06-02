package Resumao;

import java.util.Scanner;

public class questao27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor, valor2;

        System.out.println("Digite o primeiro valor:");
        valor = scan.nextInt();
        System.out.println("Digite o segundo valor:");
        valor2 = scan.nextInt();

        if (valor > valor2) {
            System.out.println("O primeiro é maior");
        } else if (valor2 > valor) {
            System.out.println("O segundo é maior");
        } else {
            System.out.println("Números iguais");
        }

    }
}
