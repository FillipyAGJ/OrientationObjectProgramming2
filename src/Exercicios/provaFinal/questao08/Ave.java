package Exercicios.provaFinal.questao08;

public class Ave extends Animal{
    @Override
    public void falar() {
        System.out.println("cantar");
    }

    public void voar(int voar) {
        System.out.println("voar por " + voar + " metros");
    }
}
