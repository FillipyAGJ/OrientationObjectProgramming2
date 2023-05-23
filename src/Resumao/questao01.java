package Resumao;

import java.util.Scanner;

public class questao01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 3 valores: ");
        int lado  = 0;
        int total = 0;

        for (int i = 0; i < 3; i++) {
            lado = scan.nextInt();
            total += lado;
        }
        System.out.println("O perímetro do triângulo é: " + total);
    }
}
