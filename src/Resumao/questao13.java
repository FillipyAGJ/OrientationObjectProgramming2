package Resumao;

import java.util.Scanner;

public class questao13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento");
        verificaIdade(scanner.nextInt());
    }

    public static void verificaIdade(int ano) {
        ano -= 2023;

        if(ano >= 18) {
            System.out.println("Você poderá votar este ano");
        } else {
            System.out.println("Você não pode votar esse ano");
        }
    }
}
