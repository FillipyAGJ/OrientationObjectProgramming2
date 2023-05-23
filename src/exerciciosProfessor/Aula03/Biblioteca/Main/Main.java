package exerciciosProfessor.Aula03.Biblioteca.Main;

import exerciciosProfessor.Aula03.Biblioteca.Model.Editora;
import exerciciosProfessor.Aula03.Biblioteca.Model.Livros;

public class Main {
    public static void main(String[] args) {
        Livros livros = new Livros();
        livros.codigo = 6516;
        livros.descLivro = "livro de culinária";
        livros.ISBN = "ESASD51654";

        livros.editora = new Editora();
        livros.editora.codEditora = 1651;
        livros.editora.contao = "França Alimentos";
        livros.editora.razaoSocial = "França Alimentos ltda.";
        livros.editora.telefone = "(567) 55462-245";
    }
}
