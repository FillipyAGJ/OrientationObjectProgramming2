package Exercicios.lista2;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scan.nextLine();

        System.out.print("Digite uma palavra da frase: ");
        String palavra = scan.nextLine();

        int indice = frase.indexOf(palavra);

        if (indice >= 0) {
            System.out.println("A palavra '" + palavra + "' aparece na posição " + indice + " da frase.");
        } else {
            System.out.println("A palavra '" + palavra + "' não foi encontrada na frase.");
        }
    }
}
