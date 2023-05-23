package Exercicios.lista4.questao01;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(20);
        calculadora.valor2 = 15;
        calculadora.valor3 = 10;

        System.out.println(calculadora.somaTodosAtributos());
        System.out.println(calculadora.subtraiTodosAtributos());
        System.out.println(calculadora.divideTodosAtributos());
        System.out.println(calculadora.multiplicaTodosAtributos());
        System.out.println("------------------------------------------------");

        Calculadora calculadora2 = new Calculadora(10, 5);
        calculadora2.valor3 = 2.5F;
        System.out.println(calculadora2.somaTodosAtributos());
        System.out.println(calculadora2.subtraiTodosAtributos());
        System.out.println(calculadora2.divideTodosAtributos());
        System.out.println(calculadora2.multiplicaTodosAtributos());
        System.out.println("------------------------------------------------");

        Calculadora calculadora3 = new Calculadora(30,20,10);
        System.out.println(calculadora3.somaTodosAtributos());
        System.out.println(calculadora3.subtraiTodosAtributos());
        System.out.println(calculadora3.divideTodosAtributos());
        System.out.println(calculadora3.multiplicaTodosAtributos());
        System.out.println("------------------------------------------------");
    }
}
