package Resumao;

import java.util.Scanner;

public class questao25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A, B, C;

        System.out.println("Digite o primeiro valor: ");
        A = scan.nextInt();

        System.out.println("Digite o segundo valor: ");
        B = scan.nextInt();

        System.out.println("Digite o terceiro valor: ");
        C = scan.nextInt();

        if ( A < ( B + C)) {
            System.out.println("Os valores passados formam um triangulo");
        } else if ( B < (A + C)) {
            System.out.println("Os valores passados formam um triangulo");
        } else if ( C < ( A + B)) {
            System.out.println("Os valores passados formam um triangulo");
        } else {
            System.out.println("Não formam um triangulo");
        }
    }
}
