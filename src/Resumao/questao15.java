package Resumao;

import java.util.Scanner;

public class questao15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 2 valores: ");

        float valor1 = scanner.nextFloat();
        float valor2 = scanner.nextFloat();

        if( valor1 > valor2) {
            System.out.println( valor2 + ", " + valor1);
        } else {
            System.out.println( valor1 + ", " + valor2);
        }

        scanner.close();
    }
}
