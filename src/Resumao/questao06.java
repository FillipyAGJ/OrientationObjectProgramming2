package Resumao;

import java.util.Scanner;

public class questao06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o salário fixo");
        float salarioFixo = scan.nextFloat();

        System.out.println("Digite o valor da venda: ");
        float valorVenda = scan.nextFloat();

        System.out.println("Digite o número de vendas: ");
        float numVendas = scan.nextFloat();

        salarioTotal(salarioFixo, valorVenda, numVendas);
    }

    public static void salarioTotal(float salarioFixo, float valorVenda, float numVendas) {
        float beneficioVenda = 0.05F;
        float salarioFinal;
        salarioFinal = ((valorVenda * beneficioVenda) * numVendas + salarioFixo);

        System.out.println("O salário final do vendedor é: " + salarioFinal);
    }
}
