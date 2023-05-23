package Exercicios.lista6.questao02;

public class Main {
    public static void main(String[] args) {
        Fisica fisica = new Fisica("Fillipy", "07144593137");
        Juridica juridica = new Juridica("Mercadão", "06013708000163");

        System.out.println(fisica.validarCpf("07144593137"));
        System.out.println(juridica.validarCnpj("06013708000163"));

        System.out.println(fisica.getNome());
        System.out.println(fisica.getCpf());

        System.out.println(juridica.getNome());
        System.out.println(juridica.getCnpj());
    }
}
