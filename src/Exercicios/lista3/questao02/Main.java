package Exercicios.lista3.questao02;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setNome("Fillipy");
        usuario.setCPF(1112223334);
        usuario.setTelefone("33334444");

        ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
        ArrayList<Exemplar> exemplares = new ArrayList<Exemplar>();

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setSituacao(1);
        emprestimo.setUsuario(usuario);
        emprestimo.setDataDeEmprestimo(new Date(2023, 04,15));
        emprestimo.setDataPrevistaDeDevolucao(new Date(2023, 04,26));
        emprestimo.setDataDeEntregaReal(new Date(2023, 04,28));

        Emprestimo emprestimo2 = new Emprestimo();
        emprestimo2.setSituacao(1);
        emprestimo2.setUsuario(usuario);
        emprestimo2.setDataDeEmprestimo(new Date(2023, 04,14));
        emprestimo2.setDataPrevistaDeDevolucao(new Date(2023, 05,03));
        emprestimo2.setDataDeEntregaReal(new Date(2023, 05,03));

        emprestimos.add(emprestimo);
        emprestimos.add(emprestimo2);

        Exemplar exemplar = new Exemplar();
        exemplar.setCodigo(0235);
        exemplar.setCativa(true);
        exemplar.setEmprestada(true);
        exemplar.setEmprestimo(emprestimos);
        exemplares.add(exemplar);

        Livro livro = new Livro();
        livro.setTitulo("Java Deitel Aprenda programar");
        livro.setAutor("Deitel");
        livro.setEdicao(4);
        livro.setEditora("Pearson");
        livro.setAno(new Date(2010, 07, 10));
        livro.setExemplar(exemplares);

        System.out.println(usuario.toString());
        System.out.println(livro.toString());
        System.out.println(exemplar.toString());
        System.out.println(emprestimo.toString());
    }
}
