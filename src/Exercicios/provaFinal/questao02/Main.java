package Exercicios.provaFinal.questao02;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Fernando");
        pessoa.setAltura(1.82);
        pessoa.setIdade(42);
        pessoa.setPeso(83.6);
        pessoa.setSexo("Masculino");

        pessoa.toString();
        pessoa.IMC();
    }
}
