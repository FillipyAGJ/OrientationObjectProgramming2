package Exercicios.lista4.questao01;

public class Calculadora {
    public float valor1;
    public float valor2;
    public float valor3;

    Calculadora(float valor1) {
        this.valor1 = valor1;
    }
    Calculadora(float valor1, float valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    Calculadora(float valor1, float valor2, float valor3) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.valor3 = valor3;
    }
    public float somaTodosAtributos() {
        return valor1 + valor2 + valor3;
    }

    public float subtraiTodosAtributos() {
        return valor1 - valor2 - valor3;
    }

    public float divideTodosAtributos() {
        return valor1 / valor2 / valor3;
    }
    public float multiplicaTodosAtributos() {
        return valor1 * valor2 * valor3;
    }
}
