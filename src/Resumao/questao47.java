package Resumao;

import java.util.Scanner;

public class questao47 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Digite 10 valores entre 1 e 10");
        do {
            num = scan.nextInt();
        } while(num > 10 || num <= 0);

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + num + " = " +(i*num));
        }
    }
}
