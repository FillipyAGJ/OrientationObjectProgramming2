package Exercicios.lista10.questao02;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Paulo", "mat69875", 3000);
        Assistente assistente = new Assistente("Fillipy", "mat54987", 1200);
        Vendedor vendedor = new Vendedor("Arnaldo", "mat49846", 2000, 600);

        ArrayList<Funcionario> funcionarios= new ArrayList<Funcionario>();
        funcionarios.add(gerente);
        funcionarios.add(assistente);
        funcionarios.add(vendedor);

        double salarioTotal = 0;

        for(Funcionario funcionario : funcionarios) {
            salarioTotal += funcionario.calculaSalario();
        }

        System.out.println(salarioTotal);
    }
}
