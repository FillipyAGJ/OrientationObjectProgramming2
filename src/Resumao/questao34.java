package Resumao;

import java.util.Scanner;

public class questao34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int codigoEmpregado, anoDeNascimento, anoDeIngresso;

        System.out.println("Digite o seu código de cliente: ");
        codigoEmpregado = scan.nextInt();

        System.out.println("Digite o seu ano de nascimento: ");
        anoDeNascimento = scan.nextInt();

        System.out.println("Digite seu ano de ingresso na empresa: ");
        anoDeIngresso = scan.nextInt();

        anoDeNascimento = 2023 - anoDeNascimento;
        anoDeIngresso = 2023 - anoDeIngresso;

        System.out.println("Código: " + codigoEmpregado + "\nIdade: " + anoDeNascimento + "\nTempo de trabalho: " + anoDeIngresso);
        
        if(anoDeNascimento > 65) {
            System.out.println("Requerer Aposentadoria");
        } else if (anoDeIngresso >= 30) {
            System.out.println("Requerer Aposentadoria");
        } else if (anoDeNascimento >= 60 && anoDeIngresso >= 25){
            System.out.println("Requerer Aposentadoria");
        } else {
            System.out.println("Não requerer.");
        }
    }
}
