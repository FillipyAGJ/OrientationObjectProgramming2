package Exercicios.lista3.questao01;

public class Pessoa {
    private long id;
    private String nome;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String imprimeDados() {
        return "Pessoa:\nid: " + id + "\nnome: " + nome + "\n";
    }
}
