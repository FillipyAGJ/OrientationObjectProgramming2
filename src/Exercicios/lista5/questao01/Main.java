package Exercicios.lista5.questao01;

public class Main {
    public static void main(String[] args) {
        ContadorDePessoas contadorDePessoas = new ContadorDePessoas(20);
        contadorDePessoas.registraEntrada(10);
        contadorDePessoas.registraEntrada(10);
        contadorDePessoas.registraEntrada(10);
        contadorDePessoas.registraSaida(15);
        contadorDePessoas.registraEntrada(15);
        contadorDePessoas.registraSaida(15);
        contadorDePessoas.registraSaida(7);
        contadorDePessoas.mostrarRelatorio();
    }
}
