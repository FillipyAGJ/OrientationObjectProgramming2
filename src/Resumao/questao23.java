package Resumao;

import java.util.Scanner;

public class questao23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor, valor2, valor3;

        System.out.println("Digite o primeiro valor:");
        valor = scan.nextInt();
        System.out.println("Digite o segundo valor:");
        valor2 = scan.nextInt();
        System.out.println("Digite o terceiro valor:");
        valor3 = scan.nextInt();

        if ((valor > valor2 && valor > valor3) && (valor2 > valor3)) {
            System.out.println("A soma dos maiores valor é " + (valor + valor2));
        } else if ((valor > valor2 && valor > valor3) && (valor2 < valor3)) {
            System.out.println("A soma dos maiores valor é " + (valor + valor3));
        } else if ((valor3 > valor && valor3 > valor2) && (valor < valor2)) {
            System.out.println("A soma dos maiores valor é " + (valor3 + valor2));
        } else if ((valor3 > valor && valor3 > valor2) && (valor > valor2)) {
            System.out.println("A soma dos maiores valor é " + (valor3 + valor));
        } else if ((valor2 > valor && valor2 > valor3) && (valor > valor3)) {
            System.out.println("A soma dos maiores valor é " + (valor2 + valor));
        } else if ((valor2 > valor && valor2 > valor3) && (valor < valor3)) {
            System.out.println("A soma dos maiores valor é " + (valor2 + valor3));
        }

    }
}
