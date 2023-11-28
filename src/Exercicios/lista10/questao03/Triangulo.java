package Exercicios.lista10.questao03;

public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura, String cor) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "base: "+ base + ", altura: " + altura;
    }
}
