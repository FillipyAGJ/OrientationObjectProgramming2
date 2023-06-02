package Resumao;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class questao28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale localeBR = new Locale("pt","BR");
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
        float litrosVendidos, valorCompra;
        String gasolina;

        System.out.println("Digite o litros vendidos: ");
        litrosVendidos = scanner.nextFloat();

        System.out.println("Digite A: para alcool, e G: para gasolina");
        gasolina = scanner.next();

        switch (gasolina) {
            case "A":
                valorCompra = litrosVendidos * 2.9F;
                System.out.println("Valor da compra é: " + dinheiro.format(valorCompra));
                break;
            case "G":
                valorCompra = litrosVendidos * 3.3F;
                System.out.println("Valor da compra é: " + dinheiro.format(valorCompra));
                break;
            default:
                System.out.println("Esta opção não existe.");
                break;
        }
    }
}
