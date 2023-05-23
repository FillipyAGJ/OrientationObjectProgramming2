package Resumao;

import java.util.Scanner;

public class questao17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int horasTrabalhadas, mes = 160;
        double salarioTotal, salarioHora;

        System.out.println("Digite a hora do funcionário no mês");
        horasTrabalhadas = scan.nextInt();

        System.out.println("Digite o salário hora do funcionário");
        salarioHora = scan.nextFloat();

        if (horasTrabalhadas > mes) {
            salarioTotal = (salarioHora * horasTrabalhadas + ( salarioHora * 0.5));
        } else {
            salarioTotal = salarioHora * horasTrabalhadas;
        }

        System.out.println("O salário do funcionário é: " + salarioTotal);
    }
}
