package Exercicios.lista2;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Para sair digite 0");
        int idade = 1;
        int contador = 0;
        int total = 0;

        System.out.println("Digite a quantidade de repetições: ");
        int limite = scan.nextInt();

        while (contador < limite) {
            System.out.println("Digite uma idade: ");
            idade = scan.nextInt();

            total += idade;

            contador++;
        }

        total = (total / limite);
        System.out.println("A média entre as idade é: "+ total);
    }
}
