package Exercicios.lista2;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quatro palavras:");
        String palavra = "", frase = "";

        for (int i = 0; i<4; i++) {
            palavra = scan.nextLine();
            frase += (" " + palavra);
        }

        System.out.println("As palavras unidas possui: \n" + frase);

    }
}
