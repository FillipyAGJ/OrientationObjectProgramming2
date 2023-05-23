package Exercicios.lista6.questao01;

import java.util.Scanner;

public class DVD extends Midia {
    Scanner scan = new Scanner(System.in);
    private int nFaixas;
    public DVD() {}
    public DVD(int codigo, double preco, String nome, int nFaixas) {
        super(codigo, preco, nome);
        this.nFaixas = nFaixas;
    }

    @Override
    public String getTipo() {
        return "DVD";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() + ", nFaixas: " + nFaixas;
    }

    public void setnFaixas(int faixas) {
        this.nFaixas = faixas;
    }

    @Override
    public void printDados() {
        super.printDados();
    }

    @Override
    public void inserirDados() {
        super.inserirDados();
        System.out.println("Digite o número de faixas: ");
        this.nFaixas = scan.nextInt();
    }
}
