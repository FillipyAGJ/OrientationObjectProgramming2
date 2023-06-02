package Resumao;

import java.util.Scanner;

public class questao22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor, valor2, valor3;

        System.out.println("Digite o primeiro valor:");
        valor = scan.nextInt();
        System.out.println("Digite o segundo valor:");
        valor2 = scan.nextInt();
        System.out.println("Digite o terceiro valor:");
        valor3 = scan.nextInt();

        if (valor > valor2 && valor > valor3) {
            System.out.println(valor + " é o maior valor");
        } else if (valor2 > valor && valor2 > valor3) {
            System.out.println(valor2 + " é o maior valor");
        } else if (valor3 > valor && valor3 > valor2) {
            System.out.println(valor3 + " é o maior valor");
        }

    }
}
