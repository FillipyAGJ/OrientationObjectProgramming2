package Resumao;

import java.util.Scanner;

public class questao21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        System.out.println("Digite um número inteiro: ");
        numero = scan.nextInt();

        if(numero > 0) {
            System.out.println("Número digitado é positvo");
        } else if (numero < 0) {
            System.out.println("Número digitado é negativo");
        } else {
            System.out.println("Número digitado é zero");
        }
    }
}
