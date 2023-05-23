package Resumao;

import java.util.Scanner;

public class questao22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] valor = new int[3];
        int tamanho = valor.length;
        int maiorValor = 0;

        System.out.println("Digite 3 valores: ");
        for (int i = 0; i < valor.length; i++) {
            valor[i] = scan.nextInt();
        }

        for (int i = 0; i< valor.length; i++) {
            for (int j = 1; j < (tamanho - i) ; j++) {
                if (valor[j-1] < valor[j]) {
                    maiorValor = valor[j];
                } else {
                    maiorValor = valor[j-1];
                }
            }
        }

        System.out.println("Maior valor é: " + maiorValor);

    }
}
