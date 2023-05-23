package Resumao;

import java.util.Scanner;

public class questao19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeroConta = 0;
        float saldo, debito, credito;

        System.out.println("Digite o número da sua conta: ");
        numeroConta = scan.nextInt();

        System.out.println("Digite o saldo da sua conta: ");
        saldo = scan.nextFloat();

        System.out.println("Digite o credito da conta: ");
        credito = scan.nextFloat();

        System.out.println("Digite o debito da conta: ");
        debito = scan.nextFloat();

        System.out.println("Número da conta: " + numeroConta + " Saldo atual: " + (saldo - debito + credito));

        if(saldo >= 0) {
            System.out.println("Saldo positivo.");
        } else {
            System.out.println("Saldo negativo");
        }
    }
}
