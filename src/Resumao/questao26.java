package Resumao;

import java.util.Scanner;

public class questao26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String time1, time2;
        int golTime1, golTime2;

        System.out.println("Digite o nome do primeiro time: ");
        time1 = scanner.next();
        System.out.println("Digite o número de gols marcados do primeiro time: ");
        golTime1 = scanner.nextInt();

        System.out.println("Digite o nome do segundo time: ");
        time2 = scanner.next();
        System.out.println("Digite o número de gols marcados do segundo time: ");
        golTime2 = scanner.nextInt();

        if (golTime1 > golTime2) {
            System.out.println(time1 + " venceu a partida com " + golTime1 + " a " + golTime2);
        } else if (golTime2 > golTime1) {
            System.out.println(time2 + " venceu a partida com " + golTime2 + " a " + golTime1);
        } else {
            System.out.println("EMPATE");
        }
    }
}
