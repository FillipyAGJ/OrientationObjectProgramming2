package Resumao;

import java.util.Scanner;

public class questao30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float valorCompra, kgMorango, kgMaca;

        System.out.println("Digite quantos kg's de morango quer comprar: ");
        kgMorango = scanner.nextFloat();

        System.out.println("Digite quantos kg's de maça quer comprar: ");
        kgMaca = scanner.nextFloat();

        if (kgMaca > 5) {
            valorCompra = kgMaca * 1.5F;
        } else {
            valorCompra = kgMaca * 1.8F;
        }

        if (kgMorango > 5) {
            valorCompra += kgMorango * 2.2F;
        } else {
            valorCompra += kgMorango * 2.5F;
        }

        if( valorCompra > 25.0F || (kgMaca + kgMorango) > 8) {
            valorCompra -= valorCompra * 0.1;
        }

        System.out.println("O Valor total da compra é: " + valorCompra);
    }
}
