package Resumao;

import java.util.Scanner;

public class questao44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N;
        System.out.println("Digite um número maior que zero");
        N = scan.nextInt();
        
        for (int i = 0; i<= N; i++) {
            System.out.println(i);
        }
    }
}
