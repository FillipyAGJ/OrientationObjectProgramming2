package Exercicios.questaodaxuxu;

import java.util.Scanner;

public class questao05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String cpf;
        do {
            System.out.println("CPF (com pontos/hífen)");
            cpf = scan.nextLine();
        } while (cpf.length() != 14);

        String cpfNumeros = cpf.replace("-", "");
        cpfNumeros = cpfNumeros.replace(".", "");

        System.out.println(cpfNumeros);
    }
}
