package Resumao;

import java.util.Scanner;

public class questao05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do carro: ");
        float valorCarro = scan.nextFloat();

        carroValorFinal(valorCarro);
    }

    public static void carroValorFinal(float valorCarro) {
        float porcentagemDistribuidor = 0.28F;
        float impostos = 0.45F;
        float total;

        total = (valorCarro * (1 + porcentagemDistribuidor)) * (1 + impostos);

        System.out.println("Valor total do carro é " + total);
    }
}
