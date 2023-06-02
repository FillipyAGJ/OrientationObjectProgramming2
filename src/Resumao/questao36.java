package Resumao;

import java.util.Scanner;

public class questao36 {
    public static void main(String[] args) {
        float valor, valor2;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        valor = scan.nextFloat();
        
        System.out.println("Digite o valor segundo valor: ");
        valor2 = scan.nextFloat();
        
        while(valor2 == 0) {
            System.out.println("Digite o valor segundo valor: ");
            valor2 = scan.nextFloat();
        };
    
        System.out.println(valor / valor2);
    }
}
