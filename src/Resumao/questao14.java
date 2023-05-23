package Resumao;

import java.util.Scanner;

public class questao14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 2 valores: ");

        float valor1 = scanner.nextFloat();
        float valor2 = scanner.nextFloat();

        if( valor1 > valor2) {
            System.out.println( valor1 + " é maior");
        } else {
            System.out.println( valor2 + " é maior");
        }

        scanner.close();
    }
}
