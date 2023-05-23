package Exercicios.lista6.questao03;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Fillipy");
        System.out.println(pessoa.getNome());

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Gustavo");

        PessoaFisica pessoaFisica = new PessoaFisica("Samuel", 123455465);
        System.out.println(pessoaFisica.getNome());
        System.out.println(pessoaFisica.getCpf());

        PessoaFisica pessoaFisica1 = new PessoaFisica();
        pessoaFisica1.setNome("Tiago Lino");
        pessoaFisica1.setCpf(654897654);

        System.out.println(pessoaFisica1.getNome());
        System.out.println(pessoaFisica1.getCpf());

        PessoaJuridica pessoaJuridica = new PessoaJuridica("Serasa", 65487648);
        System.out.println(pessoaJuridica.getNome());
        System.out.println(pessoaJuridica.getCnpj());

        PessoaJuridica pessoaJuridica1 = new PessoaJuridica();
        pessoaJuridica1.setNome("chevrolet");
        pessoaJuridica1.setCnpj(65484684);

        System.out.println(pessoaJuridica1.getNome());
        System.out.println(pessoaJuridica1.getCnpj());

    }
}
