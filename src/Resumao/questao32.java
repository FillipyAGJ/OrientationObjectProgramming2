package Resumao;

import java.util.Scanner;

public class questao32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        int qtdAdquirida;
        float precoUnitario, total;

        System.out.println("Digite o nome do produto: ");
        scan.next();

        System.out.println("Digite a quantidade adquirida: ");
        qtdAdquirida = scan.nextInt();

        System.out.println("Digite o preço unitário do produto: ");
        precoUnitario = scan.nextFloat();

        total = precoUnitario * qtdAdquirida;

        if (qtdAdquirida <= 5) {
            total += total * 0.2F; 
        } else if (qtdAdquirida > 5 && qtdAdquirida <= 10) {
            total += total * 0.3F;
        } else {
            total += total * 0.5F;
        }

        System.out.println("O total a ser pago é: " + total);
    }
}
