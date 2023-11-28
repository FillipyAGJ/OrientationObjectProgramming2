package Exercicios.provaFinal.questao03;

public class Main {
    public static void main(String[] args) {
        ComputadorDeMesa computadorDeMesa = new ComputadorDeMesa(
                "Dell", "i5 11800",
                "8GB de ram", "500GB SSD",
                "Oex", "ATX", "600W"
        );

        computadorDeMesa.trocarFabricanteGabinete("pichau");
        computadorDeMesa.trocarFonte("650W");
        computadorDeMesa.trocarMemoriaPrincipal("16GB de ram");
        computadorDeMesa.trocarMemoriaSecundaria("1 Tera SDD");
        computadorDeMesa.trocarProcessador("i7 12600");
        computadorDeMesa.trocarTipoGabinete("Micro ATX");

        Smartphone smartphone = new Smartphone(
                "Samsung", "SnapDragon 888",
                "8GB ram", "128GB",
                "6.5", "3840 x 2160 pixels",
                "Tim"
        );

        smartphone.trocarOperadora("Claro");
    }
}
