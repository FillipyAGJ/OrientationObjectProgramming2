package exerciciosProfessor.Aula03.ClienteEndereco.main;

import exerciciosProfessor.Aula03.ClienteEndereco.model.Cliente;
import exerciciosProfessor.Aula03.ClienteEndereco.model.Endereco;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nome = "Gustavo";
        cliente.data = "01/01/2000";

        cliente.endereco = new Endereco();
        cliente.endereco.numero = 100;
        cliente.endereco.cep = "70.165.056";
        cliente.endereco.cidade = "Brasilia";
        cliente.endereco.logradouro = "SCAN 610";

        System.out.println(cliente.nome);
        System.out.println(cliente.endereco.logradouro);
        System.out.println(cliente.endereco.numero);
    }
}
