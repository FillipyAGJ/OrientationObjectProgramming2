package Resumao;

import java.util.Scanner;

public class questao16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a hora de início e fim de uma partida de xadrez respectivamente.");
        int horaInicio = scanner.nextInt();
        int horaFim = scanner.nextInt();

        if (horaFim > horaInicio) {
            System.out.println("O jogo terá " + (horaFim - horaInicio) + " horas");
        } else if (horaFim < horaInicio) {
            horaInicio = 24 - horaInicio;
            System.out.println("O jogo terá " + (horaInicio + horaFim) + " horas");
        } else {
            System.out.println("O jogo terá 24 horas");
        }
    }
}
