package Resumao;

import java.util.Scanner;

public class questao12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota da primeira e segunda avaliação respectivamente");
        calculaNota(scanner.nextFloat(), scanner.nextFloat());
    }
    public static void calculaNota(float nota1, float nota2) {
        float media = nota1 + nota2 / 2;

        if (media >= 6) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}
