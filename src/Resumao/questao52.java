package Resumao;

import java.util.Scanner;

public class questao52 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float valor, media = 0;

        System.out.println("Digite 10 valores: ");
        for (int i = 0; i< 10; i++) {
            valor = scan.nextFloat();
            media += valor;
        }

        media /= 10;
        System.out.println("A média é: " + media);
    }
}
