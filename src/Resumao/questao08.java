package Resumao;

import java.util.Scanner;

public class questao08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        float n1 = scan.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float n2 = scan.nextFloat();
        System.out.println("Digite a terceira nota: ");
        float n3 = scan.nextFloat();

        calculaMedia(n1, n2, n3);
    }

    public static void calculaMedia(float n1, float n2, float n3) {
        float media = (n1 * 2 + n2 * 3 + n3 * 5) / (2 + 3 + 5);

        System.out.println("A média do aluno é: " + media);
    }

}
