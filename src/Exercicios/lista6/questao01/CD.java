package Exercicios.lista6.questao01;

import java.util.Scanner;

public class CD extends Midia{
    Scanner scan = new Scanner(System.in);
    private int nMusicas;
    public CD() {}
    public CD(int codigo, double preco, String nome, int m) {
        super(codigo, preco, nome);
        this.nMusicas = m;
    }

    @Override
    public String getTipo() {
        return "CD";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes();
    }

    public void setnMusicas(int nMusicas) {
        this.nMusicas = nMusicas;
    }

    @Override
    public void inserirDados() {
        super.inserirDados();
        System.out.println("Digite o número de músicas: ");
        this.nMusicas = scan.nextInt();
    }

    @Override
    public void printDados() {
        super.printDados();
    }
}
