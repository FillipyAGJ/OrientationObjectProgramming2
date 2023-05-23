package Exercicios.lista3.questao01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");

        Livro livro = new Livro();
        livro.setAutor("Machado de Assis");
        livro.setTitulo("Dom Casmurro");
        livro.setId(1);
        livro.setEmprestado(true);

        Pessoa pessoa = new Pessoa();
        pessoa.setId(1);
        pessoa.setNome("Fernando");

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setId(1);
        emprestimo.setPessoa(pessoa);
        emprestimo.setLivro(livro);
        emprestimo.setDataEmprestimo(new Date(2023, 04,15));
        emprestimo.setDataDevolucao(new Date(2023, 05, 05));

        System.out.println(emprestimo.getPessoa().imprimeDados());
        System.out.println(emprestimo.getLivro().imprimeDados());
        System.out.println(emprestimo.imprimeDados());

        System.out.println("Data de emprestimo: " +
                emprestimo.getDataEmprestimo().getDay() + "/" +
                emprestimo.getDataEmprestimo().getMonth() + "/" +
                emprestimo.getDataEmprestimo().getYear()
        );
        System.out.println("Data de devolução: " +
                emprestimo.getDataDevolucao().getDay() + "/" +
                emprestimo.getDataDevolucao().getMonth() + "/" +
                emprestimo.getDataDevolucao().getYear()
        );
    }
}
