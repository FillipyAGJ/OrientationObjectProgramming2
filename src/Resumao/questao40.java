package Resumao;

import java.util.Scanner;

public class questao40 {
    public static void main(String[] args) {
        

        
        Scanner scan = new Scanner(System.in);
        float nota, nota2, media;
        String repetir;

        do {
            do {
                System.out.println("Digite o valor da primeira avaliação: ");
                nota = scan.nextFloat();

            } while(nota > 10 || nota < 0);
        
            do {
                System.out.println("Digite o valor da segunda avaliação: ");
                nota2 = scan.nextFloat();

            } while(nota2 > 10 || nota2 < 0);

            media = (nota + nota2) /2;
            System.out.println("nota do aluno é: " + media);

            System.out.println("NOVO CÁLCULO (S/N)?");
            repetir = scan.next();

        } while(repetir.equalsIgnoreCase("S"));
    }
}
