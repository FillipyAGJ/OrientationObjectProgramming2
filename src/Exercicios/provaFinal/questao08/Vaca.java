package Exercicios.provaFinal.questao08;

public class Vaca extends Mamifero{
    private boolean permiteOrdenha;
    public void ordenhar() {
        if(permiteOrdenha) {
            System.out.println("ordenhando");
        }
    }
    public void falar() {
        System.out.println("muuuu");
    }
    public boolean isPermiteOrdenha() {
        return permiteOrdenha;
    }

    public void setPermiteOrdenha(boolean permiteOrdenha) {
        this.permiteOrdenha = permiteOrdenha;
    }
}
