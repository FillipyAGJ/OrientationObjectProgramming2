package Resumao;

import java.util.Scanner;

public class questao33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float nota, nota2, nota3, mediaExercicios, mediaAproveitamento;

        System.out.println("Digite a primeira nota: ");
        nota = scan.nextFloat();

        System.out.println("Digite a segunda nota: ");
        nota2 = scan.nextFloat();

        System.out.println("Digite a terceira nota: ");
        nota3 = scan.nextFloat();

        System.out.println("Digite a media dos exercícios: ");
        mediaExercicios = scan.nextFloat();

        mediaAproveitamento = (nota + nota2 * 2 + nota3 * 3 + mediaExercicios) / 6;

        if (mediaAproveitamento >= 9) {
            System.out.println("Sua nota é: " + mediaAproveitamento + " e no conceito é A.");
        } else if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9) {
            System.out.println("Sua nota é: " + mediaAproveitamento + " e no conceito é B.");
        } else if (mediaAproveitamento >= 6 && mediaAproveitamento < 7.5) {
            System.out.println("Sua nota é: " + mediaAproveitamento + " e no conceito é C.");
        } else {
            System.out.println("Sua nota é: " + mediaAproveitamento + " e no conceito é D.");
        }
    }
}
