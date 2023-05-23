package Resumao;

import java.util.Scanner;

public class questao09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = scan.nextInt();

        maiorQue10(valor);
    }

    public static void maiorQue10 (int valor) {
        if (valor >= 10) {
            System.out.println("É MAIOR QUE 10!");
        } else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }
    }
}
