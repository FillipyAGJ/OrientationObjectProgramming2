package Resumao;

import java.util.Scanner;

public class questao51 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor;

        System.out.println("Digite 10 valores: ");
        for (int i = 0; i < 10 ; i++) {
            valor = scan.nextInt();

            if (valor <= 20 || valor >=10) {
                System.out.println("O "+ valor +" digitado está entre 10 a 20");
            }
        }
    }
}
