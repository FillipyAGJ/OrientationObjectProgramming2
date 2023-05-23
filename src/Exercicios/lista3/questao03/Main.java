package Exercicios.lista3.questao03;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCidade("Gama");
        endereco.setCep("72410800");
        endereco.setComplemento("perto da força nacional");
        endereco.setLogradouro("quadra 13 conjunto I");
        endereco.setNumero(25);

        Contato contato = new Contato();
        contato.setEndereco(endereco);
        contato.setDescricao("email do fofoqueiro");
        contato.setEmail("fofoqueiro@gmail.com");
        contato.setTelefone("3030-5640");

        Pessoa pessoa = new Pessoa();
        pessoa.setContato(contato);
        pessoa.setNome("Nivaldencio");
        pessoa.setSobrenome("Braço forte");
        pessoa.setDataDeNascimento(new Date(2004, 03,25));

        pessoa.toString();
        contato.toString();
        endereco.toString();
    }
}
