package Exercicios.lista10.questao03;

public class Circulo extends Figura {
    private double raio;
    public Circulo(double raio, String cor) {
        this.raio = raio;
        setCor(cor);
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public double area() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double getDiametro() {
        return this.raio * 2;
    }

    @Override
    public String toString() {
        return "raio: " + raio;
    }
}
