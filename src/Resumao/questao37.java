package Resumao;

import java.util.Scanner;

public class questao37 {
    public static void main(String[] args) {
        float valor, valor2;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        valor = scan.nextFloat();
        do {
            System.out.println("Digite o valor segundo valor: ");
            valor2 = scan.nextFloat();

            System.out.println("\nVALOR INVÁLIDO.\n");
        } while(valor2 == 0);
    
        System.out.println(valor / valor2);
    }
}
