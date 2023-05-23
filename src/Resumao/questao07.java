package Resumao;

import java.util.Scanner;

public class questao07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a temperatura em fahrenheit: ");

        float fahrenheit = scan.nextFloat();

        fahrenheitParaCelcius(fahrenheit);
    }
    public static void fahrenheitParaCelcius(float temperaturaF) {
        float celcius = (temperaturaF - 32) * 5/9;
        System.out.println("O valor em celcius é: " + celcius);
    }
}
