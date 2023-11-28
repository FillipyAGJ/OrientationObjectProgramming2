package Exercicios.lista11.questao01;

// Classe Abstratas são feitas de classes pais, mas elas não podem ser feitas de objetos
// você não consegue criar um objeto "Avaliacao avaliacao = new Avaliacao().
// vai ser preciso extender (herança) para que ela seja usada.
public abstract class Avaliacao {
    private String nome;
    private double nota;

    public Avaliacao(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }
}
