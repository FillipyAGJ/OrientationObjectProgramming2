package Exercicios.provaFinal.questao08;

public class Animal {
    private String nome;
    protected String Classe;

    public void falar() {
        System.out.println("fazer barulho");
    }
    public void imprime() {
        System.out.println("Nome: " + nome);
        falar();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
