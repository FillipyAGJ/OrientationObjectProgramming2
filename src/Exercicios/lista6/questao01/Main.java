package Exercicios.lista6.questao01;

public class Main {
    public static void main(String[] args) {
        Midia midia = new Midia(123, 15.99, "vídeo cassette");
        midia.getTipo();
        midia.printDados();

        Midia midia2 = new Midia();
        midia2.getTipo();
        midia2.inserirDados();
        midia2.printDados();

        DVD dvd = new DVD(124, 20.30, "Carros", 10);
        dvd.getTipo();
        dvd.printDados();

        DVD dvd2 = new DVD();
        dvd2.inserirDados();
        dvd.getTipo();
        dvd2.printDados();

        CD cd = new CD(125, 16.90, "Linkin Park", 15);
        cd.getTipo();
        cd.printDados();

        CD cd2 = new CD();
        cd2.inserirDados();
        cd2.getTipo();
        cd2.printDados();
    }
}
