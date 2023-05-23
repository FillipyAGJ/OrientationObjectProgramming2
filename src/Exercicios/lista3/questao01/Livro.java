package Exercicios.lista3.questao01;

public class Livro {
    private long id;
    private String titulo;
    private String autor;
    private boolean emprestado;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public String imprimeDados() {
        return "Livro:\nid: " + id + "\ntitulo: " + titulo + "\nautor: " + autor + "\nemprestado: " + emprestado + "\n";
    }
}
