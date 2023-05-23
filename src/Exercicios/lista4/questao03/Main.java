package Exercicios.lista4.questao03;

public class Main {
    public static void main(String[] args) {

        Conta contaFulano = new Conta();
        contaFulano.setNome("Fulano");
        contaFulano.setNumero(123);
        contaFulano.setSaldo(1800);
        contaFulano.setLimite(4000);

        Conta contaCiclano = new Conta(124, 2500, 4000, "Ciclano");
        System.out.println(contaCiclano.getSaldo());

        contaFulano.Saca(500);
        contaFulano.depositar(300);
        contaFulano.transferir(contaCiclano, 1500);

        System.out.println("valor final: " + contaFulano.getSaldo());
        System.out.println("valor final: " + contaCiclano.getSaldo());

    }
}
