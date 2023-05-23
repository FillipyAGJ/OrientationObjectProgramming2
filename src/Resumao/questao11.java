package Resumao;

import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de maças compradas: ");
        float numMacas = scanner.nextInt();

        valorTotalCompra(numMacas);
    }

    public static void valorTotalCompra(float numMacas) {
        float total;
        if(numMacas >= 12) {
            total = numMacas * 1F;
            System.out.println("O valor final da compra é: " + total);
        } else {
            total = numMacas * 1.3F;
            System.out.println("O valor final da compra é: " + total);
        }
    }
}
