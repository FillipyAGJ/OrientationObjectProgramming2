package Resumao;

import java.util.Scanner;

public class questao24 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int[] valores = new int[3];
        int aux = 0;

        for(int i = 0; i< valores.length; i++){
            System.out.println("Digite 3 valores em sequência:");
            valores[i] = scan.nextInt();
        }
        System.out.println(" ");

        for(int i = 0; i< valores.length; i++){
            for(int j = 0; j<(valores.length-1); j++){
                if(valores[j] > valores[j + 1]){
                    aux = valores[j];
                    valores[j] = valores[j+1];
                    valores[j+1] = aux;
                }
            }
        }
        System.out.println("Vetor organizado:");
        for(int i = 0; i<valores.length; i++){
            System.out.println(" "+valores[i]);
        }
    }
}
