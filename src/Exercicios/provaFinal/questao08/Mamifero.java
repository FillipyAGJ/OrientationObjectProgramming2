package Exercicios.provaFinal.questao08;

public class Mamifero extends Animal{
    private int velocidade;

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void correr() {
        System.out.println("Correr por " + velocidade + " Km/h");
    }
}
