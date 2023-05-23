package Resumao;

import java.util.Scanner;

public class questao20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdAtualEstoque, qtdMaximaEstoque, qtdMinimaEstoque, qtdMedia;

        System.out.println("Digite a quantidade máxima no estoque: ");
        qtdMaximaEstoque = scan.nextInt();

        System.out.println("Digite a quantidade mínima no estoque: ");
        qtdMinimaEstoque = scan.nextInt();

        System.out.println("Digite a quantidade atual no estoque: ");
        qtdAtualEstoque = scan.nextInt();

        qtdMedia = (qtdMaximaEstoque + qtdMinimaEstoque /2);

        if(qtdAtualEstoque >= qtdMedia) {
            System.out.println("Não efetuar compra.");
        } else {
            System.out.println("Efetuar compra.");
        }
    }
}
