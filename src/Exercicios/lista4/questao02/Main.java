package Exercicios.lista4.questao02;

public class Main {
    public static void main(String[] args) {

        Endereco enderecoPessoa1 = new Endereco();
        enderecoPessoa1.setCidade("Gama");
        enderecoPessoa1.setCep("72580-987");
        enderecoPessoa1.setBairro("sul");
        enderecoPessoa1.setNumero(40);
        enderecoPessoa1.setLogradouro("quadra 28 conjunto H");
        enderecoPessoa1.setComplemento("perto da farmácia");

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Everson Zoio");
        pessoa1.setCPF("445.487.789-98");
        pessoa1.setEndereco(enderecoPessoa1);

        // String logradouro, int numero, String complemento, String bairro, String cidade, String cep
        Endereco enderecoPessoa2 = new Endereco("quadra 14", 56, "perto da parada", "setor leste", "gama", "78942-877");
        Pessoa pessoa2 = new Pessoa("Leandro Futanari", "467.879.247-98", enderecoPessoa2);

        pessoa1.toString();
        enderecoPessoa1.toString();
        pessoa2.toString();
        enderecoPessoa2.toString();

    }
}
