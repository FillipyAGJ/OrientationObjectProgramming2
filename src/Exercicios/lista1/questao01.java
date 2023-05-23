package Exercicios.lista1;

import java.util.Scanner;

public class questao01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 3 valores inteiros que serão horas, minutos, segundos");
        int horas = scan.nextInt();
        int minutos = scan.nextInt();
        int segundos = scan.nextInt();

        horas *= 3600;
        minutos *= 60;
        segundos += (horas + minutos);

        System.out.println("os horários digitados é: " + segundos + "segundos");
    }
}
//        // ------------------------- questão 02 -----------------------------------------------
//
//
//        // ------------------------- questão 03 -----------------------------------------------
//        System.out.println("Digite 3 valores:");
//        dizOMaiorValor(scan.nextInt(), scan.nextInt(), scan.nextInt());
//
//        // ------------------------- questão 04 -----------------------------------------------
//        System.out.println("Digite dois valores inteiros");
//        colocaEmOrdemCresc(scan.nextInt(), scan.nextInt());
//
//        System.out.println("Número de questão inválida.");
//
//        System.out.println("Obrigado por utilizar o programa.");


//    public static void transformaHorario(int horas, int minutos, int segundos) {
//
//    }
//
//    public static void verificaMaiorDeIdade(int idade) {
//
//    }
//
//    public static void dizOMaiorValor(int valor, int valor2, int valor3) {
//
//    }
//
//    public static void colocaEmOrdemCresc(int valor1, int valor2) {
//
//    }

