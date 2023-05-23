package Exercicios.lista6.questao01;

import java.util.Scanner;

public class Midia {
    Scanner scan = new Scanner(System.in);
    private int codigo;
    private double preco;
    private String nome;
    public Midia() {}
    public Midia(int c, double p, String n) {
        this.codigo = c;
        this.preco = p;
        this.nome = n;
    }

    public String getTipo() {
        return "Midia";
    }

    public String getDetalhes() {
        return "Midia:\ncodigo: " + codigo + ", preço: " + preco + ", nome: " + nome;
    }

    public void printDados() {
        System.out.println(getDetalhes());
    }

    public void inserirDados() {
        System.out.println("Digite o código: ");
        this.codigo = scan.nextInt();

        System.out.println("Digite o preço: ");
        this.preco = scan.nextDouble();

        System.out.println("Digite o nome: ");
        this.nome = scan.next();
    }
}
