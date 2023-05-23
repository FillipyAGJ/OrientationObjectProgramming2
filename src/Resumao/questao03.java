package Resumao;

import java.util.Scanner;

public class questao03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor em dólar para ser convertido para real.");
        float dolar = scan.nextFloat();
        converteParaReal(dolar);
    }

    public static void converteParaReal(float dolar) {
        float total = dolar * 4.05F;
        System.out.println("O valor convertido é " + total + " reais");
    }
}
