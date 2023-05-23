package Resumao;

import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor");

        float valor = scan.nextFloat();

        positivoNegativo(valor);
    }

    public static void positivoNegativo(float valor) {
        if (valor > -1) {
            System.out.println("O número digitado é positivo");
        } else {
            System.out.println("O número digitado é negativo");
        }
    }
}
