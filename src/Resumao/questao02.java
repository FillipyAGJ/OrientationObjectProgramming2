package Resumao;

import java.util.Scanner;

public class questao02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite hora, minutos e segundos, respectivamente: ");

        int hora = scan.nextInt();
        int minutos = scan.nextInt();
        int segundos = scan.nextInt();

        retornaSegundos(hora, minutos, segundos);
    }

    public static void retornaSegundos(int horas, int minutos, int segundos) {
        int total;
        total = horas * 3600;
        total += (minutos * 60);
        total += segundos;

        System.out.println("O horário digitado em segundos é: " + total);
    }
}

