package Resumao;

import java.util.Scanner;

public class questao45 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N;
        do {
            System.out.println("Digite um número maior que zero");
            N = scan.nextInt();
        } while (N == 0);

        for (int i = 0; i <= N; i++) {
            System.out.println(i);
        }
    }
}
