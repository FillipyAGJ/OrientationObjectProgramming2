package Exercicios.provaFinal.questao05;

import java.util.ArrayList;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();
        Editora editora = new Editora();
        Autor autor = new Autor();
        Categoria categoria = new Categoria();
        Exemplar exemplar = new Exemplar();

        categoria.setNome("fantasia");
        ArrayList<Categoria> categorias = new ArrayList<Categoria>();
        categorias.add(categoria);

        autor.setNome("Rick Riordan");
        ArrayList<Autor> autores = new ArrayList<Autor>();
        autores.add(autor);

        editora.setNome("Intrínseca");
        editora.setEmail("contato@intrinseca.com.br");
        editora.setObservacoes("bla bla bla");

        Multa multa = new Multa();

        multa.setValor(0);
        multa.setStatus(Status.PAGO);
        multa.setData_multa(10112022);

        Emprestimo emprestimo = new Emprestimo();

        Calendar dataEmprestimo = Calendar.getInstance();
        dataEmprestimo.set(Calendar.YEAR, 2023);
        dataEmprestimo.set(Calendar.MONTH, Calendar.JULY);
        dataEmprestimo.set(Calendar.DAY_OF_MONTH, 01);

        Calendar dataDevolucao = Calendar.getInstance();
        dataDevolucao.set(Calendar.YEAR, 2023);
        dataDevolucao.set(Calendar.MONTH, Calendar.JULY);
        dataDevolucao.set(Calendar.DAY_OF_MONTH, 14);

        Calendar dataDevolucaoReal = Calendar.getInstance();
        dataDevolucaoReal.set(Calendar.YEAR, 2023);
        dataDevolucaoReal.set(Calendar.MONTH, Calendar.JULY);
        dataDevolucaoReal.set(Calendar.DAY_OF_MONTH, 12);

        emprestimo.setMulta(multa);
        emprestimo.setStatus(Status.EMPRESTADO);
        emprestimo.setData_emprestimo(dataEmprestimo.getTime());
        emprestimo.setData_devolucao(dataDevolucao.getTime());
        emprestimo.setData_devoculacao_real(dataDevolucaoReal.getTime());
        multa.setEmprestimo(emprestimo);
        ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

        exemplar.setCodigo(56654);
        exemplar.setStatus(Status.EMPRESTADO);
        exemplar.setEmprestimo(emprestimo);
        ArrayList<Exemplar> exemplares = new ArrayList<Exemplar>();
        exemplares.add(exemplar);

        Calendar dataReserva = Calendar.getInstance();
        dataDevolucaoReal.set(Calendar.YEAR, 2023);
        dataDevolucaoReal.set(Calendar.MONTH, Calendar.JULY);
        dataDevolucaoReal.set(Calendar.DAY_OF_MONTH, 15);

        Reserva reserva = new Reserva();
        reserva.setData_reserva(dataReserva.getTime());
        reserva.setExemplar(exemplar);
        ArrayList<Reserva> reservas = new ArrayList<Reserva>();
        reservas.add(reserva);

        exemplar.setReservas(reservas);

        Usuario usuario = new Usuario();
        usuario.setNome("Fernando");
        usuario.setDocumento(321313);
        usuario.setEmail("emailfulano@email.com");
        usuario.setSenha("senha123");
        usuario.setRua("Quadra 17 conjunto c");
        usuario.setBairro("Gama sul");
        usuario.setCep(72410888);
        usuario.setCelular(654657464);
        usuario.setNivel("superior");
        usuario.setStatus(Status.MATRICULADO);
        usuario.setEmprestimos(emprestimos);
        usuario.setReservas(reservas);
        reserva.setUsuario(usuario);

        Calendar ano = Calendar.getInstance();
        ano.set(Calendar.YEAR, 2018);
        ano.set(Calendar.MONTH, Calendar.AUGUST);
        ano.set(Calendar.DAY_OF_MONTH, 20);

        livro.setTitulo("Percy Jackson e o ladrão de raios");
        livro.setResumo("Um artefato precioso foi roubado do Monte Olimpo e Percy é o principal suspeito. Para restaurar a paz, ele e seus amigos – jovens heróis modernos – terão de fazer mais do que capturar o verdadeiro ladrão: precisam elucidar uma traição mais ameaçadora que fúria dos deuses.");
        livro.setEdicao(1);
        livro.setAnoedicao(2014);
        livro.setPaginas(400);
        livro.setAno(ano.getTime());
        livro.setStatus(Status.EMPRESTADO);
        livro.setAutores(autores);
        livro.setEditora(editora);
        livro.setCategorias(categorias);
        ArrayList<Livro> livros = new ArrayList<Livro>();
        livros.add(livro);

        editora.setLivros(livros);
        categoria.setLivros(livros);
        exemplar.setLivro(livro);
    }
}
