package Exercicios.provaFinal.questao08;

public class Cachorro extends Mamifero{
    private boolean tipoLatido;
    public void setLatidoAlto() {
        tipoLatido = true;
    }

    public void setLatidoBaixo() {
        tipoLatido = false;
    }

    @Override
    public void falar() {
        System.out.println("au au!");
    }
}
